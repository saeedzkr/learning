package org.learning.web.bean;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by sector7 on 4/15/16.
 */
@ManagedBean
@SessionScoped
public class loginBean implements Serializable {

    private String username;
    private String password;


    public loginBean() {

        System.out.println("helooo");
    }

    public String getUsername() {
        System.out.println("helooo2");
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void validate()
    {
        System.out.println("==========================");
        System.out.println("validate");
    }


}
