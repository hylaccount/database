package com.ibeifeng.ssh.model;

import org.hibernate.annotations.GenericGenerator;
import org.junit.Test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by zmzy on 2017/2/17.
 */
@Entity
@Table(name = "t_emp")
public class Employee {
    private int id;
    private String name;
    private double salary;

    @Id
    @GenericGenerator(name = "mid",strategy = "native")
    @GeneratedValue(generator = "mid")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
