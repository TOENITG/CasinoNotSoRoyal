package com.casino.util;

import java.util.concurrent.TimeUnit;

/**
 * A simple timing utility used for time actions. This class is
 * using <code>NANOSECONDS</code> for extremely accurate timing xD, if <code>MILISECONDS<code> is to slow.
 * 
 * @author Gabbe
 * 
 * @author lare96
 */
public final class Timer {

    /** The internal cached time for this timer. */
    private long time = getTime();

    /** resets the time but instead of reseting it to 0 it sets it to start. */
    public Timer reset(long start) {
        time = getTime() - start;
        return this;
    }

    /**
     * Resets the internal cached time to <tt>0</tt>.
     * 
     * @return the timer instance.
     */
    public Timer reset() {
        time = getTime();
        return this;
    }

    /**
     * Returns the amount of time elapsed since this object was initialized, or
     * since the last call to the <code>reset()</code> method.
     * 
     * @return the elapsed time in <code>MILLISECONDS</code>.
     */
    public long elapsed() {
        return getTime() - time;
    }

    /**
     * Returns the amount of time elapsed since this object was initialized, or
     * since the last call to the <code>reset()</code> method in
     * <code>unit</code>.
     * 
     * @param unit
     *            the time unit to convert the elapsed time into.
     * 
     * @return the elapsed time in <code>unit</code>.
     */
    public long elapsed(TimeUnit unit) {
        if (unit == TimeUnit.MILLISECONDS)
            throw new IllegalArgumentException(
                "Time is already in milliseconds!");
        return unit.convert(elapsed(), TimeUnit.MILLISECONDS);
    }

    /**
     * Gets the current time using <code>System.nanoTime()</code> and converts
     * it to <code>MILLISECONDS</code>.
     * 
     * @return the current time, in milliseconds.
     */
    private long getTime() {
        return TimeUnit.MILLISECONDS.convert(System.nanoTime(),
            TimeUnit.NANOSECONDS);
    }
}