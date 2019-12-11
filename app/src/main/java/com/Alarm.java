package com;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Alarm extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        Intent theIntent = new Intent(context, calculating.class);
        theIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
        context.startActivity(theIntent);


    }

}
