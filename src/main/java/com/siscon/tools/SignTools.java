package com.siscon.tools;

import java.security.PrivateKey;
import java.security.Signature;
import java.util.Base64;

/** 签名方法 */
public class SignTools {
  // 非对称密钥算法
  private static final String KEY_ALGORITHM = "SHA1withRSA";

  /** 使用私钥进行许可内容签名 */
  public static byte[] sign(byte[] message, PrivateKey privateKey) throws Exception {
    Signature signature;
    signature = Signature.getInstance(KEY_ALGORITHM);
    signature.initSign(privateKey);
    signature.update(message);
    return Base64.getEncoder().encode(signature.sign());
  }
}
