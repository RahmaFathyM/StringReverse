package com.example.stringmethods;

import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d("Phone Num",phoneNum(0));
        Log.d("Phone Num",phoneNum(1));
        Log.d("Phone Num",phoneNum(4));
        Log.d("Phone Num",phoneNum(7));
        Log.d("Phone Num",phoneNum(8));
    }
    public String phoneNum(int index){

        ArrayList<Student> studentList=new ArrayList<>();
        studentList.add(new Student("Rahma","122","Cairo"));
        studentList.add(new Student("Rahma","897","Cairo"));
        studentList.add(new Student("Rahma","1234","Cairo"));
        studentList.add(new Student("Rahma","12285","Cairo"));
        studentList.add(new Student("Rahma","122963","Cairo"));
        studentList.add(new Student("Rahma","122147","Cairo"));
        studentList.add(new Student("Rahma","12274123","Cairo"));
        studentList.add(new Student("Rahma","122774111","Cairo"));
        if(index<=studentList.size()-1){

       return( studentList.get(index)).getPhoneNum();}
        else{
            return "invalid num";
        }
    }








//    public void initView() {
//        final EditText Et_inputText = findViewById(R.id.Et_inputText);
//        Button btn_reverse = findViewById(R.id.btn_reverse);
//        final TextView reverseText = findViewById(R.id.reverseText);
//
//        btn_reverse.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(Et_inputText.getText().toString().isEmpty()){
//                    Et_inputText.requestFocus();
//                    Et_inputText.setError("It's Required");
//                }
//                else{
//                String out = reversrString(Et_inputText.getText() + "");
//                reverseText.setText(out);}
//            }
//        });
//    }
//
//    public String reversrString(String string) {
//       int textLength= string.length();
////        StringBuilder stringBuilder = new StringBuilder(string);
////        return (stringBuilder.reverse()).toString();
//        String reverse=" ";
//        for(int i=textLength-1;i>=0;i--){
//           reverse=reverse+string.charAt(i);
//
//        }
//        return reverse;
//    }
}
