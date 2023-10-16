package com.siscon;

import cn.hutool.core.io.file.FileReader;
import com.siscon.config.KeyConfig;
import com.siscon.encode.MsgDealer;
import com.siscon.tools.LicenseTools;
import com.siscon.tools.VerifyTools;

public class Main {
    public static void main(String[] args) {
        try {
            new LicenseTools().generateLicense();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            if(new VerifyTools().verifyLicense()){
                System.out.println(new MsgDealer().solveMsg("NB7jfM5ksM1cLS9+M/ZCcuMX6bOJYR+r5LZdw52dfdk="));
            }
        } catch (Exception e) {
            FileReader fileReader = new FileReader(new KeyConfig().ERROR_PATH);
            String result = fileReader.readString();
            System.out.println(new MsgDealer().solveMsg(result));
        }
    }
}