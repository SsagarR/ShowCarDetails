package com.example.showcardetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et_make,et_year,et_color,et_price,et_size;
    private Button btn_create;
    private TextView tv_finalresult;
    private  String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        et_make=findViewById(R.id.et_make);
        et_year=findViewById(R.id.et_year);
        et_color=findViewById(R.id.et_color);
        et_price=findViewById(R.id.et_price);
        et_size=findViewById(R.id.et_size);
        btn_create=findViewById(R.id.btn_create);
        tv_finalresult=findViewById(R.id.tv_finalresult);

        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adddata();
            }
        });

    }
    public void adddata(){
        data="Care to make "+et_make.getText().toString()+"\r\n"
                +"Which year"+et_year.getText().toString()+"; Color:"+et_color.getText().toString()+";\r\n"
                +"price:"+et_price.getText().toString()+"; Engine Size"+et_size.getText().toString()+";\r\n"+"\r\n";

        tv_finalresult.setText(tv_finalresult.getText().toString()+data);
    }

}
