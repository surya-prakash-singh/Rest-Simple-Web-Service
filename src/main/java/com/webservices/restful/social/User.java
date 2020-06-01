package com.webservices.restful.social;

//import javax.validation.constraints.Past;
//import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

public class User {

    private Integer id;
//    @Size(min=2)
    private String name;
//    @Past
    private Date dateofbirth;
    private List<Post> posts;

    protected User(){
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public User(Integer id, String name, Date dateofbirth) {
        this.id = id;
        this.name = name;
        this.dateofbirth = dateofbirth;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
}
