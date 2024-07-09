package domain.service;

import domain.entity.User;

public interface UserService {
    void createUser(User user);
    //User findUserById(Long id);
    //User deleteuserById(Long id);
    User findUserById(int id);


}
