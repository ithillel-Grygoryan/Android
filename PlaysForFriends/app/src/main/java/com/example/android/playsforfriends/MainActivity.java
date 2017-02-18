package com.example.android.playsforfriends;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void game(View view) {
        TextView gameTextView = (TextView) findViewById(R.id.gameRules);
        TextView gameNameTextView = (TextView) findViewById(R.id.gameName);
        ImageView img = (ImageView) findViewById(R.id.gameImage);
        Button button = (Button) view;
        gameNameTextView.setText(button.getText());
        switch ( button.getId())
        {
            case R.id.first_game_button:
                gameTextView.setText(getString(R.string.first_game_settings));
                img.setImageResource(R.drawable.whosmymatch);
                break;

            case R.id.second_game_button:
                gameTextView.setText(getString(R.string.second_game_settings));
                img.setImageResource(R.drawable.whosyours);
                break;

            case R.id.third_game_button:
                gameTextView.setText(getString(R.string.third_game_settings));
                img.setImageResource(R.drawable.twotruthsandlie);
                break;

            case R.id.fourth_game_button:
                gameTextView.setText(getString(R.string.fourth_game_settings));
                img.setImageResource(R.drawable.tagnbag);
                break;

            case R.id.fifth_game_button:
                gameTextView.setText(getString(R.string.fifth_game_settings));
                img.setImageResource(R.drawable.celebretieshunt);
                break;
        }
    }
}
