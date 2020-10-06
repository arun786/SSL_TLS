package com.arun.algorithm;

import org.apache.commons.codec.digest.DigestUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * @author arun on 10/6/20
 */


public class HashingMD5 {

    public static void main(String[] args) {
        String password = "Hello World";
        String hashedPassword = DigestUtils.md5Hex(password).toUpperCase();
        System.out.println(hashedPassword); //o/p B10A8DB164E0754105B7A99BE72E3FE5
    }
}
