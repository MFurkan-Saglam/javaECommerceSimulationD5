package Entity.concretes;

import Entity.abstracts.Entity;

public class Product implements Entity {
    private String name;
    private String lastname;
    private String e_mail;
    private String password;

    public Product() {

    }
    public Product(String name,String lastname,String e_mail,String password)
    {
        this.setName(name);
        this.setLastname(lastname);
        this.setE_mail(e_mail);
        this.setPassword(password);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
