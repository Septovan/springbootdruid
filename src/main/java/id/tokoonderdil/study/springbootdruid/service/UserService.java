package id.tokoonderdil.study.springbootdruid.service;

import id.tokoonderdil.study.springbootdruid.domain.User;
import id.tokoonderdil.study.springbootdruid.exception.NoSuchCityException;
import id.tokoonderdil.study.springbootdruid.exception.NoSuchUserException;

public interface UserService {
    User findByName(String userName) throws NoSuchUserException, NoSuchCityException;
}
