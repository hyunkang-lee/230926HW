package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    /* 실행용 메소드*/
    public static void main(String[] args) {
        
        /* Calculater 클래스의 메소드를 호출해서 실행 */

        Calculator calc = new Calculator();

        calc.checkMethod();
        System.out.println(calc.sumTwoNumber(10,20));
        System.out.println("10과 20의 곱은 " + calc.multiTwoNumber2(10,20) + "입니다.");
        System.out.println(calc.multiTwoNumber(10,20));
    }
}
