package com.luzbarata.luzbarata;

import com.luzbarata.luzbarata.client.EsiosClient;
import com.luzbarata.luzbarata.config.EsiosProperties;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EsiosClientTest {

    @Test
    void construyeCorrectamenteLaUrlDelIndicador() {

        EsiosProperties properties = new EsiosProperties();
        properties.setBaseUrl("https://api.esios.ree.es");
        properties.setIndicatorId(1001);
        properties.setGeoId(8741);

        EsiosClient client = new EsiosClient(properties);

        String resultado = client.construirUrlIndicador();

        assertEquals(
                "https://api.esios.ree.es/indicators/1001",
                resultado
        );
    }
}