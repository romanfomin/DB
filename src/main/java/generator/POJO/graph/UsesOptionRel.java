package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenOptionId;
import generator.customAnnotation.annotations.GenUserId;

public class UsesOptionRel implements DBObject {

    @GenUserId
    private Integer userId;

    @GenOptionId
    private Integer optionId;

    @Override
    public Integer getId() {
        return userId;
    }
}
