package kayjay.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: kayjay
 * Date: 4/13/13
 * Time: 11:37 PM
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/example")
public class ExampleController {

    @ResponseBody
    @RequestMapping(value = "m1", produces = "application/json")
    public ExampleEntity exampleMethod() {
        return new ExampleEntity("ololo", 42);
    }

    @ResponseBody
    @RequestMapping(value = "m2", consumes = "application/json", produces = "application/json",
        method = RequestMethod.POST)
    public String exampleMethodWithParam(@RequestBody ExampleEntity param) {
        return param.getSomeStringProperty();
    }
}
