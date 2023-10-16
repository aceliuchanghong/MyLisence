# myLisence
想要做一个工具包,可以实现lisence的控制,到期之后需要重新续lisence,并且可以控制lisence的使用次数,以及使用时间

```参考
https://blog.csdn.net/qq_36270361/article/details/105815781
https://github.com/kobeyk/license
```

- 加密，那肯定是不希望别人知道我的消息，所以只有我才能解密，所以可得出公钥负责加密，私钥负责解密
- 签名，那肯定是不希望有人冒充我发消息，只有我才能发布这个签名，所以可得出私钥负责签名，公钥负责验证

## 私钥 证书 公钥
用JDK自带keytool工具制作:使用CMD命令进入JDK的bin目录下
```
## 1. 生成私匙库
# validity：私钥的有效期多少天
# alias：私钥别称
# keyalg：指定加密算法，默认是DSA
# keystore: 指定私钥库文件的名称(生成在当前目录)
# storepass：指定私钥库的密码(获取keystore信息所需的密码) 
# keypass：指定别名条目的密码(私钥的密码) 
# CN（Common Name）: 用于指定证书的通用名称，一般用于标识证书的拥有者或主体。在这个例子中，通用名称为"mine"。
# OU（Organizational Unit）: 用于指定证书拥有者所属的组织单位。在这个例子中，组织单位为"test"。
# O（Organization）: 用于指定证书拥有者所属的组织。在这个例子中，组织为"test"。
# L（Locality）: 用于指定证书拥有者所在的城市或地区。在这个例子中，城市为"gz"（广州）。
# ST（State/Province）: 用于指定证书拥有者所在的州或省份。在这个例子中，州或省份为"gd"（广东）。
# C（Country）: 用于指定证书拥有者所在的国家。在这个例子中，国家为"CN"（中国）。
keytool -genkeypair -keysize 2048 -validity 730 -alias "privateKey" -keyalg "RSA" -keystore "D:\aproject\others\MyLisence\src\main\resources\privateKey.keystore" -storepass "3141592653" -keypass "3141592653" -dname "CN=mine, OU=test, O=test, L=gz, ST=gd, C=CN"



## 2. 生成证书
# alias：私钥别称
# keystore：指定私钥库的名称(在当前目录查找)
# storepass: 指定私钥库的密码
# file：证书名称
keytool -exportcert -alias "privateKey" -keystore "D:\aproject\others\MyLisence\src\main\resources\privateKey.keystore" -storepass "3141592653" -file "D:\aproject\others\MyLisence\src\main\resources\publicCer.cer"



## 3. 生成公匙库
# alias：公钥别称
# file：证书名称
# keystore：公钥文件名称
# storepass：指定私钥库的密码
keytool -import -alias "publicKey" -file "D:\aproject\others\MyLisence\src\main\resources\publicCer.cer" -keystore "D:\aproject\others\MyLisence\src\main\resources\publicKey.keystore" -storepass "3141592653"


```

### 生成License 
```
首先，要确定License的内容，确定业务种类、业务范围、有效时间或者其他限制性要求
vendor--------------------------------------------license供应商    sisconsavior
expiration----------------------------------------license有效期    一年
generated-----------------------------------------license生成时间   start
release-------------------------------------------license发布时间   end
signature-----------------------------------------签名             0518

制作License实际上就是对于授权信息进行签名的过程 需要 私匙用于==>签名

私匙 加密 许可 = License
```

### 验证lisence



### 混淆java代码




