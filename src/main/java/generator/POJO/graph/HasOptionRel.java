package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenOperatorId;
import generator.customAnnotation.annotations.GenOptionId;
import generator.customAnnotation.annotations.GenTariffId;

public class HasOptionRel implements DBObject {

    @GenOperatorId
    private Integer operatorId;

    @GenOptionId
    private Integer optionId;

    @Override
    public Integer getId() {
        return operatorId;
    }
}
