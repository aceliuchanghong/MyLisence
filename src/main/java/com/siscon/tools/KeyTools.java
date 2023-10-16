package com.siscon.tools;

import com.siscon.config.KeyConfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.KeyStore;
import java.security.PrivateKey;

public class KeyTools
{
    /**
     * 通过keystore获取private key
     * 获取私钥工具类
     *
     */
    public static PrivateKey getPrivateKey() {

        FileInputStream is = null;
        PrivateKey privateKey = null;
        try {
            KeyStore keyStore = KeyStore.getInstance("JKS");
            is = new FileInputStream(new File(KeyConfig.PRIVATE_KEY_FILE_PATH));
            keyStore.load(is, KeyConfig.KEYSTORE_PASSWORD.toCharArray());
            privateKey = (PrivateKey) keyStore.getKey(KeyConfig.PRIVATE_ALIAS, KeyConfig.KEY_PASSWORD.toCharArray());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return privateKey;
    }

}

