package com.example.android.myappportfolio;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public int[] id = new int[6];
    Button[] btnList = new Button[6];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources r = getResources();
        String name = getPackageName();

        for (int i = 1; i < 7; i++) {
            id[i - 1] = r.getIdentifier("button" + i, "id", name);
            btnList[i - 1] = (Button) findViewById(id[i - 1]);
            btnList[i - 1].setOnClickListener(this);
        }
    }

    public void onClick(View v) {
        // Show toast in response to button click
        Context context = getApplicationContext();
        String toastAppName = null;

        // Assign different responses to toasts called by different buttons
        if (v.getId() == id[0]) {
            toastAppName = getString(R.string.first_app);
        } else if (v.getId() == id[1]) {
            toastAppName = getString(R.string.second_app);
        } else if (v.getId() == id[2]) {
            toastAppName = getString(R.string.third_app);
        } else if (v.getId() == id[3]) {
            toastAppName = getString(R.string.fourth_app);
        } else if (v.getId() == id[4]) {
            toastAppName = getString(R.string.fifth_app);
        } else if (v.getId() == id[5]) {
            toastAppName = getString(R.string.sixth_app);
        }
        CharSequence text = "This button will launch my " + toastAppName + " app!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        }



}
