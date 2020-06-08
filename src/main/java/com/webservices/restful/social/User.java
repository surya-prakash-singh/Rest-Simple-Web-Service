package com.webservices.restful.social;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@ApiModel(description = "All User Description")
public class User {

    private Integer id;
    @Size(min=2, message = "Name should have atleast 2 characters")
    @ApiModelProperty(notes="Name should be atleast 2 characters")
    private String name;
    @Past
    @ApiModelProperty(notes = "Date of Birth should be in past")
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
