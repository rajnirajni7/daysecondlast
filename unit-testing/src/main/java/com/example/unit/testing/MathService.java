package com.example.unit.testing;

import org.springframework.stereotype.Service;

@Service
public class MathService {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
