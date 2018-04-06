package generator.customAnnotation.impl;

import io.dummymaker.generator.IGenerator;
import java.util.*;

public class PriceGenerator implements IGenerator<Integer> {

    @Override
    public Integer generate() {
        int min = 10, max = 500;

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
