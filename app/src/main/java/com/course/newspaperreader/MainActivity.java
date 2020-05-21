package com.course.newspaperreader;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ShareActionProvider;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.MenuItemCompat;

import android.app.SearchManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    public void jugantor(View view){
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "BN1", "https://epaper.jugantor.com/" );
        startActivity( webviewIntent );
    }

    public void prothomalo(View view) {
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "BN2", "https://epaper.prothomalo.com/" );
        startActivity( webviewIntent );
    }

    public void ittefaq(View view) {
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "BN3", "http://epaper.ittefaq.com.bd/" );
        startActivity( webviewIntent );
    }

    public void kalerkontho(View view) {
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "BN4", "http://www.ekalerkantho.com/login" );
        startActivity( webviewIntent );
    }

    public void samakal(View view) {
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "BN5", "http://epaper.samakal.com" );
        startActivity( webviewIntent );
    }

    public void bdnews24(View view) {
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "ON1", "https://m.bdnews24.com/bn" );
        startActivity( webviewIntent );
    }

    public void jagonews24(View view) {
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "ON2", "https://www.jagonews24.com/m" );
        startActivity( webviewIntent );
    }

    public void bd24live(View view) {
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "ON3", "https://www.bd24live.com/bangla/" );
        startActivity( webviewIntent );
    }

    public void dailybangladesh(View view) {
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "ON4", "https://m.daily-bangladesh.com" );
        startActivity( webviewIntent );
    }

    public void banglatribune(View view) {
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "ON5", "https://www.banglatribune.com" );
        startActivity( webviewIntent );
    }

    public void dailyazadi(View view) {
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "LN1", "https://edainikazadi.net/" );
        startActivity( webviewIntent );
    }

    public void dailypurbokone(View view) {
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "LN2", "https://www.edainikpurbokone.net/" );
        startActivity( webviewIntent );
    }

    public void dailypurbanchal(View view) {
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "LN3", "https://epaper.purbanchal.com" );
        startActivity( webviewIntent );
    }

    public void surmatimes(View view) {
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "LN4", "https://www.surmatimes.com" );
        startActivity( webviewIntent );
    }

    public void dailycoxsbazar(View view) {
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "LN5", "http://www.dainikcoxsbazar.com/" );
        startActivity( webviewIntent );
    }

    public void dailystar(View view) {
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "IN1", "https://epaper.thedailystar.net/" );
        startActivity( webviewIntent );
    }

    public void independent(View view) {
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "IN2", "http://www.eindependentbd.com" );
        startActivity( webviewIntent );
    }

    public void bangladeshtoday(View view) {
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "IN3", "https://thebangladeshtoday.com/" );
        startActivity( webviewIntent );
    }

    public void sport360(View view) {
        Intent webviewIntent = new Intent( MainActivity.this,WebViewActivity.class );
        webviewIntent.putExtra( "SN1", "http://epaper.sport360.com/ePaper/" );
        startActivity( webviewIntent );
    }



    ////onBackPressed AlertDialog
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon( R.drawable.logo )
                .setTitle( R.string.app_name )
                .setMessage("Are you sure you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //finish();
                        MainActivity.this.onSuperBackPressed();
                        //super.onBackPressed();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();
    }
    public void onSuperBackPressed(){
        super.onBackPressed();
    }
}
