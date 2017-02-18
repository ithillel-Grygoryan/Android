package com.example.android.justjava2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.justjava2.R;

import java.net.URI;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends ActionBarActivity {
    int quantity=0;
    int price = 5;
    boolean chocolate=false;
    boolean cream=false;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int calculatePrice(int quantity){
        chocolate = ((CheckBox)findViewById(R.id.check_box_cream)).isChecked();
        cream = ((CheckBox)findViewById(R.id.check_box_chocolate)).isChecked();
        int totalPrice = price*quantity;
        if (chocolate)
            totalPrice += 2;
        if (cream)
            totalPrice += 1;
        return totalPrice;

    }

    private String createOrderSummary(){
        name =  ((TextView)findViewById(R.id.name)).getText().toString();
        String orderSummary = getString(R.string.order_summary_name, name)
                +"\nQuantity: "+quantity+
                "\nAdd whipped cream: "+cream+
                "\nAdd chocolate: "+chocolate+
                "\nTotal: "+calculatePrice(quantity)+"\n"+getString(R.string.thank_you);
        return orderSummary;

    }

    public void increment(View view) {
        if (quantity == 10){
            Toast.makeText(this, "You cannot have more than 99 coffee", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        display(quantity);
        displayPrice(calculatePrice(quantity));
    }

    public void decrement(View view) {
        if (quantity == 1) {
            // Show an error message as a toast
            Toast.makeText(this, "You cannot have less than 1 coffee", Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing lef@strt to do
            return;
        }
            display(quantity);
            displayPrice(quantity * price);}
    public void submitOrder(View view) {
//        displayMessage(createOrderSummary());
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"recipient@example.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "JustJava order for "+name);
        i.putExtra(Intent.EXTRA_TEXT   , createOrderSummary());
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }


    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.order_summary_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance(Locale.US).format(number));
    }
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}