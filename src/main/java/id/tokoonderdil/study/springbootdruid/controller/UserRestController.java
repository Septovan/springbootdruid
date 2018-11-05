package id.tokoonderdil.study.springbootdruid.controller;

import id.tokoonderdil.study.springbootdruid.domain.User;
import id.tokoonderdil.study.springbootdruid.exception.NoSuchCityException;
import id.tokoonderdil.study.springbootdruid.exception.NoSuchUserException;
import id.tokoonderdil.study.springbootdruid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public User findByName(@RequestParam(value = "userName") String userName) {
        User user = null;
        try {
            user = userService.findByName(userName);
        } catch (NoSuchUserException e) {
            System.err.println(e.toString());
        } catch (NoSuchCityException e) {
            System.err.println(e.toString());
        }

        return user;
    }
}
