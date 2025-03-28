package com.cnd.quick_home;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PaymentScreen extends Activity {
    private EditText cardNumber, expiryDate, cvv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_screen);

        // Initialize views
        cardNumber = findViewById(R.id.cardNumber);
        expiryDate = findViewById(R.id.expiryDate);
        cvv = findViewById(R.id.cvv);
        Button submitPaymentButton = findViewById(R.id.submitPaymentButton);

        // Set click listener
        submitPaymentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processPayment();
            }
        });
    }

    private void processPayment() {
        String cardNum = cardNumber.getText().toString().trim();
        String expDate = expiryDate.getText().toString().trim();
        String cvvCode = cvv.getText().toString().trim();

        if (cardNum.isEmpty() || expDate.isEmpty() || cvvCode.isEmpty()) {
            Toast.makeText(this, "Please enter all details", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Payment Successful", Toast.LENGTH_SHORT).show();
        }
    }
}

