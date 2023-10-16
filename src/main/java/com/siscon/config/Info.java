package com.siscon.config;

import lombok.Data;

/** 许可证类 */
@Data
public class Info {
  String vendor;
  String expiration;
  String generatedtime;
  String releasetime;
  String signature;
  String keep1;
  String keep2;
  String keep3;

  public String mostToString() {
    return "Info{"
        + "vendor='"
        + vendor
        + '\''
        + ", expiration='"
        + expiration
        + '\''
        + ", generatedtime='"
        + generatedtime
        + '\''
        + ", releasetime='"
        + releasetime
        + '\''
        + ", keep1='"
        + keep1
        + '\''
        + ", keep2='"
        + keep2
        + '\''
        + ", keep3='"
        + keep3
        + '\''
        + '}';
  }
}
