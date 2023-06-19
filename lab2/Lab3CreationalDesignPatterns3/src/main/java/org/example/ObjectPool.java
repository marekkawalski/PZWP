package org.example;

import java.util.HashSet;
import java.util.Set;
public abstract class ObjectPool<T> {
        public static final long MAX_POOL_SIZE = 100;
        private final Set<T> available = new HashSet<>();
        private final Set<T> inUse = new HashSet<>();
        protected abstract T create();
        public synchronized T checkOut() throws MaxPoolSizeException {
            if (available.isEmpty()) {
                if(inUse.size() > MAX_POOL_SIZE) throw new MaxPoolSizeException("Max pool size reached");
                available.add(create());
            }
            var instance = available.iterator().next();
            available.remove(instance);
            inUse.add(instance);
            return instance;
        }
        public synchronized void checkIn(T instance) {
            inUse.remove(instance);
            available.add(instance);
        }

        @Override
        public synchronized String toString() {
            return String.format("Pool available=%d inUse=%d", available.size(), inUse.size());
        }
}
