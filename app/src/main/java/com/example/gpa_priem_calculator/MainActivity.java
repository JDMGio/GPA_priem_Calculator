package com.example.gpa_priem_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    //private TextView tv1;
    //private TextView tv2;
   // private TextView tv3;
    //private TextView tv4;
   // private TextView tv5;
    //private TextView tv6;
    private TextView tv7;
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private EditText et5;
    private Button calc;
    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tv1= (TextView)findViewById(R.id.g1);
        //tv2= (TextView)findViewById(R.id.g2);
        //tv3= (TextView)findViewById(R.id.g3);
        //tv4= (TextView)findViewById(R.id.g4);
        //tv5= (TextView)findViewById(R.id.g5);
        //tv6= (TextView)findViewById(R.id.title);
        tv7= (TextView)findViewById(R.id.result);
        et1= (EditText)findViewById(R.id.ed1);
        et2= (EditText)findViewById(R.id.ed2);
        et3= (EditText)findViewById(R.id.ed3);
        et4= (EditText)findViewById(R.id.ed4);
        et5= (EditText)findViewById(R.id.ed5);
        calc= (Button)findViewById(R.id.calcGPA);
        layout=(ConstraintLayout)findViewById(R.id.cl);

    }

    public void processClick(View view) {

            if (et1.getText().toString().matches("")) {
                Toast.makeText(this, "You did not enter Grade 1", Toast.LENGTH_SHORT).show();
                return;
            }

            if (et2.getText().toString().matches("")) {
            Toast.makeText(this, "You did not enter Grade 2", Toast.LENGTH_SHORT).show();
            return;
            }
            if (et3.getText().toString().matches("")) {
            Toast.makeText(this, "You did not enter Grade 3", Toast.LENGTH_SHORT).show();
            return;
            }

            if (et4.getText().toString().matches("")) {
            Toast.makeText(this, "You did not enter Grade 4", Toast.LENGTH_SHORT).show();
            return;
            }

            if (et5.getText().toString().matches("")) {
            Toast.makeText(this, "You did not enter Grade 5", Toast.LENGTH_SHORT).show();
            return;
            }

            else
                calculateGPA();

    }

    private void calculateGPA() {

        int grade1 = Integer.parseInt(et1.getText().toString());
        int grade2 = Integer.parseInt(et2.getText().toString());
        int grade3 = Integer.parseInt(et3.getText().toString());
        int grade4 = Integer.parseInt(et4.getText().toString());
        int grade5 = Integer.parseInt(et5.getText().toString());

        int gpa = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;

        if(gpa <= 60)
            layout.setBackgroundColor(Color.RED);
        if(gpa >= 61 && gpa <= 79)
            layout.setBackgroundColor(Color.YELLOW);
        if(gpa >= 80 && gpa <= 100)
            layout.setBackgroundColor(Color.GREEN);

        tv7.setText(String.valueOf(gpa));

    }


}