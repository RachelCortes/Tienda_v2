package com.tienda.service;

import java.io.IOException;
import java.util.Map;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;

public interface ReporteService {

    public ResponseEntity<Resource>
            generaReporte(String reporte, //El nombre del reporte
                    Map<String, Object> parametros, //username
                    String tipo) throws IOException ; //El tipo de reporte que el usuario solicita

}
