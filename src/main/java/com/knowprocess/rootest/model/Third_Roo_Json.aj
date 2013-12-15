// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.knowprocess.rootest.model;

import com.knowprocess.rootest.model.Third;
import flexjson.JSONDeserializer;
import flexjson.JSONSerializer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

privileged aspect Third_Roo_Json {
    
    public String Third.toJson() {
        return new JSONSerializer()
        .exclude("*.class").serialize(this);
    }
    
    public String Third.toJson(String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").serialize(this);
    }
    
    public static Third Third.fromJsonToThird(String json) {
        return new JSONDeserializer<Third>()
        .use(null, Third.class).deserialize(json);
    }
    
    public static String Third.toJsonArray(Collection<Third> collection) {
        return new JSONSerializer()
        .exclude("*.class").serialize(collection);
    }
    
    public static String Third.toJsonArray(Collection<Third> collection, String[] fields) {
        return new JSONSerializer()
        .include(fields).exclude("*.class").serialize(collection);
    }
    
    public static Collection<Third> Third.fromJsonArrayToThirds(String json) {
        return new JSONDeserializer<List<Third>>()
        .use("values", Third.class).deserialize(json);
    }
    
}