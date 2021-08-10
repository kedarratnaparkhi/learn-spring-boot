package com.kedar.springboot.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "cust_orders",
            joinColumns = @JoinColumn(name="cust_id"),
            inverseJoinColumns = @JoinColumn(name="order_id")
    )
    private Set<Orders> orders;

    public Customers() {
    }

    public Customers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customers(String firstName, String lastName, Set<Orders> orders) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.orders = orders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }
}
