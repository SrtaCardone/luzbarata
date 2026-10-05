package com.luzbarata.luzbarata.client;

import com.luzbarata.luzbarata.config.EsiosProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class EsiosClient {

    private final EsiosProperties esiosProperties;
    private final RestClient restClient;

    public EsiosClient(EsiosProperties esiosProperties) {
        this.esiosProperties = esiosProperties;
        this.restClient = RestClient.create();
    }

    public String construirUrlIndicador() {
        return esiosProperties.getBaseUrl()
                + "/indicators/"
                + esiosProperties.getIndicatorId();
    }
public String obtenerIndicador() {

    return restClient
            .get()
            .uri(construirUrlIndicador())
            .header("x-api-key", esiosProperties.getToken())
            .header("Accept", "application/json; application/vnd.esios-api-v1+json")
            .retrieve()
            .body(String.class);
}
}
