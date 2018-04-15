package generator.POJO.column;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenOperatorId;
import generator.customAnnotation.annotations.GenTariffId;
import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.time.GenDate;

import java.util.Date;

public class TariffActivation implements DBObject {

    @GenEnumerate(from = 1)
    private Integer userId;

    @GenTariffId
    private Integer tariffId;

    @GenOperatorId
    private Integer operatorId;

    @GenDate
    private Date date;

    @Override
    public Integer getId() {
        return userId;
    }

    public Integer getTariffId() {
        return tariffId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }
}
