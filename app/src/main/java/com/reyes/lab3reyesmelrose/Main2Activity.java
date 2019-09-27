package com.reyes.lab3reyesmelrose;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.view.View;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("SUBJECTS TAKEN");
        FileInputStream reader = null;
        String str = "";
        try {
            reader = openFileInput("data.txt");
            int token;
            while ((token = reader.read()) != -1) {
                str = str + (char) token;
            }
            reader.close();
            try {
                String[] list = str.split("_");
                ((CheckBox) (findViewById(R.id.checkBox))).setText(list[0]);
                ((CheckBox) (findViewById(R.id.checkBox2))).setText(list[1]);
                ((CheckBox) (findViewById(R.id.checkBox3))).setText(list[2]);
                ((CheckBox) (findViewById(R.id.checkBox4))).setText(list[3]);
                ((CheckBox) (findViewById(R.id.checkBox5))).setText(list[4]);
                ((CheckBox) (findViewById(R.id.checkBox6))).setText(list[5]);
                ((CheckBox) (findViewById(R.id.checkBox7))).setText(list[6]);
                ((CheckBox) (findViewById(R.id.checkBox8))).setText(list[7]);
            } catch (Exception e) {
                Log.d("error", "onCreate: subject not found...");
            }
        } catch (FileNotFoundException e) {
            Log.d("error", "onCreate: file not foumd...");
        } catch (IOException e) {
            Log.d("error", "onCreate: IO error");
        }
    }

    public void confirm(View v) {
        FileInputStream reader = null;
        String input1SP = "";
        String input2SP = "";
        String input3SP = "";
        String input4SP = "";
        String input5SP = "";
        String input6SP = "";
        String input7SP = "";
        String input8SP = "";

        try {
            reader = openFileInput("data.txt");
            int token1;
            int token2;
            int token3;
            int token4;
            int token5;
            int token6;
            int token7;
            int token8;
            while ((token1 = reader.read()) != -1) {
                input1SP = input1SP + (char) token1;
            }
            while ((token2 = reader.read()) != -1) {
                input2SP = input2SP + (char) token2;
            }
            while ((token3 = reader.read()) != -1) {
                input3SP = input3SP + (char) token3;
            }
            while ((token4 = reader.read()) != -1) {
                input4SP = input4SP + (char) token4;
            }
            while ((token5 = reader.read()) != -1) {
                input5SP = input5SP + (char) token5;
            }
            while ((token6 = reader.read()) != -1) {
                input6SP = input6SP + (char) token6;
            }
            while ((token7 = reader.read()) != -1) {
                input7SP = input7SP + (char) token7;
            }
            while ((token8 = reader.read()) != -1) {
                input8SP = input8SP + (char) token8;
            }
        } catch (FileNotFoundException e) {
            Log.d("error", "showData: file not found...");
        } catch (IOException e) {
            Log.d("error", "showData: IO error");
        }
    }
}