package com.arematics.demo1;

public record TestDto(String test) {
    @Override
    public String toString() {
        return "TestDto{" +
                "test='" + test + '\'' +
                '}';
    }
}
