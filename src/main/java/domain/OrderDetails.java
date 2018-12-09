package domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;


@Entity()
@Table(name = "order_details")
public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private Order order;

    @ManyToOne(cascade = CascadeType.ALL)
    private Product product;

    @NotNull
    private BigDecimal quantity;

    @NotNull
    private BigDecimal price;

    @NotNull
    private BigDecimal productAmount;

}
