package org.learning.web.bean;

import org.learning.model.entity.Lesson;

import java.io.Serializable;
import java.util.List;

/**
 * Created by s.zakipour on 04/18/2016.
 */
public class lessonBean implements Serializable {
    private List<Lesson> lessons;


    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }



}
