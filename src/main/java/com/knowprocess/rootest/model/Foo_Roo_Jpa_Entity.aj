// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.knowprocess.rootest.model;

import com.knowprocess.rootest.model.Foo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

privileged aspect Foo_Roo_Jpa_Entity {
    
    declare @type: Foo: @Entity;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long Foo.id;
    
    @Version
    @Column(name = "version")
    private Integer Foo.version;
    
    public Long Foo.getId() {
        return this.id;
    }
    
    public void Foo.setId(Long id) {
        this.id = id;
    }
    
    public Integer Foo.getVersion() {
        return this.version;
    }
    
    public void Foo.setVersion(Integer version) {
        this.version = version;
    }
    
}
