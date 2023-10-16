package com.siscon.tools;

import cn.hutool.core.io.file.FileWriter;
import cn.hutool.json.JSONUtil;
import com.siscon.config.Info;
import com.siscon.config.KeyConfig;
import com.siscon.encode.MsgDealer;

/** 私钥签名,生成License */
public class LicenseTools {
  public void generateLicense() throws Exception {
    Info info = new AuthTools().getAuthInfo();
    String authContent = info.mostToString();
    byte[] sign = SignTools.sign(authContent.getBytes(), KeyTools.getPrivateKey());
    info.setSignature(new String(sign));
    String ans = JSONUtil.toJsonStr(info);
    FileWriter writer = new FileWriter(new KeyConfig().LICENSE_PATH);
    writer.write(MsgDealer.encodeMsg(ans));
  }
}
