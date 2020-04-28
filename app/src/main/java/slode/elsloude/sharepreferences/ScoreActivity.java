package slode.elsloude.sharepreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textViewResult = findViewById(R.id.textViewResult);
         setContentView(R.layout.activity_score);
        Intent intent = getIntent();
        if(intent != null && intent.hasExtra("result")) {
            int result = intent.getIntExtra("result", 0);
            String score = String.format("Ваш результат: %s", result);
            textViewResult.setText(result);
        }
    }

    public void onClickAnswer(View view) {
    }
}
