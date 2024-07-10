package com.thiagov2a.screenmatch.excepciones;

public class ConversionJSONException extends RuntimeException {

    private String mensaje;

    public ConversionJSONException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
