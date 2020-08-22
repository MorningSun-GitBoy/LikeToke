package com.lingxian.util;

public class UserUtils {
    public static String encryptionPasswd(String passwd){
        return EncryptionUtils.md5Encryption(passwd);
    }
    public static boolean judgeSignin(){
        boolean res = false;
        return res;
    }
    public static boolean isNameExist(String name){
        boolean res = false;
        return res;
    }
    public static boolean isUsed(String contect,String context){
        boolean res = false;
        return res;
    }
}
