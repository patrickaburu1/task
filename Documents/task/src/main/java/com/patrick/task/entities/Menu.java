package com.patrick.task.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author patrick on 8/10/19
 * @project task
 */
@Entity
public class Menu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    @JsonIgnore
    private Long id;


    @OneToMany
    //@JoinColumn(name = "id",  referencedColumnName = "menuId", insertable = false, updatable = false)
    private List<Choices> choices;

    private String name;


    public Long getId() {
        return id;
    }

    public Menu setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Menu setName(String name) {
        this.name = name;
        return this;
    }

    public List<Choices> getChoices() {
        return choices;
    }

    public Menu setChoices(List<Choices> choices) {
        this.choices = choices;
        return this;
    }
}
