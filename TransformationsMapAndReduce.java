package com.amigoscode.examples;

import com.amigoscode.beans.Car;
import com.amigoscode.beans.Person;
import com.amigoscode.beans.PersonDTO;
import com.amigoscode.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TransformationsMapAndReduce {

    /**
     * -> map{}
     * Не променя списъка от тип "People".
     * Създава нов списък от тип "personDTO" и в него пази част от стойностите на "People".
     * -> Преобразува едни и същи данни от един тип в друг.
     */

    @Test
    void yourFirstTransformationWithMap() throws IOException {
        List<Person> people = MockData.getPeople();
        List<PersonDTO> anotherListOfThesePeoples = people.stream()
                .filter(person -> person.getAge() > 20 && person.getAge() < 50)
                .map(person -> new PersonDTO(
                        person.getId(),
                        person.getFirstName(),
                        person.getAge()))
                .limit(5)
                .toList();

        anotherListOfThesePeoples.forEach(System.out::println);
    }

    @Test
    void mapToDoubleAndFindAverageCarPrice() throws IOException {
        List<Car> cars = MockData.getCars();
    }

    @Test
    public void reduce() {
        int[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};
    }
}

