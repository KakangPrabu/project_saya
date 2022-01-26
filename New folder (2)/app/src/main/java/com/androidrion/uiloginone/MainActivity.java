package com.androidrion.uiloginone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLogin:
                Toast.makeText(this, "Login button clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.txtSignUp:
                Toast.makeText(this, "Signin clicked!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.forgotPassword:
                Toast.makeText(this, "Forgot password clicked!", Toast.LENGTH_SHORT).show();
            default:
                break;
        }
    }
	
	
	
	
}