package com.linux.alex.neonxo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


public class player1 extends Activity implements OnClickListener{

    ImageButton playerX, player0;
    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player1);
        playerX = (ImageButton) findViewById(R.id.playerX);
        player0 = (ImageButton) findViewById(R.id.player0);
        back = (ImageButton) findViewById(R.id.back);

        playerX.setOnClickListener(this);
        player0.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.playerX:
                Intent intent = new Intent(this, playerX.class);
                startActivity(intent);
                break;
            case R.id.player0:
                Intent intent2 = new Intent(this, player0.class);
                startActivity(intent2);
                break;
            case R.id.back:
                Intent intent1 = new Intent(this, MyActivity.class);
                startActivity(intent1);
                break;
        }
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, MyActivity.class);
        startActivity(intent);
        return;
    }
}
