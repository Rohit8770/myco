package com.example.profileapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.profileapplication.Adapter.MyTeamAdapter;
import com.example.profileapplication.Response.Contact;
import com.example.profileapplication.Response.MyTeamListResponse;
import com.example.profileapplication.Utils.VariableBag;
import com.example.profileapplication.network.RestClient;
import com.example.profileapplication.network.Restcall;

import rx.Subscriber;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    LinearLayout layout;
    ImageView btn_menu;
    RecyclerView rcvMyTeamData;
    Restcall restcall;
    MyTeamAdapter myTeamAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.tv);
        layout = findViewById(R.id.layout);
        btn_menu = findViewById(R.id.btn_menu);
        rcvMyTeamData = findViewById(R.id.rcvMyTeamData);
        restcall = RestClient.createService(Restcall.class, VariableBag.BASE_URL, VariableBag.API_KEY);

        layout.setVisibility(View.GONE);
        tv.setVisibility(View.GONE);

        GetProfileMenuDetails();


        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setVisibility(View.VISIBLE);
                tv.setVisibility(View.VISIBLE);
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setVisibility(View.GONE);
                tv.setVisibility(View.GONE);
            }
        });
    }

    private void GetProfileMenuDetails() {

        restcall.GetProfileMenuDetails("getProfileMenuDetails","","","",
                        "","","","","","","")
                .subscribeOn(Schedulers.io())
                .observeOn(Schedulers.newThread())
                .subscribe(new Subscriber<Contact.ProfileListResponse>() {
                    @Override
                    public void onCompleted() {
                    }
                    @Override
                    public void onError(Throwable e) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Log.e("API Error", "Error: " + e.getLocalizedMessage());
                                //    Toast.makeText(getContext(), "No Internet", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                    @Override
                    public void onNext(Contact.ProfileListResponse listResponse) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if (listResponse.getStatus().equalsIgnoreCase(VariableBag.SUCCESS_CODE)){

                                    LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, RecyclerView.HORIZONTAL, false);
                                    rcvMyTeamData.setLayoutManager(layoutManager);
                                     myTeamAdapter = new MyTeamAdapter(MainActivity.this,listResponse.getPraiseList());
                                    rcvMyTeamData.setAdapter(myTeamAdapter);
                                }
                                Toast.makeText(MainActivity.this, listResponse.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                });
    }
}