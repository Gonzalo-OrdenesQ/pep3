package cl.mingeso.prueba.Service;

import cl.mingeso.prueba.Models.PreguntaModel;
import cl.mingeso.prueba.Repository.PruebaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PruebaService {

    @Autowired
    PruebaRepository pruebaRepository;

    @Autowired
    RestTemplate restTemplate;

    public List<PreguntaModel> getPreguntas(String dificultad){
        List<PreguntaModel> preguntas = restTemplate.getForObject("http://pregunta/" + dificultad, List.class);
        return preguntas;
    }
}
