package com.example.admin.piggy_bank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button b1;
    EditText e1,e2;
    String no,message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.button);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 no=e1.getText().toString();
                 message=e2.getText().toString();
                SmsManager sms = SmsManager.getDefault();
                sms.sendTextMessage(no,null,message,null,null);

                Toast.makeText(MainActivity.this,"Sent",Toast.LENGTH_LONG).show();
                e1.setText("");
                e2.setText("");
            }
        });
    }
}