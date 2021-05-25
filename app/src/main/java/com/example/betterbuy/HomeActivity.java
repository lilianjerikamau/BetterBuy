package com.example.betterbuy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.twitter.sdk.android.core.SessionManager;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.core.TwitterSession;

public class HomeActivity extends AppCompatActivity {
    TweeterApi client = TweeterClient.getClient();



    Button logoutBtn;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Firebase Auth
        mAuth = FirebaseAuth.getInstance();
        //Logout Btn
        logoutBtn = findViewById(R.id.logout_button);

        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SessionManager<TwitterSession> sessionManager = TwitterCore.getInstance().getSessionManager();
                if (sessionManager.getActiveSession() != null){
                    sessionManager.clearActiveSession();
                    mAuth.signOut();
                }

                mAuth.signOut();
                updateUI();
            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if (currentUser == null) {
            updateUI();
        }
    }

    private void updateUI() {
        Toast.makeText(HomeActivity.this, "You're logged out", Toast.LENGTH_LONG);

        Intent mainActivity = new Intent(HomeActivity.this, LoginActivity.class);
        startActivity(mainActivity);
        finish();
    }
}