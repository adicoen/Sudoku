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
    Button[] given;
    int[] nums;
    TableLayout board, bar;
    String value = "1";
    TextView text;
    int give = 26;

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
        for (int i = 0; i < 91; i++) {
            buttons[i].setOnClickListener(this);
        }
        given = new Button[]{buttons[82], buttons[84], buttons[86], buttons[89], buttons[90], buttons[74], buttons[79], buttons[64], buttons[66], buttons[69], buttons[55], buttons[56], buttons[51], buttons[54], buttons[38], buttons[42], buttons[43], buttons[44], buttons[45], buttons[32], buttons[35], buttons[36], buttons[22], buttons[26], buttons[10], buttons[11], buttons[18]};

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