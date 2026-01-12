package com.jad;

public class Grault {
    public Foo getFoo() {
        return this.foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    private Foo foo;

    Grault(Foo foo) {
        this.foo = foo;
    }

}

