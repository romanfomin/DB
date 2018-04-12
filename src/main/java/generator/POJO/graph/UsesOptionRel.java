package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenOptionId;
import generator.customAnnotation.annotations.GenUserId;
import io.dummymaker.annotation.special.GenForceExport;

public class UsesOptionRel{

    @GenForceExport
    private Integer userId;

    @GenForceExport
    private Integer optionId;

    public UsesOptionRel(Integer userId, Integer optionId){
        this.userId = userId;
        this.optionId = optionId;
    }


    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public Integer getUserId() {
        return userId;
    }

    public Integer getOptionId() {
        return optionId;
    }
}
