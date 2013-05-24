package com.adamldoyle.fizzbuzz.output;

import com.adamldoyle.evaluationengine.evaluator.output.EvaluationOutput;
import com.adamldoyle.fizzbuzz.messages.Messages;

public class FizzOutput implements EvaluationOutput<String>
{

    @Override
    public String getData()
    {
        return Messages.getString("Fizz.Output"); //$NON-NLS-1$
    }

}
