package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.core.view.GravityCompat;



import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;

public class Navbar extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navbar);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton)   findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }
       public void viewgallery(View view){
        Intent intent=new Intent(this,Gallery.class);
        startActivity(intent);
    }
    public void locations(View view){
        Intent intent=new Intent(this,Location.class);
        startActivity(intent);
    }
    public void testimonials(View view){
        Intent intent=new Intent(this,Test.class);
        startActivity(intent);
    }
    public void contactus(View view){
        Intent intent=new Intent(this,ContactUs.class);
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navbar, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("Statementwithemptybody")
    @Override

    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.viewgallery) {
            Intent intent=new Intent(this,Gallery.class);
            startActivity(intent);
        } else if (id == R.id.ourlocations) {
                    Intent intent=new Intent(this,Location.class);
                    startActivity(intent);
        } else if (id == R.id.testimonials) {
            Intent intent=new Intent(this,Test.class);
            startActivity(intent);
        } else if (id == R.id.contactus) {
            Intent intent=new Intent(this,ContactUs.class);
            startActivity(intent);
        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }
        DrawerLayout drawer =(DrawerLayout)findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
