package com;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.bunny.android.delilahsapp.R;

import java.util.Calendar;

//This is what I have added so far. I am not done testing or adding.
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    ArrayAdapter<CharSequence> spinnerAdapter;
    Spinner spinner;
    Integer whichTime;
    Calendar time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerAdapter = ArrayAdapter.createFromResource(getApplicationContext(), R.array.time_choices, R.layout.spinner_style);
        spinner = findViewById(R.id.timeSpinner);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(spinnerAdapter);
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    public void onNothingSelected(AdapterView<?> arg) {

    }

    public Integer getTimeLimit() {
        whichTime = spinner.getSelectedItemPosition();
        return whichTime;

    }

    public void doThis(View v) {
        Toast.makeText(this, "Timer started", Toast.LENGTH_LONG).show();
        // Button theStartButton = findViewById(R.id.button);
        AlarmManager alarm = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent2 = new Intent(MainActivity.this, Alarm.class);
        PendingIntent pi = PendingIntent.getBroadcast(this, 0, intent2, 0);
        time = Calendar.getInstance();
        time.setTimeInMillis(System.currentTimeMillis());
        timeSelection();
        alarm.set(AlarmManager.RTC_WAKEUP, time.getTimeInMillis(), pi);
        whichTime = null;

        // theStartButton.setOnClickListener(new View.OnClickListener() {
        //  @Override
        // public void onClick(View v) {

        // }

        //});

    }
//I don't think I need this method but I also haven't finished testing everything yet.
    //Keeping this here until i'm sure I don't need it. I added it originally but it wasn't what
    //I was intending to do.
    public void click(View view) {
        timeSelection();
        doThis(view);
        whichTime = null;
    }

    public void timeSelection() {
        getTimeLimit();
        if (whichTime == 0) {
            Toast.makeText(this, "Please select a valid time", Toast.LENGTH_LONG).show();
        }
        if (whichTime == 1) {
            //I'm using seconds for now in purposes of not having to wait that long to see if
            //different times work.
            time.add(Calendar.SECOND, 10);
        }
        if (whichTime == 2) {
            time.add(Calendar.SECOND, 20);
        }
        if (whichTime == 3) {
            time.add(Calendar.SECOND, 30);
        }
        if (whichTime == 4) {
            time.add(Calendar.SECOND, 40);
        }
        if (whichTime == 5){
            time.add(Calendar.SECOND, 50);
    }
        if(whichTime == 6){
            time.add(Calendar.SECOND,60);
        }
}

        }












