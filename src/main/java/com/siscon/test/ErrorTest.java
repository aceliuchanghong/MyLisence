package com.siscon.test;

import com.siscon.error.ErrorG;


public class ErrorTest {
    public static void main(String[] args) {
        System.out.println(new ErrorG().generateMsg("Hello world!"));
        System.out.println(new ErrorG().generateMsg("Hello w**orld!:cwei看美剧"));

        String x = "z7MEw781TJ6xNMPZ1xCxEQ==";
        String x2 = "E0GVGBbC+/AJkWOCBpLq3BT9liAqjY7pCEKQdrrNEZA=";
        System.out.println(new ErrorG().solveMsg(x2));
    }
}
