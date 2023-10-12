package com.siscon.generate;

import cn.hutool.core.io.file.FileWriter;
import com.siscon.config.Info;
import com.siscon.config.KeyConfig;


public class LicenseTools {
    private Info getLicense() {
        /*vendor--------------------------------------------license供应商    sisconsavior
        expiration----------------------------------------license有效期    一年
        generated-----------------------------------------license生成时间   start
        release-------------------------------------------license发布时间   end
        signature-----------------------------------------签名             0518*/

        Info info = new Info();
        info.setVendor("sisconsavior");
        info.setExpiration("365");
        info.setGeneratedtime("20231012");
        info.setReleasetime("20231030");
        info.setSignature("WEIahTgKvcWMrQf1c+MKRLd24Dt7CXzgVTdDeBRc/Y6dSVUYihKeusQQ9C10CHUr");
        info.setKeep1("keep1");info.setKeep2("keep2");info.setKeep3("keep3");
        return info;
    }

    public String generateLicenseText() {
        Info info = getLicense();
        return info.getVendor() + "@|@" + info.getExpiration() + "@|@" + info.getGeneratedtime() + "@|@" + info.getReleasetime() + "@|@" + info.getSignature() + "@|@" + info.getKeep1() + "@|@" + info.getKeep2() + "@|@" + info.getKeep3();
    }

    public void generateLicense() {
        String license = generateLicenseText();
        FileWriter writer = new FileWriter(new KeyConfig().LICENSE_PATH);
        writer.write(license);
    }
}
