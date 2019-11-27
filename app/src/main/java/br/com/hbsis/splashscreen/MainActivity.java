package br.com.hbsis.splashscreen;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RelativeLayout maincontent;
    LinearLayout mainmenu;
    Button btnMenu;
    Animation fromtop, frombottom;
    ImageView avatar;
    TextView nomeUser, email, tituloSobre, version;
    Button btEdit, btFavoritos, btConfig, btSobre, btSair;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        // getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        //Button
        btEdit = findViewById(R.id.btEdit);
        btFavoritos = findViewById(R.id.btFavoritos);
        btConfig = findViewById(R.id.btConfig);
        btSobre= findViewById(R.id.btSobre);
        btSair= findViewById(R.id.btSair);

        //TextView
        nomeUser = findViewById(R.id.nomeUser);
        email = findViewById(R.id.email);
        tituloSobre = findViewById(R.id.tituloSobre);
        version = findViewById(R.id.version);

        //ImageView
        avatar = findViewById(R.id.avatar);

        //Animações
        fromtop = AnimationUtils.loadAnimation(this,R.anim.fromtop);
        frombottom = AnimationUtils.loadAnimation(this,R.anim.frombottom);

        //Botão menuAsset pra testes
       btnMenu = findViewById(R.id.btnmenu);

       maincontent  = findViewById(R.id.maincontent);
       mainmenu = findViewById(R.id.mainmenu);

       //Evento de click para chamar e fechar a barra
       btnMenu.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               maincontent.animate().translationX(0);
               mainmenu.animate().translationX(0);

               //Iniciando as animações

               // de baixo
               btEdit.startAnimation(frombottom);
               btFavoritos.startAnimation(frombottom);
               btConfig.startAnimation(frombottom);
               btSobre.startAnimation(frombottom);
               btSair.startAnimation(frombottom);
               tituloSobre.startAnimation(frombottom);
               version.startAnimation(frombottom);

               //de cima
               avatar.startAnimation(fromtop);
               nomeUser.startAnimation(fromtop);
               email.startAnimation(fromtop);

           }
       });

        maincontent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maincontent.animate().translationX(-735);
                mainmenu.animate().translationX(-735);

            }
        });
    }
}
