package com.example.android.serviceexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by amrizal.zainuddin on 10/8/2015.
 */
public class MyStartServiceReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent service = new Intent(context, LocalWordService.class);
        context.startService(service);
    }
}
