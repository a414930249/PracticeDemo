package com.learning.java.serialize.demo;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by ruhr on 2017/4/28.
 * reference 《effective java》
 */
public class AbstractFoo {

        private int x, y;  // Our state
        // This enum and field are used to track initialization
        private enum State { NEW, INITIALIZING, INITIALIZED };
        private final AtomicReference<State> init =
            new AtomicReference<State>(State.NEW);
        public AbstractFoo(int x, int y) { initialize(x, y); }
        protected AbstractFoo() { }
        protected final int getX() { checkInit(); return x; }
        protected final int getY() { checkInit(); return y; }
        protected final void initialize(int x, int y) {
            if (!init.compareAndSet(State.NEW, State.INITIALIZING))
                throw new IllegalStateException(
                        "Already initialized");
            this.x = x;
            this.y = y;
            init.set(State.INITIALIZED);
        }

    private void checkInit() {
        if (init.get() != State.INITIALIZED)
            throw new IllegalStateException("Uninitialized");
    }


}
