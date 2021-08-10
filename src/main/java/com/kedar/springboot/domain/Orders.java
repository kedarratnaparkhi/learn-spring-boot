package com.kedar.springboot.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long invoiceAmount;

    @ManyToMany(mappedBy = "orders")
    @JsonIgnore
    private Set<Customers> cust;

    public Orders() {
    }

    public Orders(Long invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(Long invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public Set<Customers> getCust() {
        return cust;
    }

    public void setCust(Set<Customers> cust) {
        this.cust = cust;
    }
}
