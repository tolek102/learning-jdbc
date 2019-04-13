package com.pbf.lil.jdbc;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.pbf.lil.jdbc.util.DataTransferObject;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Order implements DataTransferObject {
    private long id;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmail;
    private Date creationDate;
    private BigDecimal totalDue;
    private String status;
    private String salespersonFirstName;
    private String salespersonLastName;
    private String salespersonEmail;
    private List<OrderLine> orderLines;

}
