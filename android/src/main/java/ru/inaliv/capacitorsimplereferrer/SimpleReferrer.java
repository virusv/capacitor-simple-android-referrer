package ru.inaliv.capacitorsimplereferrer;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.getcapacitor.NativePlugin;
import android.preference.PreferenceManager;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

@NativePlugin()
public class SimpleReferrer extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Bundle extras = intent.getExtras();

        if (extras != null) {
            String referrerString = extras.getString("referrer");
            if (referrerString != null) {
                SharedPreferences sharedPreferences = context.getSharedPreferences("CapacitorStorage", Activity.MODE_PRIVATE);;
                Editor edit = sharedPreferences.edit();
                edit.putString("referrer", referrerString);
                edit.commit();
            }
        }
    }
}