package terravenda.com.example.entities;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;
    private String cpf;
    private String password;
    private Boolean termos;
    private Boolean Auth;

    public User(){

    }

    public User(Long id, String name, String email, String cpf, String password, Boolean termos, Boolean auth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.password = password;
        this.termos = termos != null ? termos : false;
        this.Auth = auth != null ? auth : false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getTermos() {
        return termos;
    }

    public void setTermos(Boolean termos) {
        this.termos = termos;
    }

    public Boolean getAuth() {
        return Auth;
    }

    public void setAuth(Boolean auth) {
        Auth = auth;
    }
}
