package tech.adriano.hexagonal.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleTest {

    @Test
    void simpleContractTest() {
        assertThat("").isNotNull();
    }
}
