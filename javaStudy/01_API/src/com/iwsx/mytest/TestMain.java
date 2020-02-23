package com.iwsx.mytest;

public class TestMain {

  public static void main(String[] args) {
    int a = 1;
    Integer integer = new Integer(1);
    System.out.println(integer.toString());

    Boolean aBoolean = new Boolean(false);
    if(aBoolean){
      System.out.println("我被打印出来了");
    }

    Boolean aBoolean2 = new Boolean(true);
    if(aBoolean2){
      System.out.println("我被打印出来了2");
    }

  }
}
