package uk.co.ns265.entity;

import javax.persistence.*;

/**
 * Created by neils on 06/05/2015.
 */
@Entity
@Table(name = "t_dept", schema = "", catalog = "test")
@NamedQuery(name = "listDepartments",query = "select d from TDeptEntity d")
public class TDeptEntity {
    private int tDeptId;
    private String tDeptDescription;
//    private TUserEntity tUserEntity;

    @Id
    @Column(name = "t_dept_id")
    public int gettDeptId() {
        return tDeptId;
    }

    public void settDeptId(int tDeptId) {
        this.tDeptId = tDeptId;
    }

    @Basic
    @Column(name = "t_dept_description")
    public String gettDeptDescription() {
        return tDeptDescription;
    }

    public void settDeptDescription(String tDeptDescription) {
        this.tDeptDescription = tDeptDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TDeptEntity that = (TDeptEntity) o;

        if (tDeptId != that.tDeptId) return false;
        if (tDeptDescription != null ? !tDeptDescription.equals(that.tDeptDescription) : that.tDeptDescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tDeptId;
        result = 31 * result + (tDeptDescription != null ? tDeptDescription.hashCode() : 0);
        return result;
    }

/*
    @OneToOne(optional=false,cascade = CascadeType.ALL,mappedBy = "tDeptEntity",targetEntity = TUserEntity.class)
    public TUserEntity gettUserEntity(){
        return tUserEntity;
    }

    public void settUserEntity(TUserEntity tUserEntity){
        this.tUserEntity = tUserEntity;
    }
*/
}
