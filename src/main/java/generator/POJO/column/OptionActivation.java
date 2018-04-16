package generator.POJO.column;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenOperatorId;
import generator.customAnnotation.annotations.GenOptionId;
import generator.customAnnotation.annotations.GenUserId;
import io.dummymaker.annotation.time.GenDate;
import io.dummymaker.annotation.time.GenTimestamp;

import java.util.Date;

public class OptionActivation implements DBObject {

    @GenUserId
    private Integer userId;

    @GenOptionId
    private Integer optionId;

    @GenOperatorId
    private Integer operatorId;

    @GenTimestamp
    private Date date;

    @Override
    public Integer getId() {
        return userId;
    }

    public Integer getOptionId() {
        return optionId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }
}
