package com.knowprocess.rootest.model;
import javax.persistence.Embeddable;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.json.RooJson;
import org.springframework.roo.addon.tostring.RooToString;

@RooJavaBean
@RooToString
@Embeddable
@RooJson
public class FooEmbedded {

    /**
     */
    private String stringField;
}
