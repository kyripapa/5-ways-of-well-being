package com.example.a5ways;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;


public class Receiver extends BroadcastReceiver {
    Uri alarmSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

    public void onReceive(Context context, Intent intent) {

        System.out.println("Received");
        Bundle bundle = intent.getExtras();
        String data = bundle.getString("Social");
        System.out.println("Social: " + data);
        if (data.equals("Call")) {
            showNotification(context);
            System.out.println("Social Call: " + data);
        } else if (data.equals("Coffee")) {
            System.out.println("Social Coffee: " + data);
            showNotificationCoffee(context);
        }
        else if (data.equals("Call family")) {
            System.out.println("Social family: " + data);
            showNotificationFamily(context);
        }
        else if (data.equals("Diner")) {
            System.out.println("Social diner: " + data);
            showNotificationDiner(context);
        }
        else if (data.equals("Break")) {
            System.out.println("Social diner: " + data);
            showNotificationBreak(context);
        }
        else if (data.equals("Read")) {
            showNotificationRead(context);
        } else if (data.equals("Article")) {
            System.out.println("Social Coffee: " + data);
            showNotificationArticle(context);

        } else if (data.equals("Research")) {
            System.out.println("Social Coffee: " + data);
            showNotificationResearch(context);

        }else if (data.equals("Learn new")) {
            showNotificationLearnNew(context);

        }else if (data.equals("Movie")) {
            System.out.println("Social Coffee: " + data);
            showNotificationMovie(context);

        }
        else if (data.equals("Outdoors")) {
            showNotificationOutdoors(context);
        } else if (data.equals("Bike")) {
            System.out.println("Social Coffee: " + data);
            showNotificationBike(context);

        } else if (data.equals("Run")) {
            System.out.println("Social Coffee: " + data);
            showNotificationRun(context);

        }else if (data.equals("Stairs")) {
            showNotificationStairs(context);

        }else if (data.equals("Gym")) {
            System.out.println("Social Coffee: " + data);
            showNotificationGym(context);

        }
        else if (data.equals("Adopt")) {
            showNotificationAdopt(context);
        } else if (data.equals("Kind")) {
            showNotificationKind(context);

        } else if (data.equals("Advice")) {
            showNotificationAdvice(context);

        }else if (data.equals("Give stuff")) {
            showNotificationGiveStuff(context);

        }else if (data.equals("Buy drink")) {
            System.out.println("Buy drink: " + data);
            showNotificationBuyDrink(context);
        }else if (data.equals("View")) {
            System.out.println("View: " + data);
            showNotificationView(context);
        }else if (data.equals("Drink Coffee")) {
            System.out.println("Drink Coffee: " + data);
            showNotificationDrinkCoffee(context);
        }else if (data.equals("Odd")) {
            System.out.println("Odd: " + data);
            showNotificationOdd(context);
        }else if (data.equals("Look around")) {
            System.out.println("Look around: " + data);
            showNotificationLookAround(context);
        }else if (data.equals("Walk")) {
            System.out.println("Walk: " + data);
            showNotificationWalk(context);
        }
    }

    public void showNotification(Context context) {

        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                         .setContentTitle("5 ways of well being")
                        .setSound(alarmSound)
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
                        .setSound(alarmSound)
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
                        .setSound(alarmSound)
                        .setContentText("Πήρες τηλέφωνο σε κάποιον από την οικογένεια σου σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 002;
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
                        .setSound(alarmSound)
                        .setContentText("Πήρες δείπνο με το σύντροφό σου σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 003;
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
                        .setSound(alarmSound)
                        .setContentText("Έκανες διάλειμμα με τους συναδέλφους σου;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 004;
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
                        .setSound(alarmSound)
                        .setContentText("Έκανες βόλτα έξω από το σπίτι;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 005;
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
                        .setSound(alarmSound)
                        .setContentText("Πήγες στη δοθλειά με τα πόδια ή με το ποδήλατο;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 006;
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
                        .setSound(alarmSound)
                        .setContentText("Πήγες για τρέξιμο σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 007;
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
                        .setSound(alarmSound)
                        .setContentText("Πήρες τις σκάλες στη δουλειά σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 8;
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
                        .setSound(alarmSound)
                        .setContentText("Πήγες γυμναστήριο σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 9;
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
                        .setSound(alarmSound)
                        .setContentText("Διάβασες βιβλίο σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 010;
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
                        .setSound(alarmSound)
                        .setContentText("Διάβασες κάποιο άρθρο σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 011;
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
                        .setSound(alarmSound)
                        .setContentText("Έκανες έρευνα σχετικά με τη δουλειά σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 012;
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
                        .setSound(alarmSound)
                        .setContentText("Έμαθες κάτι καινούριο σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 013;
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
                        .setSound(alarmSound)
                        .setContentText("Είδες κάποια επιμορφωτική ταινία σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 014;
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
                        .setSound(alarmSound)
                        .setContentText("Βοήθησες τα αδέσποτα σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 015;
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
                        .setSound(alarmSound)
                        .setContentText("Ήσουν ευγενικός με τους γύρω σου σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 016;
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
                        .setSound(alarmSound)
                        .setContentText("Έδωσες συμβουλή σε συνάδελφο σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 017;
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
                        .setSound(alarmSound)
                        .setContentText("Έδωσες πράγματα που δε χρειάζεσαι;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 1;
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
                        .setSound(alarmSound)
                        .setContentText("Κέρασες καφέ σε κάποιον;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 2;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationView(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                         .setContentTitle("5 ways of well being")
                        .setSound(alarmSound)
                        .setContentText("Κοίταξες τη θέα έξω από το παράθυρο σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 2;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationDrinkCoffee(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                         .setContentTitle("5 ways of well being")
                        .setSound(alarmSound)
                        .setContentText("Ήπιες καφέ στο μπαλκόνι σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 2;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationOdd(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                         .setContentTitle("5 ways of well being")
                        .setSound(alarmSound)
                        .setContentText("Πρόσεξες κάποια περίεργη συμπεριφορά σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 2;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationLookAround(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                         .setContentTitle("5 ways of well being")
                        .setSound(alarmSound)
                        .setContentText("Έκατσες σε ένα παγκάκι να κοιτάξεις τους γύρω σου σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 2;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
    public void showNotificationWalk(Context context) {
        android.support.v4.app.NotificationCompat.Builder mBuilder =
                new android.support.v4.app.NotificationCompat.Builder(context)
                        .setSmallIcon(R.drawable.notify)
                         .setContentTitle("5 ways of well being")
                        .setSound(alarmSound)
                        .setContentText("Περπάτησες και παρατήρησες το περιβάλλον σου σήμερα;").setAutoCancel(true);
        Intent intent = new Intent(context, ActionsPage.class);
        PendingIntent resultPendingIntent =
                PendingIntent.getActivity(
                        context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        int mNotificationId = 2;
        NotificationManager mNotifyMgr =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
// Builds the notification and issues it.
        mNotifyMgr.notify(mNotificationId, mBuilder.build());
        System.out.println("called");

    }
}
