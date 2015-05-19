package uk.co.ns265.ejb;

import uk.co.ns265.entity.TDeptEntity;
import uk.co.ns265.entity.TUserEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by neils on 09/05/2015.
 */
@Stateless(name = "UserEJB")
public class UserEJBBean {
    @PersistenceContext(unitName = "PersistenceUnit")
    private EntityManager entityManager;

    public List<TUserEntity> findUsers(){
        TypedQuery<TUserEntity> query = entityManager.createNamedQuery("findAllUsers", TUserEntity.class);
        return query.getResultList();
    }

    public TUserEntity addNew(TUserEntity tUserEntity){
        entityManager.persist(tUserEntity);
        return tUserEntity;
    }

    public List<TDeptEntity> listDept(){
        TypedQuery<TDeptEntity> query = entityManager.createNamedQuery("listDepartments", TDeptEntity.class);
        return query.getResultList();
    }
}
