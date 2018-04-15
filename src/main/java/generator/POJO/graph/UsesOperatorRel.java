package generator.POJO.graph;

import io.dummymaker.annotation.special.GenForceExport;

public class UsesOperatorRel {

    @GenForceExport
    private Integer userId;

    @GenForceExport
    private Integer operatorId;

    public UsesOperatorRel(Integer userId, Integer operatorId){
        this.userId = userId;
        this.operatorId = operatorId;
    }


    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setOptionId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getOptionId() {
        return operatorId;
    }
}
