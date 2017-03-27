package nl.jcore.java8workshop;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class Exercise005Time {
    /**
     * Return the LocalDate of today. Using the clock
     * object here makes time and timing testable. In
     * a test you can simply mock a clock with a fixed
     * time. The clock can freeze or tick whenever the
     * test requires it to.
     *
     * This is why LocalDate.of(2017, 3, 8); won't
     * work as a solution here ;)
     */
    static LocalDate getLocalDateOfToday(final Clock clock) {
        return LocalDate.now(clock);
    }

    /**
     * Combine LocalDateTime and ZoneId (timezone)
     * information into a ZonedDateTime.
     *
     * A great thing about the java.time.* classes are
     * their descriptive names. The intent of the method
     * below should be clear from just its parameters
     * and return type. The classes' names indicate what
     * information they hold and therefore what purpose
     * they serve.
     */
    static ZonedDateTime getZonedDateTimeFromDateTimeAndTimezone(final LocalDateTime dateTime, final ZoneId zoneId) {
        return dateTime.atZone(zoneId);
    }

    /**
     * Derive the Instant (single point in linear time) from a LocalDateTime and a ZoneId.
     */
    static Instant getInstantFromDateTimeAndTimezone(final LocalDateTime dateTime, final ZoneId zoneId) {
        return dateTime.atZone(zoneId).toInstant();
    }

    /**
     * Return a LocalDate that is one day later than the input LocalDate.
     */
    static LocalDate addDay(final LocalDate date) {
        final TemporalUnit unit = ChronoUnit.DAYS;
        return date.plus(1, unit);
    }

    /**
     * Return the Duration between two instants.
     */
    static Duration getDurationFromInstants(final Instant instantA, final Instant instantB) {
        return Duration.between(instantA, instantB);
    }
}
