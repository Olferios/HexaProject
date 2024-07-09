package aplication;

import domain.entity.User;
import domain.service.UserService;

public class DeleteUserUseCase {
    private final UserService userService;
    
    public DeleteUserUseCase(UserService userService) {
        this.userService = userService;
    }

    //metodo
    public void execute (User user){
        userService.deleteUserById(user);

    }

}
