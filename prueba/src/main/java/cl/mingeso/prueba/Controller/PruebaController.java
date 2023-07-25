package cl.mingeso.prueba.Controller;

import cl.mingeso.prueba.Models.PreguntaModel;
import cl.mingeso.prueba.Service.PruebaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/prueba")
public class PruebaController {

    @Autowired
    PruebaService pruebaService;

    @GetMapping("/{dificultad}")
    public ResponseEntity<List<PreguntaModel>> getPreguntas(@PathVariable String dificultad){
        System.out.println("manos a la obra");
        List<PreguntaModel> preguntas = pruebaService.getPreguntas(dificultad);
        if(preguntas.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(preguntas);
    }

}
