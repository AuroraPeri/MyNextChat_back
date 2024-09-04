package com.example.nextchat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Conversation {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String role;

    private String content;

    private  Integer conv_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getConv_id(){
        return conv_id;
    }

    public void setConv_id(Integer conv_id){
        this.conv_id = conv_id;
    }
}
