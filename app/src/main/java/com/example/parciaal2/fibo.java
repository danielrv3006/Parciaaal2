package com.example.parciaal2;

import android.view.View;

public class fibo {

    public fibo(View txt_numero) {
    }

    public static int fibo (int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }

    }


}
