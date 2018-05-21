package pl.com.bms.springworkshop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.com.bms.springworkshop.model.Message;

@RestController
public class HelloWorldController {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    @RequestMapping("hello")
    public Message helloWorld() {
        Message message = new Message("Hello Spring");
        logger.debug(message.toString());
        return message;
    }
}
