package net.skhu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.button);

        View.OnClickListener listenerObj = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText e = (EditText)findViewById(R.id.editText);
                CharSequence s = e.getText();

                EditText e2 = (EditText)findViewById(R.id.editText2);
                CharSequence s2 = e2.getText();


                EditText t = (EditText)findViewById(R.id.editText2);
                t.setText(s);

                EditText t2 = (EditText)findViewById(R.id.editText);
                t2.setText(s2);


            }
        };

        b.setOnClickListener(listenerObj);

    }
}
