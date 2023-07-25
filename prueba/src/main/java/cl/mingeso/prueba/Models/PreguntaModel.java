package cl.mingeso.prueba.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PreguntaModel {

    private String enunciado;
    private String codigo;
    private String respuesta;
    private String dificultad;
}
