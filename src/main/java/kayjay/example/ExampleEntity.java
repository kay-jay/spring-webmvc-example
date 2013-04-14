package kayjay.example;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created with IntelliJ IDEA.
 * User: kayjay
 * Date: 4/14/13
 * Time: 7:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExampleEntity {

    @JsonProperty("string")
    private String someStringProperty;
    @JsonProperty("int")
    private int someIntProperty;

    @JsonCreator
    public ExampleEntity(@JsonProperty("string") String someStringProperty, @JsonProperty("int") int someIntProperty) {
        this.someStringProperty = someStringProperty;
        this.someIntProperty = someIntProperty;
    }

    public String getSomeStringProperty() {
        return someStringProperty;
    }

    public void setSomeStringProperty(String someStringProperty) {
        this.someStringProperty = someStringProperty;
    }

    public int getSomeIntProperty() {
        return someIntProperty;
    }

    public void setSomeIntProperty(int someIntProperty) {
        this.someIntProperty = someIntProperty;
    }
}
