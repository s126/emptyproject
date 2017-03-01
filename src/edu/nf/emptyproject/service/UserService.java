package edu.nf.emptyproject.service;


import edu.nf.emptyproject.dao.UserDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserService {
    @Resource private UserDAO userDAO;
}
