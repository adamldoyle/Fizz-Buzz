package com.adamldoyle.fizzbuzz.input;

import com.adamldoyle.evaluationengine.evaluator.input.EvaluationInput;

public abstract class FizzBuzzInput implements EvaluationInput<Integer>
{

    protected final Integer data;

    public FizzBuzzInput(Integer data)
    {
        this.data = data;
    }

    @Override
    public Integer getData()
    {
        return data;
    }

    @Override
    public int hashCode()
    {
        return data.hashCode();
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == null)
        {
            return false;
        }

        if (!(other instanceof FizzBuzzInput))
        {
            return false;
        }

        return data.equals(((FizzBuzzInput) other).getData());
    }

}
