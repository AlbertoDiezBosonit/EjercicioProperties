package com.example.Ejercicio1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador1 {
    @Value("${VAR1}")
    String VAR1;

    @Value("${My.VAR2:var2 no tiene valor}")
    String VAR2;

    @Value("${VAR3:var3 no tiene valor}")
    String VAR3;

    @GetMapping("valores")
    public String getValores(){
        return "Retornamos los valores. VAR1=_"+VAR1+ "_ My.VAR2=_"+VAR2+"_";
    }

    @GetMapping("var3")
    public String getValores1(){
        return "Valor de var3 es: "+VAR3;
    }
}
