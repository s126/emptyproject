package edu.nf.emptyproject.service;


import edu.nf.emptyproject.dao.PostDAO;
import edu.nf.emptyproject.dao.UserDAO;
import edu.nf.emptyproject.model.Post;
import edu.nf.emptyproject.model.User;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserService {

    @Resource private UserDAO userDAO;
    @Resource private PostDAO postDAO;


    /**
     * demo
     */
    public User findUserById(long id) {

        User x = new User("x");
        userDAO.save(x);

        Post p = new Post("y", x);
        postDAO.save(p);

        User ret = userDAO.findById(id);
        Hibernate.initialize(ret.getPosts());

        return ret;
    }

}
