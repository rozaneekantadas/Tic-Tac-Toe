package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int playerres1=0, playerres2=0;

    boolean player1=true, player2=false;

    TextView plyr1, plyr2;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, reset, newGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plyr1 = findViewById(R.id.player1);
        plyr2 = findViewById(R.id.player2);

        btn0 = findViewById(R.id.btn00);
        btn1 = findViewById(R.id.btn01);
        btn2 = findViewById(R.id.btn02);
        btn3 = findViewById(R.id.btn10);
        btn4 = findViewById(R.id.btn11);
        btn5 = findViewById(R.id.btn12);
        btn6 = findViewById(R.id.btn20);
        btn7 = findViewById(R.id.btn21);
        btn8 = findViewById(R.id.btn22);
        reset = findViewById(R.id.reset);
        newGame = findViewById(R.id.starNew);

        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        reset.setOnClickListener(this);
        newGame.setOnClickListener(this);

        btn0.setTextColor(getResources().getColor(android.R.color.black));
        btn1.setTextColor(getResources().getColor(android.R.color.black));
        btn2.setTextColor(getResources().getColor(android.R.color.black));
        btn3.setTextColor(getResources().getColor(android.R.color.black));
        btn4.setTextColor(getResources().getColor(android.R.color.black));
        btn5.setTextColor(getResources().getColor(android.R.color.black));
        btn6.setTextColor(getResources().getColor(android.R.color.black));
        btn7.setTextColor(getResources().getColor(android.R.color.black));
        btn8.setTextColor(getResources().getColor(android.R.color.black));
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btn00 && btn0.getText().toString().isEmpty()){
            if(player1 == true){
                btn0.setText("X");
                player2 = true;
                player1 = false;
            }
            else{
                btn0.setText("O");
                player1 = true;
                player2 = false;
            }
        }

        if(view.getId()==R.id.btn01 && btn1.getText().toString().isEmpty()){
            if(player1 == true){
                btn1.setText("X");
                player2 = true;
                player1 = false;
            }
            else{
                btn1.setText("O");
                player1 = true;
                player2 = false;
            }
        }

        if(view.getId()==R.id.btn02 && btn2.getText().toString().isEmpty()){
            if(player1 == true){
                btn2.setText("X");
                player2 = true;
                player1 = false;
            }
            else{
                btn2.setText("O");
                player1 = true;
                player2 = false;
            }
        }

        if(view.getId()==R.id.btn10 && btn3.getText().toString().isEmpty()){
            if(player1 == true){
                btn3.setText("X");
                player2 = true;
                player1 = false;
            }
            else{
                btn3.setText("O");
                player1 = true;
                player2 = false;
            }
        }

        if(view.getId()==R.id.btn11 && btn4.getText().toString().isEmpty()){
            if(player1 == true){
                btn4.setText("X");
                player2 = true;
                player1 = false;
            }
            else{
                btn4.setText("O");
                player1 = true;
                player2 = false;
            }
        }

        if(view.getId()==R.id.btn12 && btn5.getText().toString().isEmpty()){
            if(player1 == true){
                btn5.setText("X");
                player2 = true;
                player1 = false;
            }
            else{
                btn5.setText("O");
                player1 = true;
                player2 = false;
            }
        }

        if(view.getId()==R.id.btn20 && btn6.getText().toString().isEmpty()){
            if(player1 == true){
                btn6.setText("X");
                player2 = true;
                player1 = false;
            }
            else{
                btn6.setText("O");
                player1 = true;
                player2 = false;
            }
        }

        if(view.getId()==R.id.btn21 && btn7.getText().toString().isEmpty()){
            if(player1 == true){
                btn7.setText("X");
                player2 = true;
                player1 = false;
            }
            else{
                btn7.setText("O");
                player1 = true;
                player2 = false;
            }
        }

        if(view.getId()==R.id.btn22 && btn8.getText().toString().isEmpty()){
            if(player1 == true){
                btn8.setText("X");
                player2 = true;
                player1 = false;
            }
            else{
                btn8.setText("O");
                player1 = true;
                player2 = false;
            }
        }

        if(view.getId() == R.id.reset) resetAll();
        if(view.getId() == R.id.starNew) StartNew();

        String b0, b1, b2, b3, b4, b5, b6, b7, b8;

        b0 = btn0.getText().toString();
        b1 = btn1.getText().toString();
        b2 = btn2.getText().toString();
        b3 = btn3.getText().toString();
        b4 = btn4.getText().toString();
        b5 = btn5.getText().toString();
        b6 = btn6.getText().toString();
        b7 = btn7.getText().toString();
        b8 = btn8.getText().toString();
        
        int draw = 0;
        draw = result(b0, b1, b2, b3, b4, b5, b6, b7, b8);

        if(draw == 0 && b0.isEmpty() == false && b1.isEmpty() == false && b3.isEmpty() == false && b4.isEmpty() == false && b5.isEmpty() == false &&
                b6.isEmpty() == false && b7.isEmpty() == false && b8.isEmpty() == false){
            Toast.makeText(MainActivity.this, "Match Draw", Toast.LENGTH_SHORT).show();
        }

    }

    void resetAll(){
        btn0.setText(null);
        btn1.setText(null);
        btn2.setText(null);
        btn3.setText(null);
        btn4.setText(null);
        btn5.setText(null);
        btn6.setText(null);
        btn7.setText(null);
        btn8.setText(null);

        btn0.setTextColor(getResources().getColor(android.R.color.black));
        btn1.setTextColor(getResources().getColor(android.R.color.black));
        btn2.setTextColor(getResources().getColor(android.R.color.black));
        btn3.setTextColor(getResources().getColor(android.R.color.black));
        btn4.setTextColor(getResources().getColor(android.R.color.black));
        btn5.setTextColor(getResources().getColor(android.R.color.black));
        btn6.setTextColor(getResources().getColor(android.R.color.black));
        btn7.setTextColor(getResources().getColor(android.R.color.black));
        btn8.setTextColor(getResources().getColor(android.R.color.black));
        player1 = true;
        player2 = false;

        buttonEnable();

    }

    void StartNew(){
        playerres1 = 0;
        playerres2 = 0;
        plyr1.setText("Player 1(X): "+playerres1);
        plyr2.setText("Player 2(O): "+playerres2);
        player1 = true;
        player2 = false;
        resetAll();
    }

    int result(String b0, String b1, String b2, String b3, String b4, String b5, String b6, String b7, String b8){
        
        int count1 = 0;

        //For Player 1

        if(b0.equals("X") &&  b1.equals("X") && b2.equals("X")){
            playerres1++;
            Toast.makeText(MainActivity.this, "Player 1 win", Toast.LENGTH_SHORT).show();
            plyr1.setText("Player 1(X): "+playerres1);
            btn0.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn1.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn2.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            player1 = true;
            player2 = false;
            buttonDisable();
            count1++;
            return count1;
        }

        if(b3.equals("X") &&  b4.equals("X") && b5.equals("X")){
            playerres1++;
            Toast.makeText(MainActivity.this, "Player 1 win", Toast.LENGTH_SHORT).show();
            plyr1.setText("Player 1(X): "+playerres1);
            btn3.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn4.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn5.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            player1 = true;
            player2 = false;
            buttonDisable();
            count1++;
            return count1;
        }

        if(b6.equals("X") &&  b7.equals("X") && b8.equals("X")){
            playerres1++;
            Toast.makeText(MainActivity.this, "Player 1 win", Toast.LENGTH_SHORT).show();
            plyr1.setText("Player 1(X): "+playerres1);
            btn6.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn7.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn8.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            player1 = true;
            player2 = false;
            buttonDisable();
            count1++;
            return count1;
        }

        if(b0.equals("X") &&  b3.equals("X") && b6.equals("X")){
            playerres1++;
            Toast.makeText(MainActivity.this, "Player 1 win", Toast.LENGTH_SHORT).show();
            plyr1.setText("Player 1(X): "+playerres1);
            btn0.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn3.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn6.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            player1 = true;
            player2 = false;
            buttonDisable();
            count1++;
            return count1;
        }

        if(b1.equals("X") &&  b4.equals("X") && b7.equals("X")){
            playerres1++;
            Toast.makeText(MainActivity.this, "Player 1 win", Toast.LENGTH_SHORT).show();
            plyr1.setText("Player 1(X): "+playerres1);
            btn1.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn4.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn7.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            player1 = true;
            player2 = false;
            buttonDisable();
            count1++;
            return count1;
        }

        if(b2.equals("X") &&  b5.equals("X") && b8.equals("X")){
            playerres1++;
            Toast.makeText(MainActivity.this, "Player 1 win", Toast.LENGTH_SHORT).show();
            plyr1.setText("Player 1(X): "+playerres1);
            btn2.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn5.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn8.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            player1 = true;
            player2 = false;
            buttonDisable();
            count1++;
            return count1;
        }

        if(b0.equals("X") &&  b4.equals("X") && b8.equals("X")){
            playerres1++;
            Toast.makeText(MainActivity.this, "Player 1 win", Toast.LENGTH_SHORT).show();
            plyr1.setText("Player 1(X): "+playerres1);
            btn0.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn4.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn8.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            player1 = true;
            player2 = false;
            buttonDisable();
            count1++;
            return count1;
        }

        if(b2.equals("X") &&  b4.equals("X") && b6.equals("X")){
            playerres1++;
            Toast.makeText(MainActivity.this, "Player 1 win", Toast.LENGTH_SHORT).show();
            plyr1.setText("Player 1(X): "+playerres1);
            btn2.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn4.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn6.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            player1 = true;
            player2 = false;
            buttonDisable();
            count1++;
            return count1;
        }

        //For Player 2

        if(b0.equals("O") &&  b1.equals("O") && b2.equals("O")){
            playerres2++;
            Toast.makeText(MainActivity.this, "Player 2 win", Toast.LENGTH_SHORT).show();
            plyr2.setText("Player 2(O): "+playerres2);
            btn0.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn1.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn2.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            player1 = true;
            player2 = false;
            buttonDisable();
            count1++;
            return count1;
        }

        if(b3.equals("O") &&  b4.equals("O") && b5.equals("O")){
            playerres2++;
            Toast.makeText(MainActivity.this, "Player 2 win", Toast.LENGTH_SHORT).show();
            plyr2.setText("Player 2(O): "+playerres2);
            btn3.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn4.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn5.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            player1 = true;
            player2 = false;
            buttonDisable();
            count1++;
            return count1;
        }

        if(b6.equals("O") &&  b7.equals("O") && b8.equals("O")){
            playerres2++;
            Toast.makeText(MainActivity.this, "Player 2 win", Toast.LENGTH_SHORT).show();
            plyr2.setText("Player 2(O): "+playerres2);
            btn6.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn7.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn8.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            player1 = true;
            player2 = false;
            buttonDisable();
            count1++;
            return count1;
        }

        if(b0.equals("O") &&  b3.equals("O") && b6.equals("O")){
            playerres2++;
            Toast.makeText(MainActivity.this, "Player 2 win", Toast.LENGTH_SHORT).show();
            plyr2.setText("Player 2(O): "+playerres2);
            btn0.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn3.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn6.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            player1 = true;
            player2 = false;
            buttonDisable();
            count1++;
            return count1;
        }

        if(b1.equals("O") &&  b4.equals("O") && b7.equals("O")){
            playerres2++;
            Toast.makeText(MainActivity.this, "Player 2 win", Toast.LENGTH_SHORT).show();
            plyr2.setText("Player 2(O): "+playerres2);
            btn1.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn4.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn7.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            player1 = true;
            player2 = false;
            buttonDisable();
            count1++;
        }

        if(b2.equals("O") &&  b5.equals("O") && b8.equals("O")){
            playerres2++;
            Toast.makeText(MainActivity.this, "Player 2 win", Toast.LENGTH_SHORT).show();
            plyr2.setText("Player 2(O): "+playerres2);
            btn2.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn5.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn8.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            player1 = true;
            player2 = false;
            buttonDisable();
            count1++;
            return count1;
        }

        if(b0.equals("O") &&  b4.equals("O") && b8.equals("O")){
            playerres2++;
            Toast.makeText(MainActivity.this, "Player 2 win", Toast.LENGTH_SHORT).show();
            plyr2.setText("Player 2(O): "+playerres2);
            btn0.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn4.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn8.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            player1 = true;
            player2 = false;
            buttonDisable();
            count1++;
        }

        if(b2.equals("O") &&  b4.equals("O") && b6.equals("O")){
            playerres2++;
            Toast.makeText(MainActivity.this, "Player 2 win", Toast.LENGTH_SHORT).show();
            plyr2.setText("Player 2(O): "+playerres2);
            btn2.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn4.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            btn6.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            player1 = true;
            player2 = false;
            buttonDisable();
            count1++;
            return count1;
        }
        return count1;
    }

    void buttonDisable(){
        btn0.setEnabled(false);
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
    }

    void buttonEnable(){
        btn0.setEnabled(true);
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
    }
}
