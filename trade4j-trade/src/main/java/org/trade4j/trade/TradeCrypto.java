package org.trade4j.trade;

import org.trade4j.core.LiquidityCode;
import org.trade4j.core.MarketIdentifierCode;
import org.trade4j.core.Side;
import org.trade4j.core.Symbol;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

public class TradeCrypto implements Trade {

    private MarketIdentifierCode marketIdentifierCode;
    private Symbol symbol;
    private Instant transactionTimestamp;
    private Side side;
    private BigDecimal price;
    private BigDecimal quantity;
    private LocalDate tradeDate;
    private String executionVenueTradeReportId;
    private String executionVenueOrderId;
    private String executionVenueClientOrderId;
    private LiquidityCode liquidityCode;
    private List<Party> parties;


}
