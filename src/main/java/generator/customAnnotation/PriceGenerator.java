package generator.customAnnotation;

import io.dummymaker.generator.IGenerator;

import java.util.Random;

public class PriceGenerator implements IGenerator<Integer> {

    @Override
    public Integer generate() {
        Random r=new Random();
        int min=10;
        int max=100;
        return r.nextInt((max-min)+1)+min;
    }

}
