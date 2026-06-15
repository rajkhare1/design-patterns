package com.rajkhare.solid.openclose;

import lombok.Getter;
import lombok.Setter;

// base class : Closed - for modification
@Setter
@Getter
public abstract class Subscriber {

    protected Long subscriberId;

    protected String address;

    protected Long phoneNumber;

    protected int baseRate;

    // Open - for extension
    public abstract double calculateBill();

}
