package com.siscon.test;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import com.siscon.config.KeyConfig;
import com.siscon.encode.MsgDealer;


public class msgDealerTest {
    public static void main(String[] args) {

        FileReader fileReader = new FileReader(new KeyConfig().ERROR_PATH);
        String result = fileReader.readString();

        String x = "WEIahTgKvcWMrQf1c+MKRLd24Dt7CXzgVTdDeBRc/Y6dSVUYihKeusQQ9C10CHUr";
        String x2 = "E0GVGBbC+/AJkWOCBpLq3BT9liAqjY7pCEKQdrrNEZA=";
        System.out.println(new MsgDealer().solveMsg(x));
        System.out.println(new MsgDealer().solveMsg(result));
    }
}
