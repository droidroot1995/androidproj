package com.linux.alex.neonxo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;


public class player0 extends Activity implements OnClickListener{


    int [][] p = {{-7,-7,-7},
            {-7,-7,-7},
            {-7,-7,-7}};
    ImageButton pole1,pole2,pole3,pole4,pole5,pole6,pole7,pole8,pole9,back;
    ImageView header1;
    int stage = 1;
    int c,l;
    int me = 1;

    public int Check()
    {
        if((p[0][0]+p[0][1]+p[0][2] == 3) || (p[1][0]+p[1][1]+p[1][2] == 3) ||(p[2][0]+p[2][1]+p[2][2] == 3)
                || (p[0][0]+p[1][0]+p[2][0] == 3) || (p[0][1]+p[1][1]+p[2][1] == 3) || (p[0][2]+p[1][2]+p[2][2] == 3)
                || (p[0][0]+p[1][1]+p[2][2] == 3) || (p[0][2]+p[1][1]+p[2][0] == 3))
        {
            header1.setImageResource(R.drawable.computer);
            for(int i = 0; i<3; i++)
                for(int j = 0; j<3; j++)
                    p[i][j] = 0;
            return 1;
        }
        else if((p[0][0]+p[0][1]+p[0][2] == 6) || (p[1][0]+p[1][1]+p[1][2] == 6) ||(p[2][0]+p[2][1]+p[2][2] == 6)
                || (p[0][0]+p[1][0]+p[2][0] == 6) || (p[0][1]+p[1][1]+p[2][1] == 6) || (p[0][2]+p[1][2]+p[2][2] == 6)
                || (p[0][0]+p[1][1]+p[2][2] == 6) || (p[0][2]+p[1][1]+p[2][0] == 6))
        {
            header1.setImageResource(R.drawable.playr);
            for(int i = 0; i<3; i++)
                for(int j = 0; j<3; j++)
                    p[i][j] = 0;
            return 2;
        }
        else if((p[0][0] != -7) && (p[0][1]!=-7) && (p[0][2] != -7)
                    && (p[1][0]!=-7) && (p[1][1] != -7) && (p[1][2]!=-7)
                    && (p[2][0] != -7) && (p[2][1]!=-7) && (p[2][2] != -7))
        {
            header1.setImageResource(R.drawable.nonep);
            for(int i = 0; i<3; i++)
                for(int j = 0; j<3; j++)
                    p[i][j] = 0;
            return 3;
        }
        return 0;
    }

