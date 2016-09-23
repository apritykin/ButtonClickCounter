package com.leetinsider.buttonclickcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userInput = (EditText) findViewById(R.id.editText);
        // Clear the editText content for any pre-set text
        userInput.setText("");
        Button button = (Button) findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        // Clear the textView content in case of any pre-set text.
        textView.setText("");
        // Enables the vertical scroll when the text passes past the view
        textView.setMovementMethod(new ScrollingMovementMethod());

        // Create a onClick Listener for the Button when pressed and do things
        View.OnClickListener ourOnclickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = userInput.getText().toString();
                result = result + "\n";
                textView.append(result);
                userInput.setText("");
            }
        };

        button.setOnClickListener(ourOnclickListener);
    }
}
