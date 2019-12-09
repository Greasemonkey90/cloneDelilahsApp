package com.bunny;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.bunny.android.Alarm;
import com.bunny.android.delilahsapp.R;

import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }

        public void doThis(View v) {
            Toast.makeText(this,"Timer started",Toast.LENGTH_LONG).show();
            Button theStartButton = findViewById(R.id.button);
            AlarmManager alarm = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
            Intent intent2 = new Intent(MainActivity.this, Alarm.class);
            PendingIntent pi = PendingIntent.getBroadcast(this,0,intent2,0);
            Calendar time = Calendar.getInstance();
            time.setTimeInMillis(System.currentTimeMillis());
            time.add(Calendar.SECOND,10);
            alarm.set(AlarmManager.RTC_WAKEUP,time.getTimeInMillis(),pi);
            theStartButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                doThis(v);

                }

            });

        }

        }












