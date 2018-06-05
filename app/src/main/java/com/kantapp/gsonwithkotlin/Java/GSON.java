package com.kantapp.gsonwithkotlin.Java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kantapp.gsonwithkotlin.R;

import java.util.List;

public class GSON extends AppCompatActivity
{

    private String TAG="GSON.java";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson);

        getAnimeList();
        getContactDetails();
    }
    private void getAnimeList()
    {
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        StringRequest stringRequest= new StringRequest(Request.Method.GET, "http://gomcineplex.com/data/anime/dailyHD.json", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Gson gson=new Gson();

                List<DailyAnime> dailyAnimeList=gson.fromJson(response,new TypeToken<List<DailyAnime>>(){}.getType());

                Toast.makeText(GSON.this, ""+dailyAnimeList.size(), Toast.LENGTH_SHORT).show();
                Log.d(TAG, "onResponse: "+dailyAnimeList);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.d(TAG, "onResponse: "+error);
            }
        });

        requestQueue.add(stringRequest);
    }

    private void getContactDetails()
    {
        RequestQueue requestQueue=Volley.newRequestQueue(this);
        StringRequest stringRequest=new StringRequest(Request.Method.GET, "https://api.androidhive.info/contacts/", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Gson gson=new Gson();

                Contacts contacts=gson.fromJson(response,Contacts.class);

                Log.d(TAG, "onResponse: "+contacts.contact.size());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(TAG, "onResponse: "+error);
            }
        });
        requestQueue.add(stringRequest);

    }
}
