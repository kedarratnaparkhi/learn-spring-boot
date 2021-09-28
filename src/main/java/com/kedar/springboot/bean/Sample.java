package com.kedar.springboot.bean;

import org.springframework.stereotype.Component;

@Component
public class Sample {

    private String name;
    private Integer number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Sample(String name, Integer number){
        this.name = name;
        this.number = number;

    }

    public Sample(){
        this.name = "Kedar (From constructor)";
        this.number = 889;
    }

    @Override
    public String toString(){
        return "{Name:" + this.name + ", Number: "+ this.number + " }";
    }
}
