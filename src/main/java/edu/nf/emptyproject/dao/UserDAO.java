package edu.nf.emptyproject.dao;


import edu.nf.emptyproject.dao.support.HibernateDAO;
import edu.nf.emptyproject.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO extends HibernateDAO<User> {

    public void get() {
        getSession().get(User.class, 1);
    }

}
