package com.adamldoyle.fizzbuzz.output;

import java.util.LinkedList;
import java.util.List;

import com.adamldoyle.evaluationengine.evaluator.output.EvaluationOutput;
import com.adamldoyle.evaluationengine.evaluator.output.EvaluationOutputCollector;

public class FizzBuzzOutputCollector implements EvaluationOutputCollector<String>
{

    List<String> collection = new LinkedList<String>();

    @Override
    public void collect(EvaluationOutput<String> output)
    {
        collection.add(output.getData());
    }

    @Override
    public Iterable<String> getOutput()
    {
        return collection;
    }

}
