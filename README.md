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
