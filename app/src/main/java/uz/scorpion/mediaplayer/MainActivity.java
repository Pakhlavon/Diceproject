package uz.scorpion.mediaplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

//    private Button button;
  private ImageView imgtosh,imgtoshi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button,button2;
        button=(Button)findViewById(R.id.button);
        button2=(Button)findViewById(R.id.button2);

        imgtosh=(ImageView)findViewById(R.id.imgtosh);
        imgtoshi=(ImageView)findViewById(R.id.imgtoshi);

        final int[] DiceArray={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random =new Random();
                int number =random.nextInt(6);

                imgtosh.setImageResource(DiceArray[number]);

                imgtoshi.setImageResource(DiceArray[number]);
            }
        });
    }
}
