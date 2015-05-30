package com.project.tianle.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    Button btn_ss;
    Button btn_sa;
    Button btn_la;
    Button btn_bib;
    Button btn_xr;
    Button btn_moa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_ss = (Button) findViewById(R.id.btn_ss);
        btn_sa = (Button) findViewById(R.id.btn_sa);
        btn_la = (Button) findViewById(R.id.btn_la);
        btn_bib = (Button) findViewById(R.id.btn_bib);
        btn_xr = (Button) findViewById(R.id.btn_xr);
        btn_moa = (Button) findViewById(R.id.btn_moa);

        btn_ss.setOnClickListener(this);
        btn_sa.setOnClickListener(this);
        btn_la.setOnClickListener(this);
        btn_bib.setOnClickListener(this);
        btn_xr.setOnClickListener(this);
        btn_moa.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_ss:
                Toast.makeText(MainActivity.this, "This button will launch Spotify Streamer!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_sa:
                Toast.makeText(MainActivity.this, "This button will launch Scores App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_la:
                Toast.makeText(MainActivity.this, "This button will launch Library App!!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_bib:
                Toast.makeText(MainActivity.this, "This button will launch Build It Bigger!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_xr:
                Toast.makeText(MainActivity.this, "This button will launch XYZ Reader!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_moa:
                Toast.makeText(MainActivity.this, "This button will launch My Own App!", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}
