package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenOperatorId;
import generator.customAnnotation.annotations.GenTariffId;
import generator.customAnnotation.annotations.GenUserId;

public class HasTariffRel implements DBObject {

    @GenOperatorId
    private Integer operatorId;

    @GenTariffId
    private Integer tariffId;

    @Override
    public Integer getId() {
        return operatorId;
    }
}
