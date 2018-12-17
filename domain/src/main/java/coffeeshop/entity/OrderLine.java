package coffeeshop.entity;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Table(name = "Order_Lines")
public class OrderLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_order",nullable = false)
    private Order order;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product", nullable = false)
    private Product product;

    private BigDecimal quantity;

    private BigDecimal price;

    @Column(name = "product_amount")
    private BigDecimal productAmount;

    public OrderLine() {
    }

    public OrderLine(Order order, Product product, BigDecimal quantity, BigDecimal price, BigDecimal productAmount) {
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.price = price;
        this.productAmount = productAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(BigDecimal productAmount) {
        this.productAmount = productAmount;
    }
}
