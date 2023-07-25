package cl.mingeso.prueba.Entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "pruebas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PruebaEntity {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer idPregunta1;
    private Integer idPregunta2;
    private Integer idPregunta3;
    private Float notaPregunta1;
    private Float notaPregutna2;
    private Float notaPregunta3;
    private Float notaFinal;
}
