package com.teachmeskills.lesson14.task1;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Runnur {

    public static List <Integer> randomInts(){
        return new Random()
                .ints(14, 7, 17)
                .boxed()
                .collect(Collectors.toList());

    }
}
