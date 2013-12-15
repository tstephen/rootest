// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.knowprocess.rootest.model;

import com.knowprocess.rootest.model.Foo;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

privileged aspect Foo_Roo_Finder {
    
    public static TypedQuery<Foo> Foo.findFoosByF1Like(String f1) {
        if (f1 == null || f1.length() == 0) throw new IllegalArgumentException("The f1 argument is required");
        f1 = f1.replace('*', '%');
        if (f1.charAt(0) != '%') {
            f1 = "%" + f1;
        }
        if (f1.charAt(f1.length() - 1) != '%') {
            f1 = f1 + "%";
        }
        EntityManager em = Foo.entityManager();
        TypedQuery<Foo> q = em.createQuery("SELECT o FROM Foo AS o WHERE LOWER(o.f1) LIKE LOWER(:f1)", Foo.class);
        q.setParameter("f1", f1);
        return q;
    }
    
    public static TypedQuery<Foo> Foo.findFoosByF2Like(String f2) {
        if (f2 == null || f2.length() == 0) throw new IllegalArgumentException("The f2 argument is required");
        f2 = f2.replace('*', '%');
        if (f2.charAt(0) != '%') {
            f2 = "%" + f2;
        }
        if (f2.charAt(f2.length() - 1) != '%') {
            f2 = f2 + "%";
        }
        EntityManager em = Foo.entityManager();
        TypedQuery<Foo> q = em.createQuery("SELECT o FROM Foo AS o WHERE LOWER(o.f2) LIKE LOWER(:f2)", Foo.class);
        q.setParameter("f2", f2);
        return q;
    }
    
}