package com.spaniard;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Alexander Nesterov
 * @version 1.0
 */
public final class PaddedAtomicLong extends AtomicLong {

    public volatile long p1, p2, p3, p4, p5, p6;
}

