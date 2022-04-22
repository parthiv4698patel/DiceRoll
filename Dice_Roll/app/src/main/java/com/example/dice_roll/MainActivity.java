package com.example.dice_roll;

/*import*/
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    /*Initialization*/
    RadioGroup radioGroup;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;
    RadioButton rb5;
    RadioButton rb6;
    Button btn_time1,btn_time2;
    TextView txt_display;
    int maxVal;
    int randomVal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup=findViewById(R.id.radioGroup);
        rb1=findViewById(R.id.four_side);
        rb2=findViewById(R.id.six_side);
        rb3=findViewById(R.id.eight_side);
        rb4=findViewById(R.id.ten_side);
        rb5=findViewById(R.id.twelve_side);
        rb6=findViewById(R.id.twenty_side);

        btn_time1=findViewById(R.id.one_time);
        btn_time2=findViewById(R.id.two_time);
        txt_display=findViewById(R.id.display);


        btn_time1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View v) {
                int choice=radioGroup.getCheckedRadioButtonId();
                /*if...else.. to click on radio button and then get random values*/
                if(choice==R.id.four_side){
                    maxVal=4;
                }else if(choice==R.id.six_side){
                    maxVal=6;
                }
                else if(choice==R.id.eight_side){
                    maxVal=8;
                }
                else if(choice==R.id.ten_side){
                    maxVal=10;
                }
                else if(choice==R.id.twelve_side){
                    maxVal=12;
                }
                else if(choice==R.id.twenty_side){
                    maxVal=20;
                }
                randomVal=(int)(Math.random()*maxVal)+1;
                txt_display.setText(String.format("%d", randomVal));
            }
        });

        btn_time2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*if...else.. to click on radio button and then get random values*/
                int choice=radioGroup.getCheckedRadioButtonId();

                if(choice==R.id.four_side){
                    maxVal=4;
                }else if(choice==R.id.six_side){
                    maxVal=6;
                }
                else if(choice==R.id.eight_side){
                    maxVal=8;
                }
                else if(choice==R.id.ten_side){
                    maxVal=10;
                }
                else if(choice==R.id.twelve_side){
                    maxVal=12;
                }
                else if(choice==R.id.twenty_side){
                    maxVal=20;
                }
                randomVal=(int)(Math.random()*maxVal)+1;
                txt_display.setText(""+randomVal);
            }
        });

    }
}