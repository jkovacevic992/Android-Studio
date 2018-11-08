package k.josip.mathgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView firstNum;
    TextView secondNum;
    TextView solution;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        fillNumbers();


        Button btn = (Button) findViewById(R.id.submit);
        btn.setOnClickListener(new View.OnClickListener() {
            
            public void onClick(View v) {
                TextView res = findViewById(R.id.result);


                if(checkResult(Integer.parseInt(res.getText().toString()))){
                    fillNumbers();
                    res.setText("");
                }
            }
        });

    }
    public int randomNum(){
        int random = new Random().nextInt(100);
        return random;
    }


    public void fillNumbers(){
        firstNum = findViewById(R.id.firstNum);
        secondNum = findViewById(R.id.secondNum);

        firstNum.setText(String.valueOf(randomNum()));
        secondNum.setText(String.valueOf(randomNum()));
    }

    public boolean checkResult(int num){
        int first = Integer.parseInt(firstNum.getText().toString());
        int second = Integer.parseInt((secondNum.getText().toString()));
        solution = findViewById(R.id.txtSolution);
        if(num==(first+second)){

           solution.setText("Correct");
           return true;
        }else {
            solution.setText("Try again.");
        }
        return false;
    }




}
