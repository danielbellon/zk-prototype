package com.payulatam.prototype.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movement {

    private Account account;
    private MovementType type;
    private Double value;
    private Date date;

}
