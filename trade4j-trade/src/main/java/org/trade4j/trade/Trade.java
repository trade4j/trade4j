package org.trade4j.trade;

public interface Trade {

    Instrument getInstrument();

    Price calculateMarketValue(Price price);

    Price calculateNotionalValue(Price price);

}
