package com.jad;

public class Foo {
    private Bar bar;
    private Baz[] bazs;
    private Qux qux;
    private Corge corge;
    private Grault[] graults;

    public Foo(Bar bar) {
        this.bar = bar;
        this.bazs = new Baz[0];
        this.graults = new Grault[0];
    }

    public void addBaz(Baz baz) {
        Baz[] newBazs = new Baz[this.bazs.length + 1];
        System.arraycopy(this.bazs, 0, newBazs, 0, this.bazs.length);
        newBazs[this.bazs.length] = baz;
        this.bazs = newBazs;
    }

    public void addGrault() {
        Grault newGrault = new Grault(this);
        Grault[] newGraults = new Grault[this.graults.length + 1];
        System.arraycopy(this.graults, 0, newGraults, 0, this.graults.length);
        newGraults[this.graults.length] = newGrault;
        this.graults = newGraults;
    }

    public Bar getBar() {
        return this.bar;
    }

    public Baz[] getBazs() {
        return this.bazs;
    }

    public Qux getQux() {
        return this.qux;
    }

    public void setQux(Qux qux) {
        this.qux = qux;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }

    public Grault[] getGraults() {
        return this.graults;
    }
}
