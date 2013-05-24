package com.adamldoyle.fizzbuzz;

import com.adamldoyle.evaluationengine.evaluator.CycleOverException;
import com.adamldoyle.evaluationengine.evaluator.EvaluationCycle;

public class LoopEvaluationCycle implements EvaluationCycle<Integer>
{

    private final int end;
    private final int step;
    private int current;

    public LoopEvaluationCycle(int begin, int end, int step)
    {
        this.end = end;
        this.step = step;
        current = begin;
    }

    @Override
    public boolean hasNext()
    {
        return current <= end;
    }

    @Override
    public Integer getNext() throws CycleOverException
    {
        if (!hasNext())
        {
            throw new CycleOverException();
        }

        int previous = current;
        current += step;
        return previous;
    }

}
