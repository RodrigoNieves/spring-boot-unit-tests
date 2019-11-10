package rrsn.me.springbootunittests.service;

import org.springframework.stereotype.Service;
import rrsn.me.springbootunittests.dao.UserDao;

import javax.annotation.Resource;


@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public String getUser() {
        return userDao.getUser();
    }
}