    public void Comp()
    {
        if( stage == 1)
        {
            if(p[1][1] == -7)
            {
                p[1][1] = 1;
                stage++;
                pole5.setImageResource(R.drawable.x);

            }
            else if(p[0][0] == -7)
            {
                p[0][0] = 1;
                stage++;
                pole1.setImageResource(R.drawable.x);

            }
            else if (p[0][2] == -7)
            {
                p[0][2] = 1;
                stage++;
                pole3.setImageResource(R.drawable.x);
            }
            else if (p[2][0] == -7)
            {
                p[2][0] = 1;
                stage++;
                pole7.setImageResource(R.drawable.x);
            }
            else if (p[2][2] == -7)
            {
                p[2][2] = 1;
                stage++;
                pole9.setImageResource(R.drawable.x);
            }
        }
        else if(p[0][0]+p[0][1]+p[0][2] == -5)
        {
            if(p[0][0] == -7)
            {
                p[0][0] = 1;
                pole1.setImageResource(R.drawable.x);
            }
            if(p[0][1] == -7)
            {
                p[0][1] = 1;
                pole2.setImageResource(R.drawable.x);
            }
            if(p[0][2] == -7)
            {
                p[0][2] = 1;
                pole3.setImageResource(R.drawable.x);
            }
        }
        else if(p[0][0]+p[1][1]+p[2][2] == -5)
        {
            if(p[0][0] == -7)
            {
                p[0][0] = 1;
                pole1.setImageResource(R.drawable.x);
            }
            if(p[1][1] == -7)
            {
                p[1][1] = 1;
                pole5.setImageResource(R.drawable.x);
            }
            if(p[2][2] == -7)
            {
                p[2][2] = 1;
                pole9.setImageResource(R.drawable.x);
            }
        }
        else if(p[1][0]+p[1][1]+p[1][2] == -5)
        {
            if(p[1][0] == -7)
            {
                p[1][0] = 1;
                pole4.setImageResource(R.drawable.x);
            }
            if(p[1][1] == -7)
            {
                p[1][1] = 1;
                pole5.setImageResource(R.drawable.x);
            }
            if(p[1][2] == -7)
            {
                p[1][2] = 1;
                pole6.setImageResource(R.drawable.x);
            }
        }
        else if(p[2][0]+p[2][1]+p[2][2] == -5)
        {
            if(p[2][0] == -7)
            {
                p[2][0] = 1;
                pole7.setImageResource(R.drawable.x);
            }
            if(p[2][1] == -7)
            {
                p[2][1] = 1;
                pole8.setImageResource(R.drawable.x);
            }
            if(p[2][2] == -7)
            {
                p[2][2] = 1;
                pole9.setImageResource(R.drawable.x);
            }
        }
        else if(p[0][0]+p[1][0]+p[2][0] == -5)
        {
            if(p[0][0] == -7)
            {
                p[0][0] = 1;
                pole1.setImageResource(R.drawable.x);
            }
            if(p[1][0] == -7)
            {
                p[1][0] = 1;
                pole4.setImageResource(R.drawable.x);
            }
            if(p[2][0] == -7)
            {
                p[2][0] = 1;
                pole7.setImageResource(R.drawable.x);
            }
        }
        else if(p[0][1]+p[1][1]+p[2][1] == -5)
        {
            if(p[0][1] == -7)
            {
                p[0][1] = 1;
                pole2.setImageResource(R.drawable.x);
            }
            if(p[1][1] == -7)
            {
                p[1][1] = 1;
                pole5.setImageResource(R.drawable.x);
            }
            if(p[2][1] == -7)
            {
                p[2][1] = 1;
                pole8.setImageResource(R.drawable.x);
            }
        }
        else if(p[0][2]+p[1][2]+p[2][2] == -5)
        {
            if(p[0][2] == -7)
            {
                p[0][2] = 1;
                pole3.setImageResource(R.drawable.x);
            }
            if(p[1][2] == -7)
            {
                p[1][2] = 1;
                pole6.setImageResource(R.drawable.x);
            }
            if(p[2][2] == -7)
            {
                p[2][2] = 1;
                pole9.setImageResource(R.drawable.x);
            }
        }
        else if(p[0][2]+p[1][1]+p[2][0] == -5)
        {
            if(p[0][2] == -7)
            {
                p[0][2] = 1;
                pole3.setImageResource(R.drawable.x);
            }
            if(p[1][1] == -7)
            {
                p[1][1] = 1;
                pole5.setImageResource(R.drawable.x);
            }
            if(p[2][0] == -7)
            {
                p[2][0] = 1;
                pole7.setImageResource(R.drawable.x);
            }
        }
        else if(p[0][0]+p[0][1]+p[0][2] == -3)
        {
            if(p[0][0] == -7)
            {
                p[0][0] = 1;
                pole1.setImageResource(R.drawable.x);
            }
            if(p[0][1] == -7)
            {
                p[0][1] = 1;
                pole2.setImageResource(R.drawable.x);
            }
            if(p[0][2] == -7)
            {
                p[0][2] = 1;
                pole3.setImageResource(R.drawable.x);
            }
        }
        else if(p[0][0]+p[1][1]+p[2][2] == -3)
        {
            if(p[0][0] == -7)
            {
                p[0][0] = 1;
                pole1.setImageResource(R.drawable.x);
            }
            if(p[1][1] == -7)
            {
                p[1][1] = 1;
                pole5.setImageResource(R.drawable.x);
            }
            if(p[2][2] == -7)
            {
                p[2][2] = 1;
                pole9.setImageResource(R.drawable.x);
            }
        }
        else if(p[1][0]+p[1][1]+p[1][2] == -3)
        {
            if(p[1][0] == -7)
            {
                p[1][0] = 1;
                pole4.setImageResource(R.drawable.x);
            }
            if(p[1][1] == -7)
            {
                p[1][1] = 1;
                pole5.setImageResource(R.drawable.x);
            }
            if(p[1][2] == -7)
            {
                p[1][2] = 1;
                pole6.setImageResource(R.drawable.x);
            }
        }
        else if(p[2][0]+p[2][1]+p[2][2] == -3)
        {
            if(p[2][0] == -7)
            {
                p[2][0] = 1;
                pole7.setImageResource(R.drawable.x);
            }
            if(p[2][1] == -7)
            {
                p[2][1] = 1;
                pole8.setImageResource(R.drawable.x);
            }
            if(p[2][2] == -7)
            {
                p[2][2] = 1;
                pole9.setImageResource(R.drawable.x);
            }
        }
        else if(p[0][0]+p[1][0]+p[2][0] == -3)
        {
            if(p[0][0] == -7)
            {
                p[0][0] = 1;
                pole1.setImageResource(R.drawable.x);
            }
            if(p[1][0] == -7)
            {
                p[1][0] = 1;
                pole4.setImageResource(R.drawable.x);
            }
            if(p[2][0] == -7)
            {
                p[2][0] = 1;
                pole7.setImageResource(R.drawable.x);
            }
        }
        else if(p[0][1]+p[1][1]+p[2][1] == -3)
        {
            if(p[0][1] == -7)
            {
                p[0][1] = 1;
                pole2.setImageResource(R.drawable.x);
            }
            if(p[1][1] == -7)
            {
                p[1][1] = 1;
                pole5.setImageResource(R.drawable.x);
            }
            if(p[2][1] == -7)
            {
                p[2][1] = 1;
                pole8.setImageResource(R.drawable.x);
            }
        }
        else if(p[0][2]+p[1][2]+p[2][2] == -3)
        {
            if(p[0][2] == -7)
            {
                p[0][2] = 1;
                pole3.setImageResource(R.drawable.x);
            }
            if(p[1][2] == -7)
            {
                p[1][2] = 1;
                pole6.setImageResource(R.drawable.x);
            }
            if(p[2][2] == -7)
            {
                p[2][2] = 1;
                pole9.setImageResource(R.drawable.x);
            }
        }
        else if(p[0][2]+p[1][1]+p[2][0] == -3)
        {
            if(p[0][2] == -7)
            {
                p[0][2] = 1;
                pole3.setImageResource(R.drawable.x);
            }
            if(p[1][1] == -7)
            {
                p[1][1] = 1;
                pole5.setImageResource(R.drawable.x);
            }
            if(p[2][0] == -7)
            {
                p[2][0] = 1;
                pole7.setImageResource(R.drawable.x);
            }
        }
        else
        {
            while(me == 1) {
                l =(int)(9*Math.random()+1);
                if (l == 1 && p[0][0] == -7) {
                    p[0][0] = 1;
                    pole1.setImageResource(R.drawable.x);
                    me = 0;
                } else if (l == 2 && p[0][1] == -7) {
                    p[0][1] = 1;
                    pole2.setImageResource(R.drawable.x);
                    me = 0;
                } else if (l == 3 && p[0][2] == -7) {
                    p[0][2] = 1;
                    pole3.setImageResource(R.drawable.x);
                    me = 0;
                } else if (l == 4 && p[1][0] == -7) {
                    p[1][0] = 1;
                    pole4.setImageResource(R.drawable.x);
                    me = 0;
                } else if (l == 5 && p[1][1] == -7) {
                    p[1][1] = 1;
                    pole5.setImageResource(R.drawable.x);
                    me = 0;
                } else if (l == 6 && p[1][2] == -7) {
                    p[1][2] = 1;
                    pole6.setImageResource(R.drawable.x);
                    me = 0;
                } else if (l == 7 && p[2][0] == -7) {
                    p[2][0] = 1;
                    pole7.setImageResource(R.drawable.x);
                    me = 0;
                } else if (l == 8 && p[2][1] == -7) {
                    p[2][1] = 1;
                    pole8.setImageResource(R.drawable.x);
                    me = 0;
                } else if (l == 9 && p[2][2] == -7) {
                    p[2][2] = 1;
                    pole9.setImageResource(R.drawable.x);
                    me = 0;
                }
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player0);
        pole1 = (ImageButton) findViewById(R.id.pole1);
        pole2 = (ImageButton) findViewById(R.id.pole2);
        pole3 = (ImageButton) findViewById(R.id.pole3);
        pole4 = (ImageButton) findViewById(R.id.pole4);
        pole5 = (ImageButton) findViewById(R.id.pole5);
        pole6 = (ImageButton) findViewById(R.id.pole6);
        pole7 = (ImageButton) findViewById(R.id.pole7);
        pole8 = (ImageButton) findViewById(R.id.pole8);
        pole9 = (ImageButton) findViewById(R.id.pole9);
        header1 = (ImageView) findViewById(R.id.header1);
        back = (ImageButton) findViewById(R.id.back);

        Comp();

        pole1.setOnClickListener(this);
        pole2.setOnClickListener(this);
        pole3.setOnClickListener(this);
        pole4.setOnClickListener(this);
        pole5.setOnClickListener(this);
        pole6.setOnClickListener(this);
        pole7.setOnClickListener(this);
        pole8.setOnClickListener(this);
        pole9.setOnClickListener(this);
        back.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.pole1:
                if(p[0][0] == -7) {
                    p[0][0] = 2;
                    pole1.setImageResource(R.drawable.x0);
                    c = Check();
                    if(c == 0) {
                        me = 1;
                        Comp();
                        Check();
                    }
                }
                break;
            case R.id.pole2:
                if(p[0][1] == -7)
                {
                    p[0][1] = 2;
                    pole2.setImageResource(R.drawable.x0);
                    c = Check();
                    if(c == 0) {
                        me = 1;
                        Comp();
                        Check();
                    }
                }
                break;
            case R.id.pole3:
                if(p[0][2] == -7) {
                    p[0][2] = 2;
                    pole3.setImageResource(R.drawable.x0);
                    c = Check();
                    if(c == 0) {
                        me = 1;
                        Comp();
                        Check();
                    }
                }
                break;
            case R.id.pole4:
                if(p[1][0] == -7)
                {
                    p[1][0] = 2;
                    pole4.setImageResource(R.drawable.x0);
                    c = Check();
                    if(c == 0) {
                        me = 1;
                        Comp();
                        Check();
                    }
                }
                break;
            case R.id.pole5:
                if(p[1][1] == -7)
                {
                    p[1][1] = 2;
                    pole5.setImageResource(R.drawable.x0);
                    c = Check();
                    if(c == 0) {
                        me = 1;
                        Comp();
                        Check();
                    }
                }
                break;
            case R.id.pole6:
                if(p[1][2] == -7)
                {
                    p[1][2] = 2;
                    pole6.setImageResource(R.drawable.x0);
                    c = Check();
                    if(c == 0) {
                        me = 1;
                        Comp();
                        Check();
                    }
                }
                break;
            case R.id.pole7:
                if(p[2][0] == -7)
                {
                    p[2][0] = 2;
                    pole7.setImageResource(R.drawable.x0);
                    c = Check();
                    if(c == 0) {
                        me = 1;
                        Comp();
                        Check();
                    }

                }
                break;
            case R.id.pole8:
                if(p[2][1] == -7)
                {
                    p[2][1] = 2;
                    pole8.setImageResource(R.drawable.x0);
                    c = Check();
                    if(c == 0) {
                        me = 1;
                        Comp();
                        Check();
                    }

                }
                break;
            case R.id.pole9:
                if(p[2][2] == -7)
                {
                    p[2][2] = 2;
                    pole9.setImageResource(R.drawable.x0);
                    c = Check();
                    if(c == 0) {
                        me = 1;
                        Comp();
                        Check();
                    }
                }
                break;
            case R.id.back:
                Intent intent = new Intent(this, player1.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, player1.class);
        startActivity(intent);
        return;
    }
}
