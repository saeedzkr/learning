package org.learning.model.entity;

import java.io.Serializable;

/**
 * Created by s.zakipour on 04/18/2016.
 */
public class Learning implements Serializable{


    private Long id;
    private String Name;
    private String description;
    private String creator;
    private String isRead;


    public Learning(Long id, String name, String description, String creator, String isRead) {
        this.id = id;
        Name = name;
        this.description = description;
        this.creator = creator;
        this.isRead = isRead;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getIsRead() {
        return isRead;
    }

    public void setIsRead(String isRead) {
        this.isRead = isRead;
    }
}
