package edu.nf.emptyproject.dao;


import edu.nf.emptyproject.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao {

    public void xxx() {
        getSession().get(User.class, 1);
    }

}
