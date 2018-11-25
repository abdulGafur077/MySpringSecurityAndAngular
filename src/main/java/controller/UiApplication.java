package controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Abdul on 11/25/2018.
 */

@SpringBootApplication
@RestController
public class UiApplication {

  @RequestMapping("api/resource")
  @CrossOrigin(origins = "/**")
  public Map<String,Object> home() {
    Map<String,Object> model = new HashMap<String,Object>();
    model.put("id", UUID.randomUUID().toString());
    model.put("content", "Hello World");
    return model;
  }

  @RequestMapping("auth/resource")
  @CrossOrigin(origins = "/**")
  public Map<String,Object> auth() {
    Map<String,Object> model = new HashMap<String,Object>();
    model.put("id", UUID.randomUUID().toString());
    model.put("content", "Hello Auth World");
    return model;
  }

  public static void main(String[] args) {
    SpringApplication.run(UiApplication.class, args);
  }

}
