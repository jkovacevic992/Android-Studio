package k.josip.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button  button0, button1, button2, button3, button4,
            button5, button6, button7, button8, button9,
            buttonResult, buttonAddition, buttonSubtraction,
            buttonMultiplication, buttonDivision, buttonDel,
            buttonDot;

    EditText txtNumbers;

    float valueOne, valueTwo;

    boolean addition, subtraction, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonAddition = findViewById(R.id.buttonAddition);
        buttonDivision = findViewById(R.id.buttonDivision);
        buttonMultiplication = findViewById(R.id.buttonMultiplication);
        buttonSubtraction = findViewById(R.id.buttonSubtraction);
        buttonResult = findViewById(R.id.buttonResult);
        buttonDel = findViewById(R.id.buttonDel);
        buttonDot = findViewById(R.id.buttonDot);
        txtNumbers = (EditText)findViewById(R.id.txtNumbers);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumbers.setText(txtNumbers.getText()+ "0");
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumbers.setText(txtNumbers.getText()+ "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumbers.setText(txtNumbers.getText()+ "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumbers.setText(txtNumbers.getText()+ "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumbers.setText(txtNumbers.getText()+ "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumbers.setText(txtNumbers.getText()+ "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumbers.setText(txtNumbers.getText()+ "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumbers.setText(txtNumbers.getText()+ "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumbers.setText(txtNumbers.getText()+ "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumbers.setText(txtNumbers.getText()+ "9");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumbers.setText(txtNumbers.getText()+ ".");
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtNumbers.setText("");
            }
        });

        buttonAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtNumbers==null){
                    txtNumbers.setText("");
                }else{
                    valueOne = Float.parseFloat(txtNumbers.getText()+"");
                    addition=true;
                    txtNumbers.setText(null);
                }
            }
        });
        buttonSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtNumbers==null){
                    txtNumbers.setText("");
                }else{
                    valueOne = Float.parseFloat(txtNumbers.getText()+"");
                    subtraction=true;
                    txtNumbers.setText(null);
                }
            }
        });
        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtNumbers==null){
                    txtNumbers.setText("");
                }else{
                    valueOne = Float.parseFloat(txtNumbers.getText()+"");
                    multiplication=true;
                    txtNumbers.setText(null);
                }
            }
        });
        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtNumbers==null){
                    txtNumbers.setText("");
                }else{
                    valueOne = Float.parseFloat(txtNumbers.getText()+"");
                    division=true;
                    txtNumbers.setText(null);
                }
            }
        });

        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Float.parseFloat(txtNumbers.getText()+"");
                if (addition==true){
                    txtNumbers.setText(valueOne + valueTwo + "");
                    addition=false;
                }
                if (subtraction==true){
                    txtNumbers.setText(valueOne - valueTwo + "");
                    subtraction=false;
                }
                if (multiplication==true){
                    txtNumbers.setText(valueOne * valueTwo + "");
                    multiplication=false;
                }
                if (division==true){
                    txtNumbers.setText(valueOne / valueTwo + "");
                    division=false;
                }
            }
        });

    }
}
