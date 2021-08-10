package com.kedar.junitandmockito;

public class Database {

    public Boolean isAvailable(){
        return false;
    }

    public int getUniqueId(){
        return (int)Math.random();
    }
}
