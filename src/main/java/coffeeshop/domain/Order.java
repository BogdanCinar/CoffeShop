package coffeeshop.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by bci on 12/9/18 at 10:23 AM
 */
@Entity
@Table(name = "Orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private BigDecimal amount;

    @NotNull
    private Date creationDate;

    @ManyToOne(fetch= FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinColumn(name="id",insertable=false, updatable=false)
    private Account account;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Account getAccount() {
        return account;
    }
}
