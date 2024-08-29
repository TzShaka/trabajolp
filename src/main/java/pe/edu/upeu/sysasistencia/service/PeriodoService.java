package pe.edu.upeu.sysasistencia.service;

import pe.edu.upeu.sysasistencia.modelo.Periodo;

import java.util.List;

public interface PeriodoService {
    public List<Periodo> obtenerPeridos();
    public Periodo obtenerPeriodo(Long id);
    public void guardarPeriodo(Periodo periodo);
    public void eliminarPeriodo(Long id);
    public void actualizarPerido(Periodo periodo);

}
