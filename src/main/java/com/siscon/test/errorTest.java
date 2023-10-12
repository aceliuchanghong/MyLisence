package com.siscon.test;

import com.siscon.error.ErrorG;


public class errorTest {
    public static void main(String[] args) {
        // WEIahTgKvcWMrQf1c+MKRLd24Dt7CXzgVTdDeBRc/Y6dSVUYihKeusQQ9C10CHUr
        System.out.println(new ErrorG().generateMsg("Hello sisconsavior,nice to meet you!"));
        System.out.println(new ErrorG().generateMsg("Hello w**orld!:cwei看美剧"));

        String x = "WEIahTgKvcWMrQf1c+MKRLd24Dt7CXzgVTdDeBRc/Y6dSVUYihKeusQQ9C10CHUr";
        String x2 = "E0GVGBbC+/AJkWOCBpLq3BT9liAqjY7pCEKQdrrNEZA=";
        System.out.println(new ErrorG().solveMsg(x));
    }
}
