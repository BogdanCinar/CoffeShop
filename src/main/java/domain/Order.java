package domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by bci on 12/9/18 at 10:23 AM
 */
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private Double amount;

    @NotNull
    private Date creationDate;

    @ManyToOne(fetch= FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinColumn(name="ID")
    private Account account;

}
