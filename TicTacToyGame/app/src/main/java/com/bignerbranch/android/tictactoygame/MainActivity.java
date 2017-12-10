package com.bignerbranch.android.tictactoygame;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import static android.R.attr.button;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.icu.lang.UCharacter.JoiningGroup.E;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void buClick(View view){
    Button buSelected = (Button) view;
    int CellID = 0;

    switch ((buSelected.getId())){
        case R.id.bu1:
            CellID = 1;
            break;
        case R.id.bu2:
            CellID = 2;
            break;
        case R.id.bu3:
            CellID = 3;
            break;
        case R.id.bu4:
            CellID = 4;
            break;
        case R.id.bu5:
            CellID = 5;
            break;
        case R.id.bu6:
            CellID = 6;
            break;
        case R.id.bu7:
            CellID = 7;
            break;
        case R.id.bu8:
            CellID = 8;
            break;
        case R.id.bu9:
            CellID = 9;
            break;

    }
    PlayGame(CellID, buSelected);
}

int activePlayer = 1; // 1 for first, 2 for second player
    ArrayList<Integer> player1 = new ArrayList<Integer>();
    ArrayList<Integer> player2 = new ArrayList<Integer>();

    void checkWinner(ArrayList player,int playerN){
        if ((player.contains(1) && player.contains(2) && player.contains(3))
                || ((player.contains(4) && player.contains(5) && player.contains(6)))
                || ((player.contains(7) && player.contains(8) && player.contains(9)))
                || ((player.contains(1) && player.contains(4) && player.contains(7)))
                || ((player.contains(2) && player.contains(5) && player.contains(8)))
                || ((player.contains(4) && player.contains(5) && player.contains(6)))
                || ((player.contains(3) && player.contains(6) && player.contains(9)))
                || ((player.contains(1) && player.contains(5) && player.contains(9))))
        {Toast.makeText(this,"Player "+playerN+" win!!!!", Toast.LENGTH_LONG).show();
        this.onResume();
        }
    }

    void AutoPlay(){
        ArrayList<Integer> EmptyCells = new ArrayList<Integer>();

        for (int cellId = 1; cellId < 10; cellId++){
            if(!(player1.contains(cellId) || player2.contains(cellId))){
                EmptyCells.add(cellId);
            }
        }
        Random r = new Random();
        int RandIndex = r.nextInt(EmptyCells.size() - 0)+0;
        int cellID = EmptyCells.get(RandIndex);
        Button buSelected;

        switch (cellID){
            case 1:
                buSelected = (Button) findViewById(R.id.bu1);
                break;
            case 2:
                buSelected = (Button) findViewById(R.id.bu2);
                break;
            case 3:
                buSelected = (Button) findViewById(R.id.bu3);
                break;
            case 4:
                buSelected = (Button) findViewById(R.id.bu4);
                break;
            case 5:
                buSelected = (Button) findViewById(R.id.bu5);
                break;
            case 6:
                buSelected = (Button) findViewById(R.id.bu6);
                break;
            case 7:
                buSelected = (Button) findViewById(R.id.bu7);
                break;
            case 8:
                buSelected = (Button) findViewById(R.id.bu8);
                break;
            case 9:
                buSelected = (Button) findViewById(R.id.bu9);
                break;
            default:
        buSelected = (Button) findViewById(R.id.bu1);
        break;}


PlayGame(cellID, buSelected);

        }

    

void PlayGame(int CellID, Button buSelected){
    Log.d("player", String.valueOf(CellID));
    Log.d("BUTTON", buSelected.getText().toString());

    if (activePlayer == 1 && !player1.contains(CellID) &&!player2.contains(CellID)){
        buSelected.setText("X");
        buSelected.setBackgroundColor(Color.YELLOW);
        player1.add(CellID);
        checkWinner(player1, activePlayer);
        activePlayer = 2;
        AutoPlay();
    }
    else if (activePlayer == 2&& !player1.contains(CellID) && !player2.contains(CellID)){
    buSelected.setText("O");
        buSelected.setBackgroundColor(Color.BLUE);
        player2.add(CellID);
        checkWinner(player2, activePlayer);
        activePlayer = 1;
    }

}
}
