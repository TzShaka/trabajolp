package pe.edu.upeu.sysasistencia.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysasistencia.modelo.Periodo;
import pe.edu.upeu.sysasistencia.repository.PeriodoRepository;
import pe.edu.upeu.sysasistencia.service.PeriodoService;

import java.util.List;
@Service
public class PeriodoServiceImp implements PeriodoService {

    @Autowired
    PeriodoRepository periodoRepository;

    @Override
    public List<Periodo> obtenerPeridos() {
        return periodoRepository.findAll();
    }
    @Override
    public Periodo obtenerPeriodo(Long id){
        return periodoRepository.findById(id).get();
    }
    @Override
    public void guardarPeriodo (Periodo periodo){
        periodoRepository.save(periodo);
    }
    @Override
    public void eliminarPeriodo (Long id){
        periodoRepository.deleteById(id);
    }
    @Override
    public void actualizarPerido (Periodo periodo){
        periodoRepository.save(periodo);
    }
}