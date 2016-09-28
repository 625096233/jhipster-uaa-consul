package com.mycompany.myapp.client;

/**
 * Created on 28.09.16.
 *
 * @author David Steiman, K-TEL Communications GmbH
 */
public class Foo {
    private String value;

    public Foo() {
    }

    public Foo(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
