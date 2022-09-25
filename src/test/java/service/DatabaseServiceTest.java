package service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class DatabaseServiceTest {
    DatabaseService databaseService;

    @BeforeEach
    void setUp() {
        databaseService = new DatabaseService();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void printConnection() {
        String expected = "true";
        String actual = String.valueOf(databaseService.printConnectionStatus());
        assertEquals(expected, actual);
    }

    @Test
    void printConnectionFailure() {
        String expected = "false";
        String actual = String.valueOf(databaseService.printConnectionStatus());
        assertNotEquals(expected, actual);
    }
}