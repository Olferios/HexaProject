package infraestructure.in;

import java.util.Scanner;

import aplication.CreateUserUseCase;
import aplication.DeleteUserUseCase;
import aplication.FindUserUseCase;
import domain.entity.User;

public class UserController {
    private CreateUserUseCase createUserUseCase;
    private FindUserUseCase findUserUseCase;
    private DeleteUserUseCase deleteUserUseCase;
    

    // public UserController() {
    // }


    public UserController(CreateUserUseCase createUserUseCase,FindUserUseCase findUserUseCase,DeleteUserUseCase deleteUserUseCase) {
        this.createUserUseCase = createUserUseCase;
        this.findUserUseCase = findUserUseCase;
        this.deleteUserUseCase=deleteUserUseCase;
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

    public void delete(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("ingrese id a eliminar");
            int id = scanner.nextInt();
            scanner.nextLine();
            
            User user=new User();
            deleteUserUseCase.execute(id);
            System.out.println("Usuario eliminado con exito");
        }
    }

}
