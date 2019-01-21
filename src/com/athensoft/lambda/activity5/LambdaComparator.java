package com.athensoft.lambda.activity5;

import java.util.Comparator;

public class LambdaComparator {
    public static void main(String[] args) {
        Comparator<String> stringComparator = (String a, String b)-> {return a.compareTo(b);};

        int lambdaComparison = stringComparator.compare("hello","world");
        System.out.println(lambdaComparison);
    }
}
