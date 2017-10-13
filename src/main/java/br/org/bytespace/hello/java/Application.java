package br.org.bytespace.hello.java;

import java.util.Arrays;
import java.util.List;

import br.org.bytespace.hello.groovy.Developer;

/**
 * @author thiago-amm
 * @version v1.0.0 10/10/2017
 * @since v1.0.0
 */
public class Application {
    
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Groovy");
        Developer developer = new Developer("Dan", "Vega", "danvega@gmail.com", "cfaddict", languages);
        System.out.println(developer);
    }
    
}
