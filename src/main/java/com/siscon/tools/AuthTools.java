package com.siscon.tools;

import com.siscon.config.Info;

/** 生成许可 */
public class AuthTools {
  public Info getAuthInfo() {
    /*vendor--------------------------------------------license供应商    sisconsavior
    expiration----------------------------------------license有效期    一年
    generated-----------------------------------------license生成时间   start
    release-------------------------------------------license发布时间   end
    signature-----------------------------------------签名             ** */
    Info info = new Info();
    info.setVendor("sisconsavior");
    info.setExpiration("365");
    info.setGeneratedtime("20231012");
    info.setReleasetime("20231030");
    info.setKeep1("keep1");
    info.setKeep2("keep2");
    info.setKeep3("keep3");
    return info;
  }
}
