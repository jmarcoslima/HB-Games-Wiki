package br.com.hbsis.splashscreen;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RelativeLayout maincontent;
    LinearLayout mainmenu;
    Button btnMenu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();

       btnMenu = findViewById(R.id.btnmenu);

       maincontent  = findViewById(R.id.maincontent);
       mainmenu = findViewById(R.id.mainmenu);

       btnMenu.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               maincontent.animate().translationX(780);
               mainmenu.animate().translationX(0);
           }
       });
    }
}
