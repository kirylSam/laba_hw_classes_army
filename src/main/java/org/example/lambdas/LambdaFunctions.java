package org.example.lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class LambdaFunctions {

    ArrayList<Integer> numbers;

    public LambdaFunctions(ArrayList<Integer> numbers) {
        this.numbers = numbers;
        printArray();
    }

    public void removeEvenNumbersFromList() {
        //Predicate
        Predicate<Integer> isEven = x -> x % 2 == 0;
        numbers.removeIf(isEven);
        printArray();
    }

    public void addRandomNumberToArray() {
        //Supplier
        Supplier<Integer> generateRandomNumber = () -> (int)((Math.random() * 10) + 1);
        int randomNumber = generateRandomNumber.get();
        numbers.add(randomNumber);
    }

    public void printArray(){
        //Consumer
        Consumer<ArrayList> printArray = x -> System.out.println(x);
        System.out.println("ArrayList current state: ");
        printArray.accept(numbers);
    }


}
