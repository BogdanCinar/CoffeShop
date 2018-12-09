package domain;

import javax.persistence.*;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by bci on 12/9/18 at 10:20 AM
 */

@Entity
@Table(name = "product")
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    @NotNull
    private long code;

    @NotNull
    private String name;

    @NotNull
    private BigDecimal price;

    @NotNull
    private String description;


    @NotNull
    private Date creationDate;



}
