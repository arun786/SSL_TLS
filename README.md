# Encryption Algorithm


## Symmetric key algorithm

![Symmetric Encryption](https://github.com/arun786/SSL_TLS/blob/main/src/main/resources/Screen%20Shot%202020-10-06%20at%205.19.52%20AM.png)


same key used for Encryption and Decryption

Different Types of Algorithm

![Algorithms](https://github.com/arun786/SSL_TLS/blob/main/src/main/resources/Screen%20Shot%202020-10-06%20at%205.34.47%20AM.png)


DES - length of the key is 56 bits
3DES - it does encryption 3 times one after the other

The above 2 algorithms are obsolete
 

AES - Advanced Encryption System, allows you to keys of different length. AES256, length of 256 bits.

AES - Is most secure and most modern

RSA - is an Asymmetric key

## HASH Function

### One Way Hash

![One Way Hash](https://github.com/arun786/SSL_TLS/blob/main/src/main/resources/Screen%20Shot%202020-10-06%20at%205.58.43%20AM.png)

It means that once the data is hashed, we cannot get back the data from Hash.

![Hashing Mechanism](https://github.com/arun786/SSL_TLS/blob/main/src/main/resources/Screen%20Shot%202020-10-06%20at%205.56.54%20AM.png)

In the above diagram, the data is hashed and along with the data, hash is sent over the wire, once it is received at the other end
the data is again hashed and compared with the hash value, if the hash value matches with the hash data sent, it is accepted
else the data is rejected.

Keys are optional which was used for encryption of the data. this is also helps in authentication of the sender.

## Hashing Algorithms

![hashing](https://github.com/arun786/SSL_TLS/blob/main/src/main/resources/Screen%20Shot%202020-10-06%20at%207.00.27%20AM.png)

### MD5


Demo on MacBook

![MD5](https://github.com/arun786/SSL_TLS/blob/main/src/main/resources/Screen%20Shot%202020-10-06%20at%206.19.51%20AM.png)


Java Code using apache common

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


### sha

Demo on Mac

![sha](https://github.com/arun786/SSL_TLS/blob/main/src/main/resources/Screen%20Shot%202020-10-06%20at%206.44.40%20AM.png)

Java code

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


### Encryption using asymmetric keys

![asymmetric](https://github.com/arun786/SSL_TLS/blob/main/src/main/resources/Screen%20Shot%202020-10-06%20at%207.20.19%20AM.png)

Owner will have both the private and the public key.

Sender will have the public key which will be shared by the owner.

Sender will send the data by encrypting data with the public key. 

Owner will decrypt the data using the private key.

#### Signing data using asymmetric keys

Sign and verify signature using asymmetric keys

![asymmetric](https://github.com/arun786/SSL_TLS/blob/main/src/main/resources/Screen%20Shot%202020-10-06%20at%203.49.54%20PM.png)

It's a two step process for both Owner of the data and Receiver of the data

Owner 

step 1 : Owner hashes the data using hash function

step 2 : Owner encrypts the hash using private key

Receiver

step 1 : Receiver decrypts the data using public key

step 2 : uses the same hash algo as the owner to hash the data

step 3 : compares the hash with the decrypted hash




### RSA

![RSA](https://github.com/arun786/SSL_TLS/blob/main/src/main/resources/Screen%20Shot%202020-10-06%20at%2011.27.23%20PM.png)

RSA is asymmetric key encryption algorithm.

It will have the same length of public key and private key.

### PKI

![PKI](https://github.com/arun786/SSL_TLS/blob/main/src/main/resources/Screen%20Shot%202020-10-06%20at%2011.40.35%20PM.png)

### Certificate

If certificate signed by CA(Certificate Authority) we trust CA - we trust the owner of the certificate

Self signed Certificate is certificate issued and signed by the owner, signature made by the private key owner.

The most important part of the certificate is the Public key

Private Key kept secret.

![Certificate](https://github.com/arun786/SSL_TLS/blob/main/src/main/resources/Screen%20Shot%202020-10-06%20at%2011.54.04%20PM.png)


### OpenSSL

#### commands used for generating private key on mac

$ openssl genrsa

this will generate a private key
 
#### To encrypt with aes256
 
$ openssl genrsa -aes256
 
 this will prompt for password, once you enter password, it will generate encrypted private key
 
#### to generate a private key with aes256 in a file

$ openssl genrsa -aes256 -out private.pem

#### to generate pulbic key from private key

$ openssl rsa -in private.pem -outform PEM -pubout -out public.pem

Note: you have to use the same password which was used for generating the private key.
 
 
RSA is not used for data encryption because

1. RSA is very slow
2. Bi-directional data encryption requires both private and public key on 
both sides. i.e. Owner and sender
