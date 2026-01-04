package org.example;

@SuppressWarnings("doclint:missing") // javadoc生成時の警告を抑止
public class TestParam {
    private String name;
    private int age;

    public TestParam(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
