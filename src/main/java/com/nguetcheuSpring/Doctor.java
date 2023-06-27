package com.nguetcheuSpring;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {

    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    @Override
    public void assist(){
        System.out.println("Doctor is assisting");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set bean name Method is called");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post construct Method is called");
    }
}
