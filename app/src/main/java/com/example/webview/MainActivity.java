package com.example.webview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
private BottomNavigationView bottomNavigationView;
private FragmentManager fm;
private FragmentTransaction ft;
private Frag1 frag1;
private Frag2 frag2;
//추가한 내용
//두번째 추가 내용

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

bottomNavigationView=findViewById(R.id.bottomNavi);
bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){

            case R.id.calander:setFrag(0);break;
            case R.id.art_track:setFrag(1);break;


        }
return false;

    }
});
frag1=new Frag1();
frag2=new Frag2();
setFrag(0);



















    }//프래그먼트 교체가 일어나는 실행문이다.
    private  void setFrag(int n){
        fm=getSupportFragmentManager();
        ft=fm.beginTransaction();
switch (n){
    case 0:ft.replace(R.id.main_frame,frag1);
    ft.commit();
    break;
    case 1:ft.replace(R.id.main_frame,frag2);
        ft.commit();
        break;


}

    }



}