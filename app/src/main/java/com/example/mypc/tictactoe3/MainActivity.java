package com.example.mypc.tictactoe3;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button one_btn,two_btn,three_btn,four_btn,five_btn,six_btn,seven_btn,eight_btn,nine_btn,ply_agn_btn;
  private  String one_pos,two_pos,three_pos,four_pos,five_pos,six_pos,seven_pos,eight_pos,nine_pos;
    int click=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    //Init Views
    private void init()
    {
        one_btn=(Button)findViewById(R.id.one_btn);
        one_btn.setOnClickListener(this);
        two_btn=(Button)findViewById(R.id.two_btn);
        two_btn.setOnClickListener(this);
        three_btn=(Button)findViewById(R.id.three_btn);
        three_btn.setOnClickListener(this);
        four_btn=(Button)findViewById(R.id.four_btn);
        four_btn.setOnClickListener(this);
        five_btn=(Button)findViewById(R.id.five_btn);
        five_btn.setOnClickListener(this);
        six_btn=(Button)findViewById(R.id.six_btn);
        six_btn.setOnClickListener(this);
        seven_btn=(Button)findViewById(R.id.seven_btn);
        seven_btn.setOnClickListener(this);
        eight_btn=(Button)findViewById(R.id.eight_btn);
        eight_btn.setOnClickListener(this);
        nine_btn=(Button)findViewById(R.id.nine_btn);
        nine_btn.setOnClickListener(this);
        ply_agn_btn=(Button)findViewById(R.id.ply_agn_btn);
        ply_agn_btn.setOnClickListener(this);

    }
    //Checking the winner
    private void Game()
    {
        one_pos=one_btn.getText().toString();
        two_pos=two_btn.getText().toString();
        three_pos=three_btn.getText().toString();
        four_pos=four_btn.getText().toString();
        five_pos=five_btn.getText().toString();
        six_pos=six_btn.getText().toString();
        seven_pos=seven_btn.getText().toString();
        eight_pos=eight_btn.getText().toString();
        nine_pos=nine_btn.getText().toString();
        if((one_pos.equals("X") && two_pos.equals("X") && three_pos.equals("X"))||
                (one_pos.equals("X")&&five_pos.equals("X")&&nine_pos.equals("X"))||
                (one_pos.equals("X")&&four_pos.equals("X")&&seven_pos.equals("X"))||
                (two_pos.equals("X")&&five_pos.equals("X")&&eight_pos.equals("X"))||
                (three_pos.equals("X")&&six_pos.equals("X")&&nine_pos.equals("X"))||
                (four_pos.equals("X")&&five_pos.equals("X")&&six_pos.equals("X"))||
                (seven_pos.equals("X")&&eight_pos.equals("X")&&nine_pos.equals("X"))||
                (three_pos.equals("X")&&five_pos.equals("X")&&seven_pos.equals("X"))){
         Toast.makeText(MainActivity.this,"X is Winner",Toast.LENGTH_LONG).show();
            disableButton();
        }
        if((one_pos.equals("0")&&two_pos.equals("0")&&three_pos.equals("0"))||
        (one_pos.equals("0")&&five_pos.equals("0")&&nine_pos.equals("0"))||
                (one_pos.equals("0")&&four_pos.equals("0")&&seven_pos.equals("0"))||
                (two_pos.equals("0")&&five_pos.equals("0")&&eight_pos.equals("0"))||
                (three_pos.equals("0")&&six_pos.equals("0")&&nine_pos.equals("0"))||
                (four_pos.equals("0")&&five_pos.equals("0")&&six_pos.equals("0"))||
                (seven_pos.equals("0")&&eight_pos.equals("0")&&nine_pos.equals("0"))||
                (three_pos.equals("0")&&five_pos.equals("0")&&seven_pos.equals("0"))){
            Toast.makeText(MainActivity.this,"0 is Winner",Toast.LENGTH_LONG).show();
            disableButton();
        }
        if(!one_pos.equals("")&&!two_pos.equals("")&&!three_pos.equals("")&&!four_pos.equals("")&&!five_pos.equals("")
        &&!six_pos.equals("")&&!seven_pos.equals("")&&!eight_pos.equals("")&&!nine_pos.equals(""))
        {
            Toast.makeText(MainActivity.this,"No Winner!! Play Agains",Toast.LENGTH_LONG).show();
            disableButton();
        }
    }
//    for reset the all values after player win the game
private void reset(){
            one_btn.setText("");
            two_btn.setText("");
            three_btn.setText("");
            four_btn.setText("");
            five_btn.setText("");
            six_btn.setText("");
            seven_btn.setText("");
            eight_btn.setText("");
            nine_btn.setText("");
            enableButton();
 }
    //passing button as arugment to perfom click
    private Button clicking(Button btn)
    {
        if (btn.getText().toString().equals("")) {
            if (click == 1) {
                click = 2;
                btn.setText("X");
            } else if (click == 2) {
                click = 1;
                btn.setText("0");
            }
        }
        return btn;
    }
//To enable the all values after click play again button
    private void enableButton()
    {
       one_btn.setEnabled(true);
       two_btn.setEnabled(true);
       three_btn.setEnabled(true);
       four_btn.setEnabled(true);
       five_btn.setEnabled(true);
       six_btn.setEnabled(true);
       seven_btn.setEnabled(true);
       eight_btn.setEnabled(true);
       nine_btn.setEnabled(true);
    }
    //To disable the all values after player win the game
    private void disableButton()
    {
        one_btn.setEnabled(false);
        two_btn.setEnabled(false);
        three_btn.setEnabled(false);
        four_btn.setEnabled(false);
        five_btn.setEnabled(false);
        six_btn.setEnabled(false);
        seven_btn.setEnabled(false);
        eight_btn.setEnabled(false);
        nine_btn.setEnabled(false);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.one_btn:
                clicking(one_btn);
                break;
            case R.id.two_btn:
                clicking(two_btn);

                break;
            case R.id.three_btn:
                clicking(three_btn);

                break;
            case R.id.four_btn:
                clicking(four_btn);

                break;
            case R.id.five_btn:
                clicking(five_btn);

                break;
            case R.id.six_btn:
               clicking(six_btn);

                break;
            case R.id.seven_btn:
              clicking(seven_btn);
                break;
            case R.id.eight_btn:
                clicking(eight_btn);
                break;
            case R.id.nine_btn:
               clicking(nine_btn);
                break;
            case R.id.ply_agn_btn:
                reset();
                break;
        }
        Game();

    }
}
