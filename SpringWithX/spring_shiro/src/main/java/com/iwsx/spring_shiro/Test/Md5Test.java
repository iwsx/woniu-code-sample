package com.iwsx.spring_shiro.Test;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;

public class Md5Test {
  public static void main(String[] args) {

    String source = "111111";
    String solt = "iwsx";
    int itrations = 2;

    /*
    *   参数1：明文
    *   参数2：盐
    *   参数3：散列次数，比如散列两次，相当于md5(md5(''))
    * */
    Md5Hash md5Hash = new Md5Hash(source, solt, itrations);
    System.out.println(md5Hash.toString());

    SimpleHash simpleHash = new SimpleHash("md5", source, solt, itrations);
    System.out.println(simpleHash.toString());
  }
}
