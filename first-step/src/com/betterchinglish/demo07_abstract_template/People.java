package com.betterchinglish.demo07_abstract_template;

public abstract class People {
    public final void write() {
        System.out.println("same start");
        System.out.println(this.writeSelf());
        System.out.println("same end");
    }

    public abstract String writeSelf();
}
