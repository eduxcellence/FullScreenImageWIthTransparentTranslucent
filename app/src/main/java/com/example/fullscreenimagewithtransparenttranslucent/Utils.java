package com.example.fullscreenimagewithtransparenttranslucent;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class Utils {

    public static void transparentStatusAndNavigation(Activity activity) {

        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT < 21) {
            setWindowFlag(activity,View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN, true);
        }
        if (Build.VERSION.SDK_INT >= 19) {
            //change status bar icon colors......
            activity.getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            //change transparent or other color here status  bar color
            setWindowFlag(   activity,View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN, false);
            activity.getWindow().setStatusBarColor(0);//..color transaprent
            activity.getWindow().setNavigationBarColor(-7829368);//..color gray 

        }


    }

    private static void setWindowFlag(Activity activity, final int i, boolean z) {
        Window window =    activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (z) {
            attributes.flags = i | attributes.flags;
        } else {
            attributes.flags = (i ^ -1) & attributes.flags;
        }
        window.setAttributes(attributes);
    }
}
