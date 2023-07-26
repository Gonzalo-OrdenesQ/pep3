package cl.mingeso.pregunta.service;

import cl.mingeso.pregunta.entity.PreguntaEntity;
import cl.mingeso.pregunta.repository.PreguntaRepository;
import lombok.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.desktop.SystemSleepEvent;
import java.util.ArrayList;
import java.util.List;

@Service
public class PreguntaService {
    @Autowired
    private PreguntaRepository preguntaRepository;

    @Generated
    public PreguntaEntity create(PreguntaEntity preguntaEntity){
        PreguntaEntity p = preguntaRepository.save(preguntaEntity);
        return p;
    }

    @Generated
    public void delete(Integer id){
        preguntaRepository.deleteById(id);
    }

    @Generated
    public List<PreguntaEntity> getAll(){
        return preguntaRepository.findAll();
    }

    @Generated
    public List<PreguntaEntity> getAllByDificultad(String dificultad){
        List<PreguntaEntity> preguntas = preguntaRepository.getByDificultad(dificultad);
        return preguntas;
    }

    @Generated
    public ArrayList<PreguntaEntity> getThreeByDificultad(String dificultad){
        List<PreguntaEntity> preguntas = preguntaRepository.getByDificultad(dificultad);
        ArrayList<PreguntaEntity> salida = new ArrayList<PreguntaEntity>();
        int rn;
        for (int i = 0; i < 3; i++){
            rn = (int) (Math.random() * (preguntas.size() -1));
            salida.add(preguntas.get(rn));
        }
        return salida;
    }

}
