package Lombok;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor(force = true)
@ToString
public class Student_Lombok {
    private Integer sid;
    private String name;
    private String sex;

    final private byte a;
    final private short b;
    final private int c;
    final private long d;
    final private float e;
    final private double f;
    final private char g;
    final private boolean h;
    final private String i;

}
