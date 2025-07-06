package com.example.assignment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class facebook_activity extends AppCompatActivity {
    EditText emailEditText ;
    EditText passwordEditText ;
    Button logInButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_facebook);

        emailEditText = findViewById(R.id.emailTextField);
        passwordEditText = findViewById(R.id.passwordTextField);
        logInButton = findViewById(R.id.logInButton);
        logInButton.setOnClickListener(
                view ->logIn(emailEditText,passwordEditText)
        );




    }

    public void logIn(EditText emailEditText , EditText passwordEditText){
        String emailInput = emailEditText.getText().toString();
        String pasString = passwordEditText.getText().toString();

        if (emailInput.isEmpty()) {
            emailEditText.setError("email shouldn't be empty");
            return;

        } else if (!Patterns.EMAIL_ADDRESS.matcher(emailInput).matches()) {
            emailEditText.setError("enter valid email");
            return;

        }

        if (pasString.isEmpty()) {
            passwordEditText.setError("password shouldn't be less than 8 characters ");
            return;
        }
        Intent intent = new Intent(facebook_activity.this, MainActivity.class);
        startActivity(intent);
    }



}