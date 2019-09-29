package com.example.myapplication222;

import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator2 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    double var1, var2;

    EditText a;
    EditText b;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5, b6, b7, b8, b9, b10;
    TextView Res;

    public DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator2);

        b1 = (Button) findViewById(R.id.Add);
        b2 = (Button) findViewById(R.id.Sub);
        b3 = (Button) findViewById(R.id.Mul);
        b4 = (Button) findViewById(R.id.Div);
        a = (EditText) findViewById(R.id.editText1);
        b = (EditText) findViewById(R.id.editText2);
        Res = (TextView) findViewById(R.id.textView);
        b5 = (Button) findViewById(R.id.Sine);
        b6 = (Button) findViewById(R.id.Cos);
        b7 = (Button) findViewById(R.id.Tan);
        b8 = (Button) findViewById(R.id.Pow);
        b9 = (Button) findViewById(R.id.Sqrt);
        b10 = (Button) findViewById(R.id.Crt);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(a.getText() + "");
                var2 = Double.parseDouble(b.getText() + "");
                Res.setText(var1 + var2 + "");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(a.getText() + "");
                var2 = Double.parseDouble(b.getText() + "");
                Res.setText(var1 - var2 + "");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(a.getText() + "");
                var2 = Double.parseDouble(b.getText() + "");
                Res.setText(var1 * var2 + "");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(a.getText() + "");
                var2 = Double.parseDouble(b.getText() + "");
                Res.setText(var2 == 0 ? "unsolvable" : var1 / var2 + "");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var1 = Double.parseDouble(b.getText() + "");

                double degrees = var1;

                double radians = Math.toRadians(degrees);

                double sinValue = Math.sin(radians);

                a.setText("sin()" + "");


                Res.setText(sinValue + "");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var1 = Double.parseDouble(b.getText() + "");

                double degrees = var1;

                double radians = Math.toRadians(degrees);

                double cosValue = Math.cos(radians);

                a.setText("cos()" + "");
                Res.setText(cosValue + "");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var1 = Double.parseDouble(b.getText() + "");

                double degrees = var1;

                double radians = Math.toRadians(degrees);

                double tanValue = Math.tan(radians);

                a.setText("tan()" + "");
                Res.setText(tanValue + "");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(a.getText() + "");
                var2 = Double.parseDouble(b.getText() + "");
                double result = var1;

                for (int i = 1; i < var2; i++) {
                    result = result * var1;
                }

                Res.setText(result + "");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(b.getText() + "");
                a.setText("sqrt()" + "");
                Res.setText(Math.sqrt(var1) + "");
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(b.getText() + "");
                a.setText("cbrt()" + "");
                Res.setText(Math.cbrt(var1) + "");
            }
        });


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calculator2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.scal) {

        }
        else if (id == R.id.ccal) {

        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

