package uk.co.ns265.ejb;


import uk.co.ns265.entity.TUserEntity;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by neils on 30/04/2015.
 */
@Named(value = "UserControllerBean")
@RequestScoped
public class UserControllerBean {

    @EJB
    private UserEJBBean userEJBBean;
    private TUserEntity tUserEntity;
    private List<TUserEntity> userEntityList = new ArrayList();

    public List<TUserEntity> getUserEntityList(){
        userEntityList = userEJBBean.findUsers();
        return userEntityList;
    }

    public String viewUser(){
        return "userList.xhtml";
    }

    public String addNewUser(){
        tUserEntity = userEJBBean.addNew(tUserEntity);
        userEntityList = userEJBBean.findUsers();
        return "userList.xhtml";
    }


}
