package com.nubi.fws.model;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name="user_tbl")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int userId;
private String username;
private String password;
private String email;
}
