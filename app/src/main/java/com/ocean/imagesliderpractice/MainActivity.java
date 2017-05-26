package com.ocean.imagesliderpractice;

import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText leftUname,leftDept,rightUname,rightDept;
    TextInputLayout textLeftUname,textLeftDept,textRightUname,textRightDept;
    Button btLeft,btRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLeft = (Button)findViewById(R.id.buttonLeft);
        btRight = (Button)findViewById(R.id.buttonRight);

        textLeftUname = (TextInputLayout)findViewById(R.id.textInputLayout);
        textLeftDept = (TextInputLayout)findViewById(R.id.textInputLayout2);
        textRightUname = (TextInputLayout)findViewById(R.id.textInputLayout3);
        textRightDept  = (TextInputLayout)findViewById(R.id.textInputLayout4);

        leftUname = (EditText)findViewById(R.id.leftUname);
        leftDept = (EditText)findViewById(R.id.editText);
        rightUname = (EditText)findViewById(R.id.rightUname);
        rightDept = (EditText)findViewById(R.id.rightDept);

        btLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lname = leftUname.getText().toString();
                String lDept = leftDept.getText().toString();
                Toast.makeText(MainActivity.this, "Fname = "+lname+ "\n" +"Dept = "+lDept , Toast.LENGTH_SHORT).show();
            }
        });

        btRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rName = rightUname.getText().toString();
                String rDept = rightDept.getText().toString();
                Snackbar snack = Snackbar.make(v,"Uname : "+rName + "\n" +"Dept : "+rDept,Snackbar.LENGTH_SHORT);
                snack.show();
            }
        });



    }
}
