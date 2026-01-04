package org.example;

@SuppressWarnings("doclint:missing") // javadoc生成時の警告を抑止
public class TestLib {
    public String getHogeHoge() {
        TestApi api = new TestApi();
        return api.getHogeHoge();
    }
}
