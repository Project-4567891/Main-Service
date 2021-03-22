package com.eler.MainService.Models;

public class TeacherAccount {

    private int idTeacher;

    private String email;

    private String firstName;

    private String lastName;

    public TeacherAccount(int idTeacher, String email, String firstName, String lastName) {
        this.idTeacher = idTeacher;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public TeacherAccount(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public TeacherAccount() {
    }

    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIdTeacher() {
        return idTeacher;
    }

    public void setIdTeacher(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    
}
