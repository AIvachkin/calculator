package pro.sky.java.course2.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.service.CalculatorService;

@RestController
public class Controller {

    //    private int result ;
    private CalculatorService calculatorService = new CalculatorService();
////
//    public Controller (CalculatorService calculatorService){
//        this.calculatorService = calculatorService;
//    }

    @GetMapping("/plus")
    public String sum(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.sum(num1, num2);
    }

    @GetMapping("/calculator")

    public String hello() {
        return calculatorService.hello();
    }

    @GetMapping("/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam Integer num1, @RequestParam Integer num2) {

            return calculatorService.divide(num1, num2);
        }

//    @GetMapping("/minus")
//    public int minus(@RequestParam int num1, @RequestParam int num2){
//        return num1 - num2 ;
//    }

//    @GetMapping()
//    public String hello(){
//        return "Hello!" ;
//    }
    }

