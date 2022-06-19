package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {
//    private int plus;
//    private int num2;

//    private int num1 ;
//    private int num2 ;
//    public CalculatorService (int num1, int num2) {};

//    public int plus (){
//        return num1 + num2;
//    }


    public String sum(int num1, int num2) {
        int sum = num1 + num2;
        return "5 + 5 = " + sum;
    }

    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    public String minus(int num1, int num2) {
        int minus = num1 - num2;
        return "5 - 5 = " + minus;
    }

    public String multiply(int num1, int num2) {
        int multiply = num1 * num2;
        return "5 * 5 = " + multiply;
    }

    public String divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            return "На ноль делить нельзя";
        } else {
            int divide = num1 / num2;
            return "5 / 5 = " + divide;
        }


    }
}
