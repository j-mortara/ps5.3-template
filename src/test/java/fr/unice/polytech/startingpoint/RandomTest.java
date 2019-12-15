package fr.unice.polytech.startingpoint;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class RandomTest {

    // Dot not forget : you cannot test when you mock
    // you test object A that needs object B, then you mock B, create a A that uses mocked_B

    @Test
    public void randomIsNotRandomWhenMocked() {
        Random fixed = mock(Random.class);
        when(fixed.nextInt(anyInt())).thenReturn(5);
        assertEquals(5, fixed.nextInt(20));
        assertEquals(0, fixed.nextInt()); // Watchout, we only stubbed nextInt(int), not nextInt()
    }

}
