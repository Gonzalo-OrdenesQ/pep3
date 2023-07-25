package cl.mingeso.pregunta.entity;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "preguntas")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PreguntaEntity {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String enunciado;
    private String codigo;
    private String respuesta;
    private String dificultad;
}
