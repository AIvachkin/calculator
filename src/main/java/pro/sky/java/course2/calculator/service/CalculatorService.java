package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorService {

//    должен отвечать только за вычисления, чтобы в случае изменения вывода
//    сделать это только в контроллере

    public Number plus(Integer a, Integer b) {
        return a + b ;
    }
    public Number minus (Integer a, Integer b) {
        return a - b ;
    }
    public Number multiply (Integer a, Integer b) {
        return a * b ;
    }
    public Number divide (Integer a, Integer b) {
        return a.doubleValue() / b;
    }

    }
