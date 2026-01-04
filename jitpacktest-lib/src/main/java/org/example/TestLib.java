package org.example;

@SuppressWarnings("doclint:missing") // javadoc生成時の警告を抑止
public class TestLib {
    private final TestParam param;

    public TestLib(TestParam param) {
        this.param = param;
    }

    public String getHogeHoge() {
        return String.format("名前:%s, 年齢:%d", param.getName(), param.getAge());
    }
}
