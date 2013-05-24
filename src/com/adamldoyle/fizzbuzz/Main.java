package com.adamldoyle.fizzbuzz;

import java.io.IOException;

import com.adamldoyle.evaluationengine.evaluator.CycleOverException;
import com.adamldoyle.evaluationengine.evaluator.NoEvaluationException;

public class Main
{

    public static void main(String[] args) throws NoEvaluationException, CycleOverException, IOException, InterruptedException
    {

        FizzBuzz fizzBuzz = new FizzBuzz();

        fizzBuzz.start();

        fizzBuzz.join();

        fizzBuzz.print(System.out);

    }

}
