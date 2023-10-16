package com.siscon.encode;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.AES;

/**
 * 为了实现报错消息混淆
 * 1.输入报错信息msg,转化为对应的加密后的错误信息
 * 2.输入加密后的错误信息,转化为对应的解密后的错误信息msg
 * https://blog.csdn.net/qq_22076345/article/details/108632057
 * https://juejin.cn/post/7028204583264632840
 */
public class MsgDealer {

    /* 随机生成密钥
    byte[] key = SecureUtil.generateKey(SymmetricAlgorithm.AES.getValue()).getEncoded();*/

    private final byte[] key = {7, 119, 83, 32, -5, 32, -47, 12, 89, 97, 105, 118, 31, 19, -26, 111};

    public String generateMsg(String msg) {
        // 构建
        AES aes = SecureUtil.aes(key);
        // 加密
        String encrypt = aes.encryptBase64(msg);

        return encrypt;
    }

    public String solveMsg(String msg) {

        AES aes = SecureUtil.aes(key);

        String decryptStr = aes.decryptStr(msg);

        return decryptStr;
    }
}
