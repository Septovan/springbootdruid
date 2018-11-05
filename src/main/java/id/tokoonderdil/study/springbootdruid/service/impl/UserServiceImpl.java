package id.tokoonderdil.study.springbootdruid.service.impl;

import id.tokoonderdil.study.springbootdruid.dao.cluster.CityDao;
import id.tokoonderdil.study.springbootdruid.dao.master.UserDao;
import id.tokoonderdil.study.springbootdruid.domain.City;
import id.tokoonderdil.study.springbootdruid.domain.User;
import id.tokoonderdil.study.springbootdruid.exception.NoSuchCityException;
import id.tokoonderdil.study.springbootdruid.exception.NoSuchUserException;
import id.tokoonderdil.study.springbootdruid.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Autowired
    private CityDao cityDao;

    @Override
    public User findByName(String userName) throws NoSuchUserException, NoSuchCityException {
        User user = null;
        City city = null;

        try {
            user = userDao.findByName(userName);
            city = cityDao.searchByName("Salatiga");
        } catch (Exception e) {
            System.err.println(e.toString());
        }

        if (Objects.isNull(user)) {
            throw new NoSuchUserException("No Such User!");
        } else if (Objects.isNull(city)) {
            throw new NoSuchCityException("No Such City!");
        } else {
            user.setCity(city);
        }

        return user;
    }
}

