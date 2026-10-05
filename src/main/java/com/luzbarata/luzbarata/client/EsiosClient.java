package com.luzbarata.luzbarata.client;

import com.luzbarata.luzbarata.config.EsiosProperties;
import org.springframework.stereotype.Component;

@Component
public class EsiosClient {

    private final EsiosProperties esiosProperties;

    public EsiosClient(EsiosProperties esiosProperties) {
        this.esiosProperties = esiosProperties;
    }

    public String construirUrlIndicador() {
        return esiosProperties.getBaseUrl()
                + "/indicators/"
                + esiosProperties.getIndicatorId();
    }
}