package io.github.futurewl.spring.mvc.entity;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:21:38
 * @version 1.0
 */
public class Student {
    private Integer age;
    private String name;
    private Integer id;

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}