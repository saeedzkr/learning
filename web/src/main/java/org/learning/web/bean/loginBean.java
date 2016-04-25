package org.learning.web.bean;


import com.mysql.fabric.Response;
import org.junit.Rule;
import org.junit.Test;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
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
    private String nationalCode;
    private HashMap<String, String> cmblang;
    private UIComponent component;

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

    public String getNationalCode() {
        return nationalCode;
    }



    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }


    public UIComponent getComponent() {
        return component;
    }

    public void setComponent(UIComponent component) {
        this.component = component;
    }

    public void execute(ActionEvent event) {
        System.out.println("==========================");
        System.out.println("v alidate");

        //            UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
//            System.out.println("+++++");
//            if (this.cmblang.equals("fa")) {
//                System.out.println("+++++1");
//                viewRoot.setLocale(new Locale("fa"));
//                System.out.println("+++++22");
//            }
//            else {
//                System.out.println("+++++2");
//                viewRoot.setLocale(new Locale("en"));
//                System.out.println("+++++22");
//            }
        System.out.println("+++++1");
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR ,"Esssssssrror" ,"sdasdadsads");
        setFacesMessage(component , facesMessage);
        //FacesContext.getCurrentInstance().getExternalContext().redirect("main.xhtml");

    }

    @Rule
    private void setFacesMessage(UIComponent component , FacesMessage facesMessage)
    {

        FacesContext.getCurrentInstance().addMessage(component.getClientId() , facesMessage);

    }




    

}
