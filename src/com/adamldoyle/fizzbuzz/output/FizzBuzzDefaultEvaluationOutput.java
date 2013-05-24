package com.adamldoyle.fizzbuzz.output;

import com.adamldoyle.evaluationengine.evaluator.input.EvaluationInput;
import com.adamldoyle.evaluationengine.evaluator.output.DefaultEvaluationOutput;

public class FizzBuzzDefaultEvaluationOutput implements DefaultEvaluationOutput<Integer, String>
{

    private String data;

    @Override
    public String getData()
    {
        return data;
    }

    @Override
    public void resolveInput(EvaluationInput<Integer> input)
    {
        data = String.valueOf(input.getData());
    }

}
