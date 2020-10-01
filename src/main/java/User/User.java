package User;

import Product.Product;

import javax.management.relation.Role;
import java.util.ArrayList;

public abstract class User implements IUser {
    //variables
    private int id;
    private String name;
    private String surname;
    private int age;
    private Role role;
    private ArrayList<Product> bin;


    //methods
    public String roleMessage(){
        if(role!=null)
        return "You are "+role.toString();
        return "You have no role";
    }


    //getters & setters


    public ArrayList<Product> getBin() {
        return bin;
    }

    public void setBin(ArrayList<Product> bin) {
        this.bin = bin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
