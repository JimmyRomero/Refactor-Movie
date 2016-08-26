package org.fundacionjala.movies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for new release movies {@link NewReleaseMovie}
 */

public class NewReleaseMovieTest {

    private static final double DELTA = 0.001;

    private static final int DAYS_RENTED = 4;

    private Movie movie;

    @Before
    public void setUp() {
        movie = new NewReleaseMovie("Assassin's creed");
    }

    @Test
    public void test_calculateAmount_ifDaysAre4() {
        final double expected = 12;
        assertEquals(expected, movie.calculateAmount(DAYS_RENTED), DELTA);
    }

    @Test
    public void test_calculateFrequentRenterPoints_ifPointsAre4() {
        final double expected = 2;
        assertEquals(expected, movie.calculateFrequentRenterPoints(DAYS_RENTED), DELTA);
    }
}
