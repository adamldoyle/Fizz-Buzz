package com.adamldoyle.fizzbuzz;

import java.io.IOException;
import java.io.OutputStream;

import com.adamldoyle.evaluationengine.EvaluationEngine;
import com.adamldoyle.evaluationengine.evaluator.Evaluator;
import com.adamldoyle.evaluationengine.evaluator.input.EvaluationInputFactory;
import com.adamldoyle.fizzbuzz.input.FiveInput;
import com.adamldoyle.fizzbuzz.input.FizzBuzzEvaluationInputFactory;
import com.adamldoyle.fizzbuzz.input.MergedInput;
import com.adamldoyle.fizzbuzz.input.ThreeInput;
import com.adamldoyle.fizzbuzz.output.BuzzOutput;
import com.adamldoyle.fizzbuzz.output.FizzBuzzDefaultEvaluationOutput;
import com.adamldoyle.fizzbuzz.output.FizzBuzzOutput;
import com.adamldoyle.fizzbuzz.output.FizzBuzzOutputCollector;
import com.adamldoyle.fizzbuzz.output.FizzOutput;

public class FizzBuzz extends EvaluationEngine<Integer, String>
{

    private FizzBuzzOutputCollector collector = new FizzBuzzOutputCollector();

    public FizzBuzz()
    {
        this(1, 100);
    }

    public FizzBuzz(int start, int stop)
    {
        this(start, stop, 1);
    }

    public FizzBuzz(int start, int stop, int step)
    {
        Evaluator<Integer, String> evaluator = new Evaluator<Integer, String>();
        evaluator.registerDefaultEvaluation(new FizzBuzzDefaultEvaluationOutput());
        evaluator.registerEvaluation(new MergedInput(new ThreeInput(), new FiveInput()), new FizzBuzzOutput());
        evaluator.registerEvaluation(new ThreeInput(), new FizzOutput());
        evaluator.registerEvaluation(new FiveInput(), new BuzzOutput());

        EvaluationInputFactory<Integer> factory = new FizzBuzzEvaluationInputFactory();

        LoopEvaluationCycle cycle = new LoopEvaluationCycle(start, stop, step);

        setEvaluator(evaluator);

        setInputFactory(factory);

        setOutputCollector(collector);

        setCycle(cycle);
    }

    public void print(OutputStream stream) throws IOException
    {
        for (String data : collector.getOutput())
        {
            stream.write(data.getBytes());
            stream.write(System.getProperty("line.separator").getBytes()); //$NON-NLS-1$
        }
    }

}
