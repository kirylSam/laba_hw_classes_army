package org.example.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LambdaFunctions {

    static Logger logger;

    ArrayList<Integer> numbers;

    public LambdaFunctions() {
        this.logger = LogManager.getLogger("org.example.lambdas.LambdaFunctions");
    }

    public LambdaFunctions(ArrayList<Integer> numbers) {
        this.logger = LogManager.getLogger("org.example.lambdas.LambdaFunctions");
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
        Consumer<ArrayList> printArray = x -> logger.info(x);
        logger.info("ArrayList current state: ");
        printArray.accept(numbers);
    }

    public void printArrayWithIndexes() {
        //BiConsumer
        Map<Integer, Integer> map = new HashMap<>();
        for (int element: numbers) {
            map.put(numbers.indexOf(element), element);
        }
        BiConsumer<Integer, Integer> printArrayWithIndexes = (index, value) ->
                logger.info("Index: " + index + " Value: " + value);

        map.forEach(printArrayWithIndexes);
    }

    public void getArrayLength() {
        //Function
        Function<ArrayList, Integer> func = x -> x.size();
        Integer apply = func.apply(this.numbers);
        logger.info("Array length is: " + apply);
    }

    public void isArrayLongerThan(int length){
        Predicate<ArrayList> isLongerThan = x -> x.size() > length;
        boolean result = isLongerThan.test(this.numbers);
        logger.info("Array is longer than " + length + " - " + result);
    }
}
