package generator.customAnnotation;

import io.dummymaker.generator.IGenerator;

import java.util.ArrayList;
import java.util.List;

public class OperatorGenerator implements IGenerator<String> {
    private static List<String> operators=new ArrayList<>();
    private static int i = 0;

    static {
        operators.add("MTS");
        operators.add("Tele2");
        operators.add("Megafone");
        operators.add("Yota");
        operators.add("Beeline");
    }

    @Override
    public String generate() {
        return operators.get(i++);
    }

    public static int getOperatorsNumber(){
        return operators.size();
    }
}
