package com.abeldeval.apptenis.domain.model;


public enum RolType {

    TEACHER(1),
    STUDENT(2);

    public final int value;

    private RolType(int value) {
        this.value = value;
    }
}
