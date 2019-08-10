package com.patrick.task.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author patrick on 8/10/19
 * @project task
 */
@Entity
public class Choices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    @JsonIgnore
    private Long id;

    private String name;

    @JsonIgnore
    private long menuId;



    public Long getId() {
        return id;
    }

    public Choices setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Choices setName(String name) {
        this.name = name;
        return this;
    }

    public long getMenuId() {
        return menuId;
    }

    public Choices setMenuId(long menuId) {
        this.menuId = menuId;
        return this;
    }
}
