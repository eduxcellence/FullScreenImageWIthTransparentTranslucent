package com.example.fullscreenimagewithtransparenttranslucent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

/**
 * Created by Akash Kumar  of Eduxcellence on 02/12/2020.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //call here this method for full screen transparent theme
        Utils.transparentStatusAndNavigation(MainActivity.this);
        setContentView(R.layout.activity_main);
    }


}