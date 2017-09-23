package com.example.anuj.myapplication.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.example.anuj.myapplication.R;
import com.example.anuj.myapplication.notiactivity;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import org.json.JSONObject;

/**
 * Created by anuj on 9/22/17.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService {
    public static final String TAG="FCM Service";

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage){
        //Handel FCM messages here
        Log.d(TAG, "From: " + remoteMessage.getFrom());
        Log.d(TAG, "Notification Message Body: " + remoteMessage.getNotification().getTitle());
        if(remoteMessage.getNotification()!=null){
            //Intent intent=new Intent(this,notiactivity.class);
            //PendingIntent pendingIntent=PendingIntent.getActivity(this,(int)System.currentTimeMillis(),intent,0);
            /*
            Notification notification=new Notification.Builder(this)
                    .setContentTitle(remoteMessage.getNotification().getTitle())
                    .setContentText(remoteMessage.getNotification().getBody())
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setContentIntent(pendingIntent)
                    .setAutoCancel(true)
                    .build();
            NotificationManager notificationManager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
            notificationManager.notify(0,notification);
            */

            sendnotification(remoteMessage.getNotification().getTitle(),remoteMessage.getNotification().getBody());

        }





    }

    private void sendnotification(String notification_title, String notification_body){
        Intent intent=new Intent(this,notiactivity.class);
        PendingIntent pendingIntent=PendingIntent.getActivity(this,(int)System.currentTimeMillis(),intent,0);
        Uri defaultSoundUri= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        Notification notification=new Notification.Builder(this)
                .setContentTitle(notification_title)
                .setContentText(notification_body)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
                .build();
        NotificationManager notificationManager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(0,notification);

    }
}
