package generator.POJO.graph;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenTariffId;
import generator.customAnnotation.annotations.GenUserId;
import io.dummymaker.annotation.special.GenForceExport;

public class UsesTariffRel{

    @GenForceExport
    private Integer userId;

    @GenForceExport
    private Integer tariffId;

    public UsesTariffRel(Integer userId, Integer tariffId){
        this.userId = userId;
        this.tariffId = tariffId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setTariffId(Integer tariffId) {
        this.tariffId = tariffId;
    }

    public Integer getTariffId() {
        return tariffId;
    }
}
