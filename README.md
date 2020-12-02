# FullScreenImageWIthTransparentTranslucent
Completely Transparent StatusBar for all Devices
## Making activity full screen with status bar on top of it.


##Just Call This Static Method after on Create 
/
..
..

 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //call here this method for full screen transparent theme
        Utils.transparentStatusAndNavigation(MainActivity.this);
        setContentView(R.layout.activity_main);
    }
    
    
    .
    .
    /


#Functions Used to Create Full screen theme .Find ##Utils Class## in Project 
 
 
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
        
