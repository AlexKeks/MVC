package by.htp.hotel.entities;

import by.htp.hotel.entities.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User implements Person {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 20)
    private String surName;

    @Column(unique = true, nullable = false, length = 30)
    private String email;

    @Column(unique = true, nullable = false, length = 30)
    private String password;

    private String fullName;

    @OneToOne
    private List<Order> orders;


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surName) {
        this.surName = surName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }


    public String getEmail() {
        return email;
    }

       public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public void setPassword(String password) {
        this.password = password;

    }
}
