package com.iwsx.demo05.MyTest;

public class MyApp {

  public static int testAdd(int a, int b, Calculate cal){
    return cal.add(a, b);
  }

  public static void main(String[] args) {
    MyAdd myAdd = new MyAdd();
    int i = testAdd(1, 2,(a, b) -> {
      return myAdd.add(a, b);
    });
    System.out.println("i：" + i);

    int i2 = testAdd(1, 2, myAdd::add);
    System.out.println("i2：" + i2);
  }
}
