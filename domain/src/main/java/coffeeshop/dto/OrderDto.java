package coffeeshop.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by bci on 12/11/18 at 2:16 PM
 */
public class OrderDto {

    private Long id;
    private BigDecimal amount;
    private Date creationDate;

    public OrderDto() {
    }

    public OrderDto(BigDecimal amount, Date creationDate) {
        this.amount = amount;
        this.creationDate = creationDate;
    }

    @JsonProperty
    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    public Long getId() {
        return id;
    }

    @JsonProperty
    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    public BigDecimal getAmount() {
        return amount;
    }

    @JsonProperty
    @JsonInclude(value = JsonInclude.Include.NON_EMPTY)
    public Date getCreationDate() {
        return creationDate;
    }

    @JsonSetter
    public void setId(Long id) {
        this.id = id;
    }

    @JsonSetter
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @JsonSetter
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
