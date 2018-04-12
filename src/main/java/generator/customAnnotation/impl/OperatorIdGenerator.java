package generator.customAnnotation.impl;

import io.dummymaker.generator.IGenerator;

import java.util.Random;

public class OperatorIdGenerator implements IGenerator<Integer> {

    @Override
    public Integer generate() {
        int maxNumber = 5;

        Random r = new Random();
        return r.nextInt(maxNumber)+1;
    }

}