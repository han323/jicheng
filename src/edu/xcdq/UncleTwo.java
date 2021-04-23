package edu.xcdq;

public class UncleTwo extends Uncle{
    public UncleTwo() {
        System.out.println("二舅的构造方法被创建");
    }

    //   独有的方法
    public void hejiu() {

        System.out.println("二舅喜欢喝酒");
    }

    //    复写   Override   父类中的方法
    public void faHongbao() {

        System.out.println("夹道中落，不发红包，改送祝福");
    }
}
