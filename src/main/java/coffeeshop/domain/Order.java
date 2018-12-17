package coffeeshop.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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
    @Column(name="creation_date")
    private Date creationDate;

    @ManyToOne(fetch= FetchType.EAGER , cascade = CascadeType.ALL)
    @JoinColumn(name="account_id")
    private Account account;

    @OneToMany (fetch= FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinColumn(name = "order_id")
    private List<OrderEntries> orderDetails;

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

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +'\'' +
                ", amount=" + amount +'\'' +
                ", creationDate=" + creationDate +'\'' +
                ", account=" + account +'\'' +
                '}';
    }
}
