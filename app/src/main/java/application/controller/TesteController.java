package application.controller;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // a API rest é baseada no método http
@RequestMapping("/frutas")
public class TesteController {
    private String[] f = { "Maçã", "Banana", "Morango" };

    @GetMapping
    public Iterable<String> get() {
        return Arrays.asList(f);
    }

    @GetMapping("/{id}")
    public String get(int id) {
        return f[id];
    }
}
