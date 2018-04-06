package generator.POJO.column;

import generator.POJO.DBObject;
import generator.customAnnotation.annotations.GenOptionId;
import generator.customAnnotation.annotations.GenUserId;
import io.dummymaker.annotation.time.GenDate;

import java.util.Date;

public class OptionActivation implements DBObject {

    @GenUserId
    private Integer userId;

    @GenOptionId
    private Integer optionId;

    @GenDate
    private Date date;

    @Override
    public Integer getId() {
        return userId;
    }
}
