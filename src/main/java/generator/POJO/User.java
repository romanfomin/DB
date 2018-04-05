package generator.POJO;

import io.dummymaker.annotation.special.GenEnumerate;
import io.dummymaker.annotation.string.GenName;

public class User implements DBObject{

    @GenEnumerate(from = 1)
    private Integer id;

    @GenName
    private String lastName;

    @GenName
    private String firstName;

    @GenName
    private String middleName;

    @GenEnumerate(from = 10000000)
    private Integer passport;

    public Integer getId() {
        return id;
    }
}
