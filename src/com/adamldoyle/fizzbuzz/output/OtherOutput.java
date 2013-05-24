package com.adamldoyle.fizzbuzz.output;

import com.adamldoyle.evaluationengine.evaluator.output.EvaluationOutput;

public class OtherOutput implements EvaluationOutput<String>
{

    private String data;

    public OtherOutput(String data)
    {
        this.data = data;
    }

    @Override
    public String getData()
    {
        return data;
    }

}
