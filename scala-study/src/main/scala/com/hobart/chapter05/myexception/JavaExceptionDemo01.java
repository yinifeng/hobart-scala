package com.hobart.chapter05.myexception;

public class JavaExceptionDemo01 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 10 ;
            int c = b / a;
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (Exception e) { //大的异常不能写在前面
            e.printStackTrace();
        } finally {
            System.out.println("finally块执行......");
        }
        System.out.println("ok~~~");
    }
}
