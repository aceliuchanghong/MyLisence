package com.siscon.test;

import com.siscon.generate.LicenseTools;

public class licenseToolsTest {
    public static void main(String[] args) {
        System.out.println(new LicenseTools().generateLicenseText());
        new LicenseTools().generateLicense();
    }
}
