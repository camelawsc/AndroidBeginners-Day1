package camelawong.day1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String number = getIntent().getStringExtra("number");
        TextView text = (TextView) findViewById(R.id.BNumber);
        text.setText(number);

        Button button = (Button) findViewById(R.id.BButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                Random rand = new Random();
                intent.putExtra("number", rand.nextInt(100)+1);
                startActivity(intent);
            }
        });

    }
}
