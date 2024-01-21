package Controller;


import Model.ModelAdmin;
import Node.NodeAdmin;

public class AdminController {
        private ModelAdmin modelAdmin;

    public AdminController(ModelAdmin modelAdmin) {
        this.modelAdmin = modelAdmin;
    }

    public void insertAdmin(String email,String password) {
        modelAdmin.addAdmin(new NodeAdmin(email, password));
    }

}