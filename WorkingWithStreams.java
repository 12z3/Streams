package com.amigoscode.examples;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkingWithStreams {

    @Test
    void steams() {
        List<String> names = List.of("Amigoscode", "Alex", "Zara");

        char a = names.get(0).charAt(names.get(0).length() - 1);                     // -> 'e'
        names.stream().map(x -> x + " ")
                //.filter(x -> x.charAt(0) != a)
                .filter(x -> (x.length() - 1 == 4))
                .sorted()
                .forEach(System.out::print);
    }

    public static void main(String[] args) {
        WorkingWithStreams ws = new WorkingWithStreams();
        ws.steams();
    }
}
