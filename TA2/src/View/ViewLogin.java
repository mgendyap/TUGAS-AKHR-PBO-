package View;

import java.util.Scanner;

import Controller.AdminController;

public class ViewLogin{
    private AdminController adminController;

    public ViewLogin(AdminController adminController){
        this.adminController = adminController;
    }  

    public void Login(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Email : ");
        String email = input.nextLine();
        System.out.println("Masukkan Password : ");
        String password = input.nextLine();
        AdminController.ValidasiLogin(email, password);
    }
}