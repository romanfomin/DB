package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenCityId;
import io.dummymaker.annotation.special.GenEnumerate;

public class FromCityRel implements DBObject {

    @GenEnumerate(from = 1)
    private Integer userId;

    @GenCityId
    private Integer cityId;

    @Override
    public Integer getId() {
        return userId;
    }
}
