package service;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JUnitCoreSpringBootApplication {

  public static void main(String[] args) {
    SpringApplication.run(JUnitCoreSpringBootApplication.class, args);

    JUnitCore jUnitCore = new JUnitCore();
    Result result = jUnitCore.run(SomeTests.class);
  }
}
