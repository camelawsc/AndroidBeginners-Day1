package camelawong.day1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number = getIntent().getStringExtra("number");
        if (number == null){
            Random rand = new Random();
            number = Integer.toString(rand.nextInt(100)+1);
        }

        TextView text = (TextView) findViewById(R.id.ANumber);
        text.setText(number);

        number = text.getText().toString();

        Button aButton = (Button) findViewById(R.id.AButton);
        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("number", number);
                startActivity(intent);
            }
        });
    }
}
