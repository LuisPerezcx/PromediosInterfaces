import java.util.Scanner;

public class SetCalf {
    public void ingresarCalf(String[] materiaCalf, Scanner scanner){
        for(int i=0;i<materiaCalf.length;i++){
            System.out.println("Ingresa materia y calificacion");
            materiaCalf[i]=scanner.nextLine();
        }
    }
}
