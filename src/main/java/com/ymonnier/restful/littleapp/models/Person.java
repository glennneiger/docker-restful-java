package com.ymonnier.restful.littleapp.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Project Project.
 * Package com.ymonnier.restful.littleapp.models.
 * File Person.java.
 * Created by Ysee on 24/01/2017 - 22:52.
 * www.yseemonnier.com
 * https://github.com/YMonnier
 */
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String address;
    private String iconPath;

    private Person(Builder builder) {
        this.name = builder.name;
        this.address = builder.address;
        this.iconPath = builder.iconPath;
    }

    public static class Builder {
        private String name;
        private String address;
        private String iconPath;

        public Person build() {
            return new Person(this);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setIconPath(String iconPath) {
            this.iconPath = iconPath;
            return this;
        }
    }
}
