package com.pbf.lil.jdbc;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderLine {
    private int quantity;
    private String productCode;
    private String productName;
    private int productSize;
    private String productVariety;
    private BigDecimal productPrice;

}
