package edu.nf.emptyproject.dao;


import edu.nf.emptyproject.dao.support.HibernateDao;
import edu.nf.emptyproject.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO extends HibernateDao {

    public void xxx() {
        getSession().get(User.class, 1);
    }

}
