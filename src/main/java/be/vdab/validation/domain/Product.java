package be.vdab.validation.domain;

import be.vdab.validation.constraints.Prijs;
import be.vdab.validation.constraints.VerkoopPrijsAankoopPrijs;

import java.math.BigDecimal;
@VerkoopPrijsAankoopPrijs
public class Product {
    @Prijs
    private BigDecimal aankoopPrijs;
    @Prijs
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
