package ru.easyjava.java;

import lombok.experimental.UtilityClass;
import lombok.extern.java.Log;
import lombok.val;

import java.math.BigDecimal;

/**
 * Example of lombok annotation usage.
 */
@Log
@UtilityClass
public class HelloLombok {
    /**
     * Builds sample entity and says 'Hello'.
     * @return "10 greetings from Lombok"
     */
    public static String greet() {
        val entity = Entity.builder()
                .id(1L)
                .name("Lombok")
                .amount(BigDecimal.TEN)
                .build();

        val result = String.format("%d greetings from %s",
                entity.getAmount().intValue(),
                entity.getName());

        log.info("Resulting string is: " + result);

        return result;
    }
}
