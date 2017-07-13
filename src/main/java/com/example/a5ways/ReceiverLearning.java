package com.example.a5ways;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;


public class ReceiverLearning extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        System.out.println("Received");
        Bundle bundle = intent.getExtras();

        String dataLearning = bundle.getString("Learning");
        if (dataLearning.equals("Read")) {
            showNotificationRead(context);
        } else if (dataLearning.equals("Article")) {
            System.out.println("Social Coffee: " + dataLearning);
            showNotificationArticle(context);

        } else if (dataLearning.equals("Research")) {
            System.out.println("Social Coffee: " + dataLearning);
            showNotificationResearch(context);

        }else if (dataLearning.equals("Learn new")) {
            showNotificationLearnNew(context);

        }else if (dataLearning.equals("Movie")) {
            System.out.println("Social Coffee: " + dataLearning);
            showNotificationMovie(context);

        }


    }

    public void showNotification(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Πήρες τηλέφωνο σε φίλο σου σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");
    }

    public void showNotificationCoffee(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Ήπιες καφέ με φίλου σου σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, Social_1.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationFamily(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Πήρες τηλέφωνο σε κάποιον από την οικογένεια σου σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");
    }
    public void showNotificationDiner(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Πήρες δείπνο με το σύντροφό σου σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");
    }

    public void showNotificationBreak(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Έκανες διάλειμμα με τους συναδέλφους σου;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationOutdoors(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Έκανες βόλτα έξω από το σπίτι;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationBike(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Πήγες στη δοθλειά με τα πόδια ή με το ποδήλατο;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationRun(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Πήγες για τρέξιμο σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationStairs(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Πήρες τις σκάλες στη δουλειά σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationGym(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Πήγες γυμναστήριο σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationRead(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Διάβασες βιβλίο σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationArticle(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Διάβασες κάποιο άρθρο σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationResearch(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Έκανες έρευνα σχετικά με τη δουλειά σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationLearnNew(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Έμαθες κάτι καινούριο σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationMovie(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Είδες κάποια επιμορφωτική ταινία σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationAdopt(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Βοήθησες τα αδέσποτα σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationKind(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Ήσουν ευγενικός με τους γύρω σου σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationAdvice(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Έδωσες συμβουλή σε συνάδελφο σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationGiveStuff(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Έδωσες πράγματα που δε χρειάζεσαι;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationBuyDrink(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                        .setContentTitle("5 ways of well being")
                        .setContentText("Κέρασες καφέ σε κάποιον;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 001;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
}
