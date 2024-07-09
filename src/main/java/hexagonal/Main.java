package hexagonal;

import java.util.Scanner;

import aplication.CreateUserUseCase;
import aplication.FindUserUseCase;
import domain.service.UserService;
import infraestructure.in.UserController;
import infraestructure.out.UserRepository;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        System.out.println("Ingrese 1 para crear usuario");
        System.out.println("Ingrese 2 para buscar usuario");
        System.out.println("Ingrese 3 para eliminar usuario");
        System.out.println("Ingrese 4 para actualizar usuario");

        UserService userService = new UserRepository();
        CreateUserUseCase createUserUseCase = new CreateUserUseCase(userService);
        FindUserUseCase findUserUseCase=new FindUserUseCase(userService);
        UserController consoleAdapter = new UserController(createUserUseCase,findUserUseCase);
        try (Scanner scanner = new Scanner(System.in)) {
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Aqui se agregael menu");

                    consoleAdapter.start();

                    break;
                case 2:
                    System.out.println("Aqui se buscar usuario");
                    consoleAdapter.find();
                    break;
                case 3:
                    // Eliminar Usuario
                    break;
                case 4:
                    // Actualizar Usuario
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }

    }
}