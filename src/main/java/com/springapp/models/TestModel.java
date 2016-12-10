package com.springapp.models;

/**
 * Created by kaushik on 29-Nov-16.
 */
public class TestModel {
    String name;
    int age;
    String id;

    public TestModel(){
        name="hello";
        age=12;
        id="asdf";
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        age=a;
    }

    public void setName(String n){
        name=n;
    }

    public int getAge(){
        return age;
    }

    public String getId(){
        return id;
    }

    public void setId(String i){
        id=i;
    }
}
