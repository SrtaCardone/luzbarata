package com.luzbarata.luzbarata;

import com.luzbarata.luzbarata.config.EsiosProperties;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EsiosPropertiesTest {

    @Autowired
    private EsiosProperties esiosProperties;

    @Test
    void cargaCorrectamenteLaConfiguracionDeEsios() {

        assertEquals("https://api.esios.ree.es", esiosProperties.getBaseUrl());
        assertEquals(1001, esiosProperties.getIndicatorId());
        assertEquals(8741, esiosProperties.getGeoId());
    }
}