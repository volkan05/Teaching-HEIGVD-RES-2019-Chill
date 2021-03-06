package ch.heigvd.res.chill.domain.MichaelDaSilva;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Poncha implements IProduct{
    public final static String NAME = "Poncha";
    public final static BigDecimal PRICE = new BigDecimal(5.0);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() {
        return PRICE;
    }
}
