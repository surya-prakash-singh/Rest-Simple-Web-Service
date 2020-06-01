package com.webservices.restful.social;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDAOService {
    private static List<User> userList = new ArrayList<>();
    private static int userCount = 3;

    static {
        userList.add(new User(1,"Surya",new Date()));
        userList.add(new User(2,"Prakash",new Date()));
        userList.add(new User(3,"Singh",new Date()));
    }


    public List<User> findAll(){
        return userList;
    }

    public User findById(int id){

        Iterator<User> userIterator = userList.iterator();

        while(userIterator.hasNext()){
            User usr = userIterator.next();
            if(usr.getId() == id){
                return usr;
            }
        }
        return null;
    }


    public User saveUser(User usr){

        if(usr.getId() == null){
            usr.setId(userCount++);
        }
        userList.add(usr);
        userCount++;
        return usr;
    }

    public List<User> deleteUser(int id){
        Iterator<User> itr = userList.iterator();

        while (itr.hasNext()){
            User usr = itr.next();
            if(usr.getId() == id){
                userList.remove(usr);
                userCount--;
            }
        }
        return userList;
    }


}
