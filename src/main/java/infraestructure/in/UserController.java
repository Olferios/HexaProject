package infraestructure.in;

import java.util.Scanner;

import aplication.CreateUserUseCase;
import aplication.FindUserUseCase;
import domain.entity.User;

public class UserController {
    private CreateUserUseCase createUserUseCase;
    private FindUserUseCase findUserUseCase;
    

    // public UserController() {
    // }


    public UserController(CreateUserUseCase createUserUseCase,FindUserUseCase findUserUseCase) {
        this.createUserUseCase = createUserUseCase;
        this.findUserUseCase = findUserUseCase;
    }


    public void start() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese nombre: ");
            String name = scanner.nextLine();

            System.out.println("ingrse email");
            String email = scanner.nextLine();

            User user = new User();
            user.setName(name);
            user.setEmail(email);
            createUserUseCase.execute(user);
        }
        System.out.println("Usuario creado exitosamente");
    }

    public void find(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("ingrese id a buscar");
            int id = scanner.nextInt();
            scanner.nextLine();
            User user=new User();
            user=findUserUseCase.execute(id);
            System.out.println("Usuario encontrado: "+user.getName());
            System.out.println("email del usuario"+ user.getEmail());
        }
            
    }

}
