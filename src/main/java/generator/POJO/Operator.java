package generator.POJO;

import generator.customAnnotation.GenOperator;
import io.dummymaker.annotation.special.GenEnumerate;

public class Operator implements DBObject{

    @GenEnumerate(from = 1)
    private Integer id;

    @GenOperator
    private String name;

    @Override
    public Integer getId() {
        return 0;
    }
}
