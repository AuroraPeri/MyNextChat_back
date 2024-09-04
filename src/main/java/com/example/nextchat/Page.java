package com.example.nextchat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Page {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer page_id;

    private String title;

    private Integer conv_id;

    private String maskName;

    public Integer getPage_idId() {
        return page_id;
    }

    public void setPage_id(Integer page_id) {
        this.page_id = page_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getConv_id() {
        return conv_id;
    }

    public void setConv_id(Integer conv_id) {
        this.conv_id = conv_id;
    }

    public String getMaskName() {
        return maskName;
    }

    public void setMaskName(String maskName) {
        this.maskName = maskName;
    }
}
