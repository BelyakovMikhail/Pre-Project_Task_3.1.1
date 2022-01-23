package ru.belyakov.usersdata.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "firstName")
//    @NotNull(message = "Поле с имененм не должно быть пустым")
//    @Size(min = 2, max = 30, message = "Имя должно содерать больше одного символа")
    private String firstName;
    @Column(name = "lastName")
    //@NotNull(message = "Поле с фамилией не должно быть пустым")
    private String lastName;
    @Column(name = "email")
    //@NotNull(message = "Поле с email не должно быть пустым")
    private String email;
    @Column(name = "phoneNumber")
    //@NotNull(message = "Поле с номером телефона не должно быть пустым")
    private String phoneNumber;

}

