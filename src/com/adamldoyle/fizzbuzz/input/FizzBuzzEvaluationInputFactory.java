package com.adamldoyle.fizzbuzz.input;

import com.adamldoyle.evaluationengine.evaluator.input.EvaluationInput;
import com.adamldoyle.evaluationengine.evaluator.input.EvaluationInputFactory;

public class FizzBuzzEvaluationInputFactory implements EvaluationInputFactory<Integer>
{

    @Override
    public EvaluationInput<Integer> getEvaluationInput(Integer data)
    {
        if (data % 3 == 0 && data % 5 == 0)
        {
            return new MergedInput(new ThreeInput(), new FiveInput());
        }
        if (data % 3 == 0)
        {
            return new ThreeInput();
        }
        else if (data % 5 == 0)
        {
            return new FiveInput();
        }
        return new OtherInput(data);
    }

}
