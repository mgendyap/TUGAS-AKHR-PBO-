package Model;


import java.util.ArrayList;

import ModelGson.ModelGson;
import Node.NodeAdmin;

import com.google.gson.reflect.TypeToken;
public class ModelAdmin {
    ArrayList<NodeAdmin> listAdmin;
    ModelGson<NodeAdmin> modelGSONAdmin;

    public ModelAdmin(){
        listAdmin = new ArrayList<NodeAdmin>();
        modelGSONAdmin = new ModelGson<>("Database/DatabaseAdmin.json");
        loadData();
    }

    public void addAdmin(NodeAdmin Admin) {
        listAdmin.add(Admin);
        commitData();
    }

    private void loadData(){
        listAdmin = modelGSONAdmin.readFromFile(new TypeToken<ArrayList<NodeAdmin>>()
            {}.getType());
    }

    public void commitData(){
        modelGSONAdmin.WriteToFile(listAdmin);
    }
}