package com.jad;

public class Foo {

    public Bar getBar() {
        return this.bar;
    }


    public Baz[] getBazs() {
        return this.bazs;
    }


    public Qux getQux() {
        return this.qux;
    }



    public Corge getCorge() {
        return this.corge;
    }



    public Grault[] getGraults() {
        return this.graults;
    }



    private Bar bar;

    private Baz[] bazs;

    private  Qux qux;

    private Corge corge;

    private Grault[] graults;

    public void setCorge(Corge corge) {
        this.corge = corge;
    }

    public Foo(Bar bar){
        bar = new Bar();
        this.bar = bar;
        bazs = new Baz[0];
        qux = new Qux();
        corge = new Corge(this);
        graults = new Grault[0];
    }

    public void addBaz(Baz baz){
        bazs[bazs.length] = baz;
    }

    public void addGrault(){
        graults[graults.length] = new Grault(this);
    }
}
