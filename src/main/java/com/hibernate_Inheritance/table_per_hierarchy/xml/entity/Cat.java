package com.hibernate_Inheritance.table_per_hierarchy.xml.entity;

public class Cat extends Animal{

    private String tail;


    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
