package edu.nf.emptyproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    private Date create_time;
    private Date update_time;

}
