package com.example.uivalidation;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName, etEmail, etPassword;
    RadioGroup radioGroup;
    RadioButton rbMale, rbFemale; // Added
    CheckBox cbTerms;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        rbMale = findViewById(R.id.rbMale);
        rbFemale = findViewById(R.id.rbFemale);
        cbTerms = findViewById(R.id.cbTerms);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateForm();
            }
        });
    }

    //Name validation
    private void validateForm() {
        if (TextUtils.isEmpty(etName.getText().toString())) {
            etName.setError("Name is required");
            return;
        }

        // Email validation
        String email = etEmail.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            etEmail.setError("Email is required");
            return;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            etEmail.setError("Enter a valid email address");
            return;
        }

        //Password validation
        String password = etPassword.getText().toString();

        // Regular expression for strong password
        String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!]).{6,}$";

        if (!password.matches(passwordPattern)) {
            etPassword.setError("Password must have at least 6 characters, including uppercase, lowercase, number, and special character");
            return;
        }

        //Gender validation
        if (!rbMale.isChecked() && !rbFemale.isChecked()) {
            Toast.makeText(this, "Please select a gender", Toast.LENGTH_SHORT).show();
            return;
        }

        //Terms and Conditions validation
        if (!cbTerms.isChecked()) {
            Toast.makeText(this, "Please accept the Terms and Conditions", Toast.LENGTH_SHORT).show();
            return;
        }

        //All validations passed
        Toast.makeText(this, "Form submitted successfully", Toast.LENGTH_SHORT).show();
    }


}
