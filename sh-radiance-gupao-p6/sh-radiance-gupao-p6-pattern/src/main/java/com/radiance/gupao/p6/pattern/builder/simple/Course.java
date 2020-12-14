package com.radiance.gupao.p6.pattern.builder.simple;

import lombok.Data;

/**
 * @author sunhao
 * @date 2020/11/6 17:31
 * @Description:
 */
@Data
public class Course {

    private String name;
    private String ppt;
    private String video;
    private String note;

    private String homework;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", ppt='" + ppt + '\'' +
                ", video='" + video + '\'' +
                ", note='" + note + '\'' +
                ", homework='" + homework + '\'' +
                '}';
    }
}
