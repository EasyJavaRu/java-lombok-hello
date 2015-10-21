package ru.easyjava.java;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Example of entity.
 */
@Builder
public class Entity {
    /**
     * Some id.
     */
    @Getter
    @Setter
    private Long id;

    /**
     * Entity name.
     */
    @Getter
    @Setter
    private String name;

    /**
     * Entity content.
     */
    @Getter
    @Setter
    private BigDecimal amount;
}
