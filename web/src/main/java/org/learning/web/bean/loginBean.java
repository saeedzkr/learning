package org.learning.web.bean;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by sector7 on 4/15/16.
 */
@ManagedBean
@SessionScoped
public class loginBean implements Serializable {

    private String username;
    private String password;
    private HashMap<String , String> cmblang;



    public loginBean()
    {

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
        cmblang.put("FA" , "1");
        cmblang.put("EN" , "2");
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
