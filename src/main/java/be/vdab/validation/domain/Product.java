package be.vdab.validation.domain;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public class Product {
    @PositiveOrZero @Digits(integer = 7, fraction = 2)
    private BigDecimal aankoopPrijs;
    @PositiveOrZero @Digits(integer = 7, fraction = 2)
    private BigDecimal verkoopPrijs;

    public BigDecimal getAankoopPrijs() {
        return aankoopPrijs;
    }

    public void setAankoopPrijs(BigDecimal aankoopPrijs) {
        this.aankoopPrijs = aankoopPrijs;
    }

    public BigDecimal getVerkoopPrijs() {
        return verkoopPrijs;
    }

    public void setVerkoopPrijs(BigDecimal verkoopPrijs) {
        this.verkoopPrijs = verkoopPrijs;
    }
}
