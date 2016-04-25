package org.learning.web.bean;

import org.learning.model.dao.LessonDAOImpl;
import org.learning.model.entity.Lesson;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.event.ActionEvent;
import java.io.Serializable;
import java.util.List;

/**
 * Created by s.zakipour on 04/18/2016.
 */
@ManagedBean
@SessionScoped
public class lessonBean implements Serializable {




    private List<Lesson> lessons;

    private String email;
    private String confirmEmail;

    public List<Lesson> getLessons() {
        LessonDAOImpl dao = new LessonDAOImpl();
        return dao.listLearning();
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConfirmEmail() {
        return confirmEmail;
    }

    public void setConfirmEmail(String confirmEmail) {
        this.confirmEmail = confirmEmail;
    }



    public void validate(long id)
    {

        System.out.println(id);


    }
}
