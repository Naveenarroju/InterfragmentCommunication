package com.example.narroju.interfragmentcommunication;


import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void responder(String data) {
        FragmentManager fragmentManager = getFragmentManager();
        fragmentB f2 = (fragmentB) fragmentManager.findFragmentById(R.id.fragment_b);
        f2.changeText(data);
    }
}
