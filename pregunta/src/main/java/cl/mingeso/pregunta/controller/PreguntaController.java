package cl.mingeso.pregunta.controller;

import cl.mingeso.pregunta.entity.PreguntaEntity;
import cl.mingeso.pregunta.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PreguntaController {

    @Autowired
    private PreguntaService preguntaService;

    @PostMapping
    public ResponseEntity<PreguntaEntity> createPregunta(@RequestBody PreguntaEntity preguntaEntity){
        PreguntaEntity pregunta = preguntaService.create(preguntaEntity);
        if (pregunta == null)
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(pregunta);
    }

    @GetMapping
    public ResponseEntity<List<PreguntaEntity>> getAll(){
        List<PreguntaEntity> preguntas = preguntaService.getAll();
        if (preguntas.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(preguntas);
    }

    @GetMapping("/{dificultad}")
    public ResponseEntity<List<PreguntaEntity>> getThreeByDificultad(@PathVariable("dificultad") String dificultad){
        List<PreguntaEntity> preguntas = preguntaService.getThreeByDificultad(dificultad);
        if(preguntas.isEmpty())
            return ResponseEntity.noContent().build();
        return ResponseEntity.ok(preguntas);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        preguntaService.delete(id);
    }
}
