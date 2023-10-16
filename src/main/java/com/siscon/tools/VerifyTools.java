package com.siscon.tools;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.json.JSONUtil;
import com.siscon.config.Info;
import com.siscon.config.KeyConfig;

import java.security.PublicKey;
import java.security.Signature;
import java.util.Base64;

/**
 * 验证License
 */
public class VerifyTools
{
    //非对称密钥算法
    private static final String KEY_ALGORITHM = "SHA1withRSA";

    /**
     * 验证签名
     */
    public static boolean verifySign(byte[] message, byte[] signMessage, PublicKey publicKey) throws Exception {
        Signature signature;
        signature = Signature.getInstance(KEY_ALGORITHM);
        signature.initVerify(publicKey);
        signature.update(message);
        return signature.verify(Base64.getDecoder().decode(signMessage));
    }

    /**
     * 校验示例
     * @throws Exception
     */
    public void verifyLicense() throws Exception {
        // 拿到license内容
        FileReader fileReader = new FileReader(new KeyConfig().LICENSE_PATH);
        String license = fileReader.readString();
        Info info = JSONUtil.toBean(license, Info.class);

        //获取签名
        String signature = info.getSignature();
        //获取授权内容
        String authContent = info.mostToString();
        //校验
        boolean verify = VerifyTools.verifySign(authContent.getBytes(), signature.getBytes(), KeyTools.getPublicKeyFromCer());
        System.out.println(">>>>>>>>>>>>>>>>>>公钥验签结果 :" + verify);
    }

}

