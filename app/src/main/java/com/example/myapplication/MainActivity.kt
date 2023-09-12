package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }

    lateinit var btnEqual: Button
    lateinit var txtVar1: EditText
    lateinit var txtVar2:EditText
    lateinit var txtOperator:EditText
    lateinit var txtResult: TextView
    private var var1:Float = 0f
    private var var2:Float = 0f
    private var result:Float = 0f
    var operator: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnEqual = findViewById(R.id.btnEqual);
        txtVar1 = findViewById(R.id.txtVar1);
        txtVar2 = findViewById(R.id.txtVar2);
        txtOperator = findViewById(R.id.txtOperator);
        txtResult = findViewById(R.id.txtResult);

        btnEqual.setOnClickListener() {

            var1 = txtVar1.getText().toString().toFloat()
            var2 = txtVar2.getText().toString().toFloat()
            operator = txtOperator.getText().toString();
            if(operator.equals("+")) {
                result = var1 + var2;
            } else if(operator.equals("-")) {
                result = var1 - var2;
            } else if(operator.equals("*")) {
                result = var1 * var2;
            } else if(operator.equals("/")) {
                result = var1 / var2;
            }
            txtResult.setText(result.toString());

        }
    }
}