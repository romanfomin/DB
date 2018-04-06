package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenTariffId;
import generator.customAnnotation.annotations.GenUserId;

public class UsesTariffRel implements DBObject {

    @GenUserId
    private Integer userId;

    @GenTariffId
    private Integer tariffId;

    @Override
    public Integer getId() {
        return userId;
    }
}
