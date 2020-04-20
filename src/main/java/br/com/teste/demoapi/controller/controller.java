package br.com.teste.demoapi.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @RequestMapping("/hello")
    public String get() {
    	counter.incrementAndGet();
    	return String.format(template, counter);
    }

    @RequestMapping("/bancodedados")
    public String getBD() {
    	return String.format(new Conexao().getStatusConexao());
    }
}
