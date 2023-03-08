package com.amigoscode.examples;

import com.amigoscode.beans.Person;
import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class GettingStarted {

    @Test
    public void imperativeApproach() throws IOException {
        // 1. Find people aged less or equal 18
        // 2. Then change implementation to find first 10 people

        List<Person> people = MockData.getPeople();
        List<Person> youngPerson = new ArrayList<>();
//
        int limit = 10, count = 0;
        for (Person el : people) {
            if (el.getAge() <= 18) {
                youngPerson.add(el);
                count++;
                if (count == limit) break;
            }
        }
        for (Person el : youngPerson) System.out.println(el);
    }

    @Test
    public void declarativeApproachUsingStreams() throws Exception {
        List<Person> people = MockData.getPeople();

        List<Person> youngPeople = people.stream()
                .filter(x -> (x.getAge() <= 18))
                .limit(10)
                .toList();
        youngPeople.forEach(System.out::println);
        //for (Person el: youngPeople) System.out.println(el);
    }
}
