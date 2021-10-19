# Java_BottomNavigationView
bottomindicator , icon color , text-size , font-family

![image](https://user-images.githubusercontent.com/60017090/137572726-b59ec140-b51a-4e68-b53f-f8975d2aca27.png)

     <com.google.android.material.bottomnavigation.BottomNavigationView
        app:itemTextAppearanceActive="@style/BottomNavigationView.Active"
        app:itemTextAppearanceInactive="@style/BottomNavigationView"
        android:background="@color/white"
        android:id="@+id/bottomnavigationview"
        app:menu="@menu/bottommenu"
        app:itemTextColor="@color/bottomcolor"
        app:itemIconTint="@color/bottomcolor"
        app:labelVisibilityMode="labeled"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        app:itemBackground="@drawable/bottominidicator"
        android:layout_alignParentBottom="true"
        android:layout_marginBottom="5dp"
        ></com.google.android.material.bottomnavigation.BottomNavigationView>
        
        
   //res/color/bottomcolor     
        
        <selector xmlns:android="http://schemas.android.com/apk/res/android">
          <item android:color="#675858" android:state_checked="true"></item>
          <item android:color="@color/black" android:state_checked="false"></item>
        </selector>
        
  //res/values.themes/

         <style name="BottomNavigationView" parent="@style/TextAppearance.AppCompat.Caption">
           <item name="android:textSize">10sp</item>
           <item name="fontFamily">@font/fonnnnnn</item>
         </style>

         <style name="BottomNavigationView.Active" parent="@style/TextAppearance.AppCompat.Caption">
           <item name="android:textSize">11sp</item>
         </style>
         
         
//res/drawable/bottomindicator

    <?xml version="1.0" encoding="utf-8"?>
     <selector xmlns:android="http://schemas.android.com/apk/res/android">
      <item android:state_checked="true">
        <layer-list>
            <item android:gravity="bottom">
                <shape android:shape="rectangle">
                    <size
                        android:height="3dp"

                        />

                    <corners android:radius="150dp"></corners>
                    <solid android:color="@color/teal_700" />
                </shape>
            </item>
        </layer-list>
      </item>
    </selector>
