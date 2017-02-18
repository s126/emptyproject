package edu.nf.emptyproject.model;

import javax.persistence.*;
import java.util.*;


@Entity
@Table(name = "USERS")
public class User {

    // ============== properties =============== //

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @OneToMany(mappedBy = "author")
    private List<Post> posts = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "relationships", joinColumns = {@JoinColumn(name = "m")}, inverseJoinColumns = {@JoinColumn(name = "s")})
    private List<User> friends = new ArrayList<>();

    @ManyToMany(mappedBy = "friends")
    private List<User> fans = new ArrayList<>();

    private Date create_time;
    private Date update_time;





    // ============== constructors and toString =============== //

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", create_time=" + create_time +
                ", update_time=" + update_time +
                '}';
    }





    // ============== getter and setter =============== //

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    public List<User> getFans() {
        return fans;
    }

    public void setFans(List<User> fans) {
        this.fans = fans;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
