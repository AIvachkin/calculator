package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {

//    должен отвечать только за вычисления, чтобы в случае изменения вывода
//    сделать это только в контроллере

    public int plus(Integer a, Integer b) {
        return a + b ;
    }
    public int minus (Integer a, Integer b) {
        return a - b ;
    }
    public int multiply (Integer a, Integer b) {
        return a * b ;
    }
    public double divide (Integer a, Integer b) {
        return a.doubleValue() / b;
    }

    }
