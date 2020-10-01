package Base;

import User.User;

import java.util.ArrayList;

public class UsersBase implements Base {

    private ArrayList<User> users;

    public void clearBase() {
        try{
            if(users.size()==0) throw new BaseException("Base is empty");
        }
        catch (BaseException e)
        {
            return;
        }
        setUsers(new ArrayList<User>());

    }



    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
