package com.siscon.test;

import com.siscon.error.ErrorG;


public class errorTest {
    public static void main(String[] args) {

        System.out.println(new ErrorG().generateMsg("Hello sisconsavior,nice to meet you!\n55"));
        System.out.println(new ErrorG().generateMsg("Hello w**orld!:cwei看美剧"));

        String x = "WEIahTgKvcWMrQf1c+MKRLd24Dt7CXzgVTdDeBRc/Y4CQjY1OrK0ccprwQBpaFY5";
        String x2 = "E0GVGBbC+/AJkWOCBpLq3BT9liAqjY7pCEKQdrrNEZA=";
        System.out.println(new ErrorG().solveMsg(x));
    }
}
