package com.payroll;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mytable")
public class User {
    @Id
    private int id;
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String doj;
    private String pos;
    @Override
    public String toString()
    {
        return "User [id=" + id + ", username=" + username + ", firstname=" + firstname + ", lastname=" + lastname
                + ", email=" + email + ", phone=" + phone + ", doj=" + doj + ", pos=" + pos + ", age=" + age
                + ", salary=" + salary + ", password=" + password + "]";
    }
public User(int id,String username,String firstname,String lastname,String email,String phone,
            String pos,String age,String salary,String password)
{
    super();
    this.username=username;
    this.id=id;
    this.    
}
}
