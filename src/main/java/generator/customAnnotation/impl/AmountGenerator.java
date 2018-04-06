package generator.customAnnotation.impl;

import io.dummymaker.generator.IGenerator;

import java.util.Random;

public class AmountGenerator implements IGenerator<Integer> {
    @Override
    public Integer generate() {
        Random r=new Random();
        int min=1;
        int max=500;
        return r.nextInt((max-min)+1)+min;
    }
}
