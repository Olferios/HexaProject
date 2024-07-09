package aplication;

import domain.entity.User;
import domain.service.UserService;

public class FindUserUseCase {
    private final UserService userService;

    public FindUserUseCase(UserService userService) {
        this.userService = userService;
    }

    //creo metodo
    public User execute (int id){
        User user=new User();
       return user= userService.findUserById(id);
    }

}
