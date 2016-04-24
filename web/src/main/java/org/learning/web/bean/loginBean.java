package org.learning.web.bean;


import com.mysql.fabric.Response;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;

/**
 * Created by sector7 on 4/15/16.
 */
@ManagedBean
@SessionScoped
public class loginBean implements Serializable {

    private String username;
    private String password;
    private HashMap<String, String> cmblang;


    public loginBean() {

        System.out.println("helooo");
        setcmbLang();
    }

    public HashMap<String, String> getCmblang() {
        System.out.println(cmblang.size());
        return cmblang;
    }

    public void setCmblang(HashMap<String, String> cmblang) {
        this.cmblang = cmblang;
    }

    private void setcmbLang() {
        cmblang = new LinkedHashMap<>();
        cmblang.put("fa", "1");
        cmblang.put("en", "2");
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

    public void execute(ActionEvent event) {
        System.out.println("==========================");
        System.out.println("v alidate");

        try {
            UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
            System.out.println("+++++");
            if (this.cmblang.equals("fa")) {
                System.out.println("+++++1");
                viewRoot.setLocale(new Locale("fa"));
                System.out.println("+++++22");
            }
            else {
                System.out.println("+++++2");
                viewRoot.setLocale(new Locale("en"));
                System.out.println("+++++22");
            }
            System.out.println("+++++1");
            FacesContext.getCurrentInstance().getExternalContext().redirect("main.xhtml");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    

}
