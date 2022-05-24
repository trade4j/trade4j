package org.trade4j.trade;

import java.math.BigDecimal;
import java.util.Currency;

public record Price(BigDecimal value, Currency currency) {

}
