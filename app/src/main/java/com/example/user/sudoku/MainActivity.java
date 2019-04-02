package com.example.user.sudoku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

//finished
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button[] buttons;
    Button button;
    Button b1, b12, b91, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24, b25, b26, b27, b28, b29, b30, b31, b32, b33, b34, b35, b36, b37, b38, b39, b40, b41, b42, b43, b44, b45, b46, b47, b48, b49, b50, b51, b52, b53, b54, b55, b56, b57, b58, b59, b60, b61, b62, b63, b64, b65, b66, b67, b68, b69, b70, b71, b72, b73, b74, b75, b76, b77, b78, b79, b80, b81, b82, b83, b84, b85, b86, b87, b88, b89, b90;
    TableLayout board, bar;
    String value = "1";
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);
        board = (TableLayout) findViewById(R.id.tableLayout);
        bar = (TableLayout) findViewById(R.id.tableLayout2);
        buttons = new Button[91];
        for (int i = 2; i < 93; i++) {
            String str = "button" + i;
            if (i != 6) {
                button = findViewById(getResources().getIdentifier(str, "id", getPackageName()));
                buttons[i - 2] = button;
            }
        }
        text = findViewById(R.id.textView2);
        for (int i = 0; i < 9; i++) {
            buttons[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button2:
                value = "1";
                text.setText(value);
                break;
            case R.id.button3:
                value = "2";
                text.setText(value);
                break;
            case R.id.button4:
                value = "3";
                text.setText(value);
                break;
            case R.id.button5:
                value = "4";
                text.setText(value);
                break;
            case R.id.button7:
                value = "5";
                text.setText(value);
                break;
            case R.id.button8:
                value = "6";
                text.setText(value);
                break;
            case R.id.button9:
                value = "7";
                text.setText(value);
                break;
            case R.id.button10:
                value = "8";
                text.setText(value);
                break;
            case R.id.button11:
                value = "9";
                text.setText(value);
                break;
            case R.id.button93:
                value = " ";
                text.setText("erase");
                break;
            default:
                for (int i = 9; i < 90; i++) {
                    if (v == buttons[i]) {
                        buttons[i].setText(value);
                    }
                }
        }
    }
}