package edu.nf.emptyproject.service;


import edu.nf.emptyproject.dao.PostDAO;
import edu.nf.emptyproject.dao.UserDAO;
import edu.nf.emptyproject.model.Post;
import edu.nf.emptyproject.model.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserService {

    @Resource private UserDAO userDAO;
    @Resource private PostDAO postDAO;

    // 日志支持。消灭 System.out.println
    private static final Log logger = LogFactory.getLog(UserService.class);


    /**
     * 下面是个示例
     */

    public void initData () {

        logger.info("如果需要，初始化一点数据");

        // 如果没有数据，构造一点
        if(userDAO.count() ==0 ) {

            logger.debug("创建用户，互加好友");

            User x = new User("周洁伦");
            User y = new User("麻花藤");
            User z = new User("马云云");

            x.getFriends().add(y);
            x.getFriends().add(z);
            z.getFriends().add(x);

            userDAO.save(x);
            userDAO.save(y);
            userDAO.save(z);


            logger.debug("发布微博");

            postDAO.save(new Post("我的新专辑就要发布了，希望大家喜欢", x));
            postDAO.save(new Post("喜欢音乐的小伙伴们，你们好。精心为你们打造了一首歌，希望你们喜欢。", x));
            postDAO.save(new Post("阿里巴巴将加强与南方的合作", z));
            postDAO.save(new Post("电商的未来在南方", z));
            postDAO.save(new Post("淘宝上没有假货，如果看到假货，你肯定上了假的淘宝", z));


        }
    }


    public User findUserById(long id) {

        logger.info("示例：查询用户，包含级联数据");

        User ret = userDAO.findById(id);

        Hibernate.initialize(ret.getPosts());
        Hibernate.initialize(ret.getFriends());
        Hibernate.initialize(ret.getFans());
        Hibernate.initialize(ret.getFans().get(0).getPosts());


        return ret;
    }

}
