package service;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SomeTests {

  @Test
  public void testSuccess() throws Exception {
    System.out.println("Test run!");
    assertTrue(true);
  }
}
