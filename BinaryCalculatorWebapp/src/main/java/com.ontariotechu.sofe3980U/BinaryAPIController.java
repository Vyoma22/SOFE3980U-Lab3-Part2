package com.ontariotechu.sofe3980U;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class BinaryAPIController {

    @GetMapping("/add")
    public String addString(@RequestParam(name="operand1", required=false, defaultValue="") String operand1,
                            @RequestParam(name="operand2", required=false, defaultValue="") String operand2) {
        Binary number1 = new Binary(operand1);
        Binary number2 = new Binary(operand2);
        return Binary.add(number1, number2).getValue();
        // Example: http://localhost:8080/add?operand1=111&operand2=1010
    }

    @GetMapping("/add_json")
    public BinaryAPIResult addJSON(@RequestParam(name="operand1", required=false, defaultValue="") String operand1,
                                   @RequestParam(name="operand2", required=false, defaultValue="") String operand2) {
        Binary number1 = new Binary(operand1);
        Binary number2 = new Binary(operand2);
        return new BinaryAPIResult(number1, "add", number2, Binary.add(number1, number2));
        // Example: http://localhost:8080/add_json?operand1=111&operand2=1010
    }

    @GetMapping("/or")
    public String orString(@RequestParam(name="operand1", required=false, defaultValue="") String operand1,
                           @RequestParam(name="operand2", required=false, defaultValue="") String operand2) {
        Binary number1 = new Binary(operand1);
        Binary number2 = new Binary(operand2);
        return Binary.or(number1, number2).getValue();
        // Example: http://localhost:8080/or?operand1=111&operand2=1010
    }

    @GetMapping("/or_json")
    public BinaryAPIResult orJSON(@RequestParam(name="operand1", required=false, defaultValue="") String operand1,
                                  @RequestParam(name="operand2", required=false, defaultValue="") String operand2) {
        Binary number1 = new Binary(operand1);
        Binary number2 = new Binary(operand2);
        return new BinaryAPIResult(number1, "or", number2, Binary.or(number1, number2));
        // Example: http://localhost:8080/or_json?operand1=111&operand2=1010
    }

    @GetMapping("/multiply")
    public String multiplyString(@RequestParam(name="operand1", required=false, defaultValue="") String operand1,
                                 @RequestParam(name="operand2", required=false, defaultValue="") String operand2) {
        Binary number1 = new Binary(operand1);
        Binary number2 = new Binary(operand2);
        return Binary.multiply(number1, number2).getValue();
        // Example: http://localhost:8080/multiply?operand1=111&operand2=1010
    }

    @GetMapping("/multiply_json")
    public BinaryAPIResult multiplyJSON(@RequestParam(name="operand1", required=false, defaultValue="") String operand1,
                                        @RequestParam(name="operand2", required=false, defaultValue="") String operand2) {
        Binary number1 = new Binary(operand1);
        Binary number2 = new Binary(operand2);
        return new BinaryAPIResult(number1, "multiply", number2, Binary.multiply(number1, number2));
        // Example: http://localhost:8080/multiply_json?operand1=111&operand2=1010
    }
}
