package com.hobart.chapter01.test;

/**
 * scala主函数运行包装了2个class文件
 */
public class TestScala {

    public static void main(String[] args) {
        TestScala$.MODULE.main(args);
    }
}

final class TestScala${
    public static final TestScala$ MODULE;
    static {
        MODULE=new TestScala$();
    }
    private TestScala$(){
    }
    
    public void main(String args[]){
        System.out.println("hello,scala,idea...");
    }
}
