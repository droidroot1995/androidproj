package com.linux.alex.neonxo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;


public class MyActivity extends Activity implements OnClickListener {

    Button player;
    Button players;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        player = (Button) findViewById(R.id.player);
        players = (Button) findViewById(R.id.players);
        player.setOnClickListener(this);
        players.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        switch(v.getId()) {
            case R.id.player:
                Intent intent = new Intent(this, player1.class);
                startActivity(intent);
                break;
            case R.id.players:
                Intent intent1 = new Intent(this, players.class);
                startActivity(intent1);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MyActivity.this);
        alertDialog.setTitle("Выйти?");

        alertDialog.setMessage("Вы действительно хотите выйти?");

        alertDialog.setPositiveButton("Да", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog,int which) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

        alertDialog.setNegativeButton("Нет", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        alertDialog.show();
        return;

    }

}
