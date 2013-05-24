package com.adamldoyle.fizzbuzz.input;

import com.adamldoyle.evaluationengine.evaluator.input.EvaluationInput;

public class MergedInput extends FizzBuzzInput
{

    public MergedInput(EvaluationInput<Integer> input1, EvaluationInput<Integer> input2)
    {
        super(input1.getData() * input2.getData());
    }

}
