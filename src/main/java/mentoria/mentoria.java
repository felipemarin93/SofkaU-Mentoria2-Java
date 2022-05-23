package mentoria;

import java.util.Scanner;

public class mentoria {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        String userVali = "Admin";
        String passwordVali = "1234";

        System.out.println("Ingrese su Usuario");
        String user = scaner.nextLine();
        System.out.println("Ingrese su contraseña");
        String password = scaner.nextLine();

        if(user.equals(userVali) && password.equals(passwordVali)){
            System.out.println("Bienvenido");
        }else{
            System.out.println("Revise las Credenciales");
        }
    }

}
