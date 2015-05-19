package uk.co.ns265.entity;

import javax.persistence.*;

/**
 * Created by neils on 27/04/2015.
 */

@Entity
@Table(name = "t_user", schema = "", catalog = "test")
@NamedQuery(name="findAllUsers", query="select u from TUserEntity u")
public class TUserEntity {
    private int tUserIt;
    private String tUserFirstname;
    private String tUserLastname;
    private String tUserUsername;
    private String tUserPassword;
    private TDeptEntity tDeptEntity;

    @Id
    @Column(name = "t_user_it")
    public int gettUserIt() {
        return tUserIt;
    }

    public void settUserIt(int tUserIt) {
        this.tUserIt = tUserIt;
    }

    @Basic
    @Column(name = "t_user_firstname")
    public String gettUserFirstname() {
        return tUserFirstname;
    }

    public void settUserFirstname(String tUserFirstname) {
        this.tUserFirstname = tUserFirstname;
    }

    @Basic
    @Column(name = "t_user_lastname")
    public String gettUserLastname() {
        return tUserLastname;
    }

    public void settUserLastname(String tUserLastname) {
        this.tUserLastname = tUserLastname;
    }

    @Basic
    @Column(name = "t_user_username")
    public String gettUserUsername() {
        return tUserUsername;
    }

    public void settUserUsername(String tUserUsername) {
        this.tUserUsername = tUserUsername;
    }

    @Basic
    @Column(name = "t_user_password")
    public String gettUserPassword() {
        return tUserPassword;
    }

    public void settUserPassword(String tUserPassword) {
        this.tUserPassword = tUserPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TUserEntity that = (TUserEntity) o;

        if (tUserIt != that.tUserIt) return false;
        if (tUserFirstname != null ? !tUserFirstname.equals(that.tUserFirstname) : that.tUserFirstname != null)
            return false;
        if (tUserLastname != null ? !tUserLastname.equals(that.tUserLastname) : that.tUserLastname != null)
            return false;
        if (tUserPassword != null ? !tUserPassword.equals(that.tUserPassword) : that.tUserPassword != null)
            return false;
        if (tUserUsername != null ? !tUserUsername.equals(that.tUserUsername) : that.tUserUsername != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tUserIt;
        result = 31 * result + (tUserFirstname != null ? tUserFirstname.hashCode() : 0);
        result = 31 * result + (tUserLastname != null ? tUserLastname.hashCode() : 0);
        result = 31 * result + (tUserUsername != null ? tUserUsername.hashCode() : 0);
        result = 31 * result + (tUserPassword != null ? tUserPassword.hashCode() : 0);
        return result;
    }

    @OneToOne(optional=false)
    @JoinColumn(name="t_user_deptid")
    public TDeptEntity gettDeptEntity(){
        return tDeptEntity;
    }

    public void settDeptEntity(TDeptEntity tDeptEntity){
        this.tDeptEntity = tDeptEntity;
    }

}
