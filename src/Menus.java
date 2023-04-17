import java.util.Scanner;

public class Menus {
    public int setTamArreglo(Scanner scanner){
        System.out.println("Ingresa el numero de materias que quieres registrar");
        int size = scanner.nextInt();
        scanner.nextLine();
        return size;
    }
    public int menu(Scanner scanner){
        System.out.println("""
                Seleccione una opcion:\s
                1.- Array \s
                2.- Array List\s
                3.- Maps\s
                4.- Hash Maps\s
                5.- Vector\s
                6.- Salir\s
                """);
        int n=scanner.nextInt();
        scanner.nextLine();
        return n;
    }
}
