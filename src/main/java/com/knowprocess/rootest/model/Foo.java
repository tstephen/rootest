package com.knowprocess.rootest.model;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.roo.addon.equals.RooEquals;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@RooEquals
@RooJson(iso8601Dates = true)
@RooJpaActiveRecord(finders = { "findFoosByF1Like", "findFoosByF2Like" })
public class Foo {

    /**
     * a field
     */
    private String f1;

    /**
     * another field
     */
    private String f2;

    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "M-")
    private Date dateField;

    /**
     */
    private Boolean boolField;

    /**
     */
    @Enumerated
    private FooEnumType enumField;


    /**
     */
    private int intField;

    /**
     */
    private float floatField;

    /**
     * Allow selection of multiple enum values.
     */
    @Enumerated
    private FooEnumType multiEnumField;

    /**
     */
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "foo")
    private List<Bar> barList = new ArrayList<Bar>();

    /**
     */
    @Size(max = 4000)
    @Lob
    private String lobField;
}
