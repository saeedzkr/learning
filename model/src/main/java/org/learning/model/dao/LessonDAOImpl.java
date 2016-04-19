package org.learning.model.dao;

import org.learning.model.entity.Learning;
import org.learning.model.entity.Lesson;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by s.zakipour on 04/18/2016.
 */
public class LessonDAOImpl {


    public List<Lesson> listLearning() {
        List<Lesson> lst = new ArrayList<Lesson>();

        try {

            for (int i = 0; i < 20; i++) {
                Lesson ls = new Lesson((long) i, "Lesson" + i, "tmp", "teacher" + i, Long.parseLong("0"));
                lst.add(ls);
            }


        } catch (Exception ex) {
            ex.printStackTrace();

        }

            return lst;
    }


}
