package com.example.user.sudoku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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
        b1 = findViewById(R.id.button2);
        b1.setOnClickListener(this);
        b2 = findViewById(R.id.button3);
        b3 = findViewById(R.id.button4);
        b4 = findViewById(R.id.button5);
        b5 = findViewById(R.id.button7);
        b6 = findViewById(R.id.button8);
        b7 = findViewById(R.id.button9);
        b8 = findViewById(R.id.button10);
        b9 = findViewById(R.id.button11);
        b10 = findViewById(R.id.button12);
        b11 = findViewById(R.id.button13);
        b12 = findViewById(R.id.button14);
        b13 = findViewById(R.id.button15);
        b14 = findViewById(R.id.button16);
        b15 = findViewById(R.id.button17);
        b16 = findViewById(R.id.button18);
        b17 = findViewById(R.id.button19);
        b18 = findViewById(R.id.button20);
        b19 = findViewById(R.id.button21);
        b20 = findViewById(R.id.button22);
        b21 = findViewById(R.id.button23);
        b22 = findViewById(R.id.button24);
        b23 = findViewById(R.id.button25);
        b24 = findViewById(R.id.button26);
        b25 = findViewById(R.id.button27);
        b26 = findViewById(R.id.button28);
        b27 = findViewById(R.id.button29);
        b28 = findViewById(R.id.button30);
        b29 = findViewById(R.id.button31);
        b30 = findViewById(R.id.button32);
        b31 = findViewById(R.id.button33);
        b32 = findViewById(R.id.button34);
        b33 = findViewById(R.id.button35);
        b34 = findViewById(R.id.button36);
        b35 = findViewById(R.id.button37);
        b36 = findViewById(R.id.button38);
        b37 = findViewById(R.id.button39);
        b38 = findViewById(R.id.button40);
        b39 = findViewById(R.id.button41);
        b40 = findViewById(R.id.button42);
        b41 = findViewById(R.id.button43);
        b42 = findViewById(R.id.button44);
        b43 = findViewById(R.id.button45);
        b44 = findViewById(R.id.button46);
        b45 = findViewById(R.id.button47);
        b46 = findViewById(R.id.button48);
        b47 = findViewById(R.id.button49);
        b48 = findViewById(R.id.button50);
        b49 = findViewById(R.id.button51);
        b50 = findViewById(R.id.button52);
        b51 = findViewById(R.id.button53);
        b52 = findViewById(R.id.button54);
        b53 = findViewById(R.id.button55);
        b54 = findViewById(R.id.button56);
        b55 = findViewById(R.id.button57);
        b56 = findViewById(R.id.button58);
        b57 = findViewById(R.id.button59);
        b58 = findViewById(R.id.button60);
        b59 = findViewById(R.id.button61);
        b60 = findViewById(R.id.button62);
        b61 = findViewById(R.id.button63);
        b62 = findViewById(R.id.button64);
        b63 = findViewById(R.id.button65);
        b64 = findViewById(R.id.button66);
        b65 = findViewById(R.id.button67);
        b66 = findViewById(R.id.button68);
        b67 = findViewById(R.id.button69);
        b68 = findViewById(R.id.button70);
        b69 = findViewById(R.id.button71);
        b70 = findViewById(R.id.button72);
        b71 = findViewById(R.id.button73);
        b72 = findViewById(R.id.button74);
        b73 = findViewById(R.id.button75);
        b74 = findViewById(R.id.button76);
        b75 = findViewById(R.id.button77);
        b76 = findViewById(R.id.button78);
        b77 = findViewById(R.id.button79);
        b78 = findViewById(R.id.button80);
        b79 = findViewById(R.id.button81);
        b80 = findViewById(R.id.button82);
        b81 = findViewById(R.id.button83);
        b82 = findViewById(R.id.button84);
        b83 = findViewById(R.id.button85);
        b84 = findViewById(R.id.button86);
        b85 = findViewById(R.id.button87);
        b86 = findViewById(R.id.button88);
        b87 = findViewById(R.id.button89);
        b88 = findViewById(R.id.button90);
        b89 = findViewById(R.id.button91);
        b90 = findViewById(R.id.button92);
        b91 = findViewById(R.id.button93);
        text = findViewById(R.id.textView2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        b17.setOnClickListener(this);
        b18.setOnClickListener(this);
        b19.setOnClickListener(this);
        b20.setOnClickListener(this);
        b21.setOnClickListener(this);
        b22.setOnClickListener(this);
        b23.setOnClickListener(this);
        b24.setOnClickListener(this);
        b25.setOnClickListener(this);
        b26.setOnClickListener(this);
        b27.setOnClickListener(this);
        b28.setOnClickListener(this);
        b29.setOnClickListener(this);
        b30.setOnClickListener(this);
        b31.setOnClickListener(this);
        b32.setOnClickListener(this);
        b33.setOnClickListener(this);
        b34.setOnClickListener(this);
        b35.setOnClickListener(this);
        b36.setOnClickListener(this);
        b37.setOnClickListener(this);
        b38.setOnClickListener(this);
        b39.setOnClickListener(this);
        b40.setOnClickListener(this);
        b41.setOnClickListener(this);
        b42.setOnClickListener(this);
        b43.setOnClickListener(this);
        b44.setOnClickListener(this);
        b45.setOnClickListener(this);
        b46.setOnClickListener(this);
        b47.setOnClickListener(this);
        b48.setOnClickListener(this);
        b49.setOnClickListener(this);
        b50.setOnClickListener(this);
        b51.setOnClickListener(this);
        b52.setOnClickListener(this);
        b53.setOnClickListener(this);
        b54.setOnClickListener(this);
        b55.setOnClickListener(this);
        b56.setOnClickListener(this);
        b57.setOnClickListener(this);
        b58.setOnClickListener(this);
        b59.setOnClickListener(this);
        b60.setOnClickListener(this);
        b61.setOnClickListener(this);
        b62.setOnClickListener(this);
        b63.setOnClickListener(this);
        b64.setOnClickListener(this);
        b65.setOnClickListener(this);
        b66.setOnClickListener(this);
        b67.setOnClickListener(this);
        b68.setOnClickListener(this);
        b69.setOnClickListener(this);
        b70.setOnClickListener(this);
        b71.setOnClickListener(this);
        b72.setOnClickListener(this);
        b73.setOnClickListener(this);
        b74.setOnClickListener(this);
        b75.setOnClickListener(this);
        b76.setOnClickListener(this);
        b77.setOnClickListener(this);
        b78.setOnClickListener(this);
        b79.setOnClickListener(this);
        b80.setOnClickListener(this);
        b81.setOnClickListener(this);
        b82.setOnClickListener(this);
        b83.setOnClickListener(this);
        b84.setOnClickListener(this);
        b85.setOnClickListener(this);
        b86.setOnClickListener(this);
        b87.setOnClickListener(this);
        b88.setOnClickListener(this);
        b89.setOnClickListener(this);
        b90.setOnClickListener(this);
        b91.setOnClickListener(this);
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
            case R.id.button12:
                b10.setText(value);
                break;
            case R.id.button13:
                b11.setText(value);
                break;
            case R.id.button14:
                b12.setText(value);
                break;
            case R.id.button15:
                b13.setText(value);
                break;
            case R.id.button16:
                b14.setText(value);
                break;
            case R.id.button17:
                b15.setText(value);
                break;
            case R.id.button18:
                b16.setText(value);
                break;
            case R.id.button19:
                b17.setText(value);
                break;
            case R.id.button20:
                b18.setText(value);
                break;
            case R.id.button21:
                b19.setText(value);
                break;
            case R.id.button22:
                b20.setText(value);
                break;
            case R.id.button23:
                b21.setText(value);
                break;
            case R.id.button24:
                b22.setText(value);
                break;
            case R.id.button25:
                b23.setText(value);
                break;
            case R.id.button26:
                b24.setText(value);
                break;
            case R.id.button27:
                b25.setText(value);
                break;
            case R.id.button28:
                b26.setText(value);
                break;
            case R.id.button29:
                b27.setText(value);
                break;
            case R.id.button30:
                b28.setText(value);
                break;
            case R.id.button31:
                b29.setText(value);
                break;
            case R.id.button32:
                b30.setText(value);
                break;
            case R.id.button33:
                b31.setText(value);
                break;
            case R.id.button34:
                b32.setText(value);
                break;
            case R.id.button35:
                b33.setText(value);
                break;
            case R.id.button36:
                b34.setText(value);
                break;
            case R.id.button37:
                b35.setText(value);
                break;
            case R.id.button38:
                b36.setText(value);
                break;
            case R.id.button39:
                b37.setText(value);
                break;
            case R.id.button40:
                b38.setText(value);
                break;
            case R.id.button41:
                b39.setText(value);
                break;
            case R.id.button42:
                b40.setText(value);
                break;
            case R.id.button43:
                b41.setText(value);
                break;
            case R.id.button44:
                b42.setText(value);
                break;
            case R.id.button45:
                b43.setText(value);
                break;
            case R.id.button46:
                b44.setText(value);
                break;
            case R.id.button47:
                b45.setText(value);
                break;
            case R.id.button48:
                b46.setText(value);
                break;
            case R.id.button49:
                b47.setText(value);
                break;
            case R.id.button50:
                b48.setText(value);
                break;
            case R.id.button51:
                b49.setText(value);
                break;
            case R.id.button52:
                b50.setText(value);
                break;
            case R.id.button53:
                b51.setText(value);
                break;
            case R.id.button54:
                b52.setText(value);
                break;
            case R.id.button55:
                b53.setText(value);
                break;
            case R.id.button56:
                b54.setText(value);
                break;
            case R.id.button57:
                b55.setText(value);
                break;
            case R.id.button58:
                b56.setText(value);
                break;
            case R.id.button59:
                b57.setText(value);
                break;
            case R.id.button60:
                b58.setText(value);
                break;
            case R.id.button61:
                b59.setText(value);
                break;
            case R.id.button62:
                b60.setText(value);
                break;
            case R.id.button63:
                b61.setText(value);
                break;
            case R.id.button64:
                b62.setText(value);
                break;
            case R.id.button65:
                b63.setText(value);
                break;
            case R.id.button66:
                b64.setText(value);
                break;
            case R.id.button67:
                b65.setText(value);
                break;
            case R.id.button68:
                b66.setText(value);
                break;
            case R.id.button69:
                b67.setText(value);
                break;
            case R.id.button70:
                b68.setText(value);
                break;
            case R.id.button71:
                b69.setText(value);
                break;
            case R.id.button72:
                b70.setText(value);
                break;
            case R.id.button73:
                b71.setText(value);
                break;
            case R.id.button74:
                b72.setText(value);
                break;
            case R.id.button75:
                b73.setText(value);
                break;
            case R.id.button76:
                b74.setText(value);
                break;
            case R.id.button77:
                b75.setText(value);
                break;
            case R.id.button78:
                b76.setText(value);
                break;
            case R.id.button79:
                b77.setText(value);
                break;
            case R.id.button80:
                b78.setText(value);
                break;
            case R.id.button81:
                b79.setText(value);
                break;
            case R.id.button82:
                b80.setText(value);
                break;
            case R.id.button83:
                b81.setText(value);
                break;
            case R.id.button84:
                b82.setText(value);
                break;
            case R.id.button85:
                b83.setText(value);
                break;
            case R.id.button86:
                b84.setText(value);
                break;
            case R.id.button87:
                b85.setText(value);
                break;
            case R.id.button88:
                b86.setText(value);
                break;
            case R.id.button89:
                b87.setText(value);
                break;
            case R.id.button90:
                b88.setText(value);
                break;
            case R.id.button91:
                b89.setText(value);
                break;
            case R.id.button92:
                b90.setText(value);
                break;
        }
    }
}