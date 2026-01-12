package com.jad;

public class Corge {

    public Foo getFoo() {
        return this.foo;
    }

    public void setFoo(Foo foo) {
        this.foo = foo;
    }

    Foo foo;
    public Corge(Foo foo) {
        foo = foo;
    }


}
