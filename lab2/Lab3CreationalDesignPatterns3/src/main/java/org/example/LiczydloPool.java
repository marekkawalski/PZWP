package org.example;

public  class LiczydloPool extends ObjectPool<Liczydlo> {
    @Override
    protected Liczydlo create() {
        return new Liczydlo();
    }
}

