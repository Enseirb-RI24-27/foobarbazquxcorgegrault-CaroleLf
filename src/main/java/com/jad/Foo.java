package com.jad;

public class Foo {

    public Bar getBar() {
        return this.bar;
    }

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public Baz[] getBazs() {
        return this.bazs;
    }

    public void setBazs(Baz[] bazs) {
        this.bazs = bazs;
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

    public void setGraults(Grault[] graults) {
        this.graults = graults;
    }

    Bar bar;

    Baz[] bazs;

    Qux qux;

    Corge corge;

    Grault[] graults;


    public Foo(Bar bar){

    }

    public void addBaz(Baz baz){
        bazs[bazs.length] = baz;
    }

    public void addGrault(){

    }
}
