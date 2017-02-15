package edu.nf.emptyproject.dao;


import edu.nf.emptyproject.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO extends BaseDAO {

    public void xxx() {
        getSession().get(User.class, 1);
    }

}
