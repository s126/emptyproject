package edu.nf.emptyproject.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "EMPTY_POSTS")
public class Post {

    // ============== properties =============== //

    @Id
    @GeneratedValue
    private long id;

    private String content;

    @ManyToOne
    private User author;

    private Date create_time;
    private Date update_time;





    // ============== constructors and toString =============== //

    public Post() {
    }

    public Post(String content, User author) {
        this.content = content;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", author=" + author +
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
