package com.knowprocess.rootest.model;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;
import javax.persistence.Lob;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
@RooJson
public class Bar {

    /**
     */
    private String sField;

    private Foo foo;

    /**
     */
    @Lob
    private String lobField;
}
