package org.learning.web.bean;

import org.learning.model.dao.LessonDAOImpl;
import org.learning.model.entity.Lesson;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;

/**
 * Created by s.zakipour on 04/18/2016.
 */
@ManagedBean
@SessionScoped
public class lessonBean implements Serializable {
    private List<Lesson> lessons;


    public List<Lesson> getLessons() {
        LessonDAOImpl dao = new LessonDAOImpl();
        return dao.listLearning();
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }


    public void validate(long id) {
        System.out.println("-------------" + id);
    }

}
