package Base;

import User.User;

import java.util.ArrayList;

public class UsersBase implements Base {

    private ArrayList<User> users;

    public void clearBase() {
        try{
            if(users.size()==0) throw new BaseException("Base is empty");
            setUsers(new ArrayList<User>());
        }
        catch (BaseException e)
        {
            return;
        }


    }

    public void RemoveItem(){
        try{
            if(users.size()==0) throw new BaseException("Base is empty");
            users.remove(users.size()-1);
        }
        catch (BaseException e)
        {
            return;
        }
    }


    public void RemoveItem(User user){
        try{
            if(users.size()==0) throw new BaseException("Base is empty");
            users.remove(user);
        }
        catch (BaseException e)
        {
            return;
        }
    }


    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
