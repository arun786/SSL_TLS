package com.arun.algorithm;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author arun on 10/6/20
 */

public class HashingSHA {

    public static void main(String[] args) {

        String password = "Hello World";
        String sha1hexh = DigestUtils.sha1Hex(password);
        System.out.println(sha1hexh); //o/p 0a4d55a8d778e5022fab701977c5d840bbc486d0

        String sha256Hex = DigestUtils.sha256Hex(password);
        System.out.println(sha256Hex); //o/p a591a6d40bf420404a011733cfb7b190d62c65bf0bcda32b57b277d9ad9f146e

        String sha512Hex = DigestUtils.sha512Hex(password);
        System.out.println(sha512Hex); //2c74fd17edafd80e8447b0d46741ee243b7eb74dd2149a0ab1b9246fb30382f27e853d8585719e0e67cbda0daa8f51671064615d645ae27acb15bfb1447f459b
    }

}
