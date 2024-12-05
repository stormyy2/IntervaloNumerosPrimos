package com.trabalhos.intervalonumerosprimos.controller;

import android.widget.EditText;

public class controller {
    public boolean verificaNumeroMaiorEMenor(EditText num1, EditText num2){
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());

        if(a < 0 || b < 0){
            return false;
        } else if(a > 50 || b > 50){
            return false;
        } else {
            return true;
        }
    }

    public String numerosPrimos(EditText num1, EditText num2){
        int a = Integer.parseInt(num1.getText().toString());
        int b = Integer.parseInt(num2.getText().toString());
        int i;
        StringBuilder res = new StringBuilder("Os números primos são: ");
        while(a <= b) {
            for (i = 2; i < a; i++) {
                if (a % i == 0) {
                    break;
                }
            }
            if(i == a){
                res.append(a).append(" ");
            }
            a++;
        }
        return res.toString();
    }
}
