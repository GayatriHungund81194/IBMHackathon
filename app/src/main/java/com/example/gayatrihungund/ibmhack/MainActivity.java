package com.example.gayatrihungund.ibmhack;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import com.ibm.watson.developer_cloud.conversation.v1.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void wildFireOnClick(View view){
        Intent intent = new Intent(MainActivity.this, WildFire.class);
        startActivity(intent);
    }

    public void earthquakesOnClick(View view){
        Intent intent = new Intent(MainActivity.this, Earthquakes.class);
        startActivity(intent);

    }


    public void floodsOnClick(View view){
        Intent intent = new Intent(MainActivity.this, Floods.class);
        startActivity(intent);

    }


    public void hurricanesOnClick(View view){
        Intent intent = new Intent(MainActivity.this, Hurricanes.class);
        startActivity(intent);

    }

    public void Watson(View view){
        Intent intent = new Intent(MainActivity.this, Watson.class);
        startActivity(intent);

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
}
