package domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by bci on 12/9/18 at 10:23 AM
 */

@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    @Column(unique = true)
    private String userName;

    @NotNull
    private String password;

    @Column(unique = true)
    private String email;

    @NotNull
    private String role;

    public Account(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
