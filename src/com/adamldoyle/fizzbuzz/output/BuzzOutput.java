package com.adamldoyle.fizzbuzz.output;

import com.adamldoyle.evaluationengine.evaluator.output.EvaluationOutput;
import com.adamldoyle.fizzbuzz.messages.Messages;

public class BuzzOutput implements EvaluationOutput<String>
{

    @Override
    public String getData()
    {
        return Messages.getString("Buzz.Output"); //$NON-NLS-1$
    }

}
