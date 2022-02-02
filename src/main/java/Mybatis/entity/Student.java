package Mybatis.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Student {
    private Integer sid;
    private String name;
    private String sex;
}
