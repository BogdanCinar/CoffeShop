package coffeeshop.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by bci on 12/9/18 at 10:20 AM
 */

@Entity
@Table(name = "products")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotNull
    private Long code;

    @NotNull
    private String name;

    @NotNull
    private BigDecimal price;

    @NotNull
    private String description;


    @NotNull
    @Column(name = "creation_date")
    private Date creationDate;

    public Product() {
    }

    public Product(@NotNull Long code, @NotNull String name, @NotNull BigDecimal price, @NotNull String description, @NotNull Date creationDate) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.description = description;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return Id;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + Id +
                ", code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
