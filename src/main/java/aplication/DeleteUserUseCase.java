package aplication;


import domain.service.UserService;

public class DeleteUserUseCase {
    private final UserService userService;
    
    public DeleteUserUseCase(UserService userService) {
        this.userService = userService;
    }

    //metodo
    public void execute (int id){
         userService.deleteUserById(id);

    }

}
