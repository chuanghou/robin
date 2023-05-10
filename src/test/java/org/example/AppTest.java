package org.example;

import lombok.SneakyThrows;
import org.example.robin.Application;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Application.class)
public class AppTest {

    @Test
    @SneakyThrows
    public void shouldAnswerWithTrue() {
        int i = 100;
        while (i-- > 0){
            Thread.sleep(1000L);
        }
    }
}
