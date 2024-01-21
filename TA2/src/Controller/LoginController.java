package Controller;


import java.util.ArrayList;
import com.google.gson.reflect.TypeToken;
import ModelGson.ModelGson;
import Node.NodeAdmin;
import View.ViewAdmin;



public class LoginController {
    private ViewAdmin viewAdmin;
    

    public LoginController(ViewAdmin viewAdmin) {
        this.viewAdmin = viewAdmin;
    }

    public void ValidasiLogin(String email, String password) {
        ArrayList<NodeAdmin> listAdmins = new ModelGson<NodeAdmin>("Database/DatabaseAdmin.json").readFromFile(new TypeToken<ArrayList<NodeAdmin>>() {}.getType());
        if (listAdmins != null) {
            for (NodeAdmin admin : listAdmins) {
                if (admin.getEmail().equalsIgnoreCase(email) && admin.getPassword().equalsIgnoreCase(password)) {
                    viewAdmin.MenuAdmin();
                    return;
                }
            }
        }
        System.out.println("Email atau Password Salah");
    }
}