package com.siscon.tools;

import cn.hutool.core.io.file.FileWriter;
import com.siscon.config.KeyConfig;

public class LicenseTools {
    public void generateLicense() throws Exception {
        String signContent = new AuthTools().generateAuthText();
        byte[] sign = SignTools.sign(signContent.getBytes(), KeyTools.getPrivateKey());
        // System.out.println(">>>>>>>>>>>>>>>>>>私钥签名结果 :" + new String(sign));
        FileWriter writer = new FileWriter(new KeyConfig().LICENSE_PATH);
        writer.write(new String(sign));
    }
}
