package com.siscon.config;

/** 配置路径 */
public class KeyConfig {

  // 当前项目绝对路径
  public static final String BASE_FILE_PATH =
      System.getProperty("user.dir") + "\\src\\main\\resources";

  // 私钥存放路径
  public static final String PRIVATE_KEY_FILE_PATH = BASE_FILE_PATH + "/privateKey.keystore";
  // 公钥存放路径
  public static final String PUBLICKEY_FILE_PATH = BASE_FILE_PATH + "/publicKey.keystore";
  // Cer证书存放路径
  public static final String CER_FILE_PATH = BASE_FILE_PATH + "/publicCer.cer";

  // 私钥别名
  public static final String PRIVATE_ALIAS = "privateKey";
  // 公钥别名
  public static final String PUBLIC_ALIAS = "publicKey";
  // 获取keystore所需的密码
  public static final String KEYSTORE_PASSWORD = "3141592653";
  // 获取私钥所需密码
  public static final String KEY_PASSWORD = "3141592653";

  // Auth路径
  public static final String AUTH_PATH = BASE_FILE_PATH + "/MyAuth.xml";
  // licesen路径
  public static final String LICENSE_PATH = BASE_FILE_PATH + "/MyLicense.license";
  // error示范路径
  public static final String ERROR_PATH = BASE_FILE_PATH + "/MyError.error";
}
