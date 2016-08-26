package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for regular movies {@link RegularMovie}
 */

public class RegularMovieTest {

    private static final double DELTA = 1;

    private static final int DAYS_RENTED = 4;

    private Movie movie;

    @Before
    public void setUp() {
        movie = new RegularMovie("Never Back Down");
    }

    @Test
    public void test_calculateAmount_ifDaysAre4() {
        final double expected = 5;
        assertEquals(expected, movie.calculateAmount(DAYS_RENTED), DELTA);
    }

    @Test
    public void test_calculateFrequentRenterPoints_ifPointsAre4(){
        final double expected = 1;
        assertEquals(expected, movie.calculateFrequentRenterPoints(DAYS_RENTED),DELTA);
    }
}
