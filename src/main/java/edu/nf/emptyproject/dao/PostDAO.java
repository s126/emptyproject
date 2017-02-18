package edu.nf.emptyproject.dao;

import edu.nf.emptyproject.dao.support.HibernateDAO;
import edu.nf.emptyproject.model.Post;
import org.springframework.stereotype.Repository;


@Repository
public class PostDAO extends HibernateDAO<Post> {
}
