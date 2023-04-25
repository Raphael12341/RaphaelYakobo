package com.benezeth.MockinApp.entity;

import jakarta.persistence.*;

@Entity
@Table(name="/api/market")
@SuppressWarnings("ALL")
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;


    public Market(String name,String description){
        this.name=name;
        this.description=description;
    }
    public long getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
