package pe.edu.upeu.sysasistencia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.upeu.sysasistencia.modelo.Periodo;
import pe.edu.upeu.sysasistencia.service.PeriodoService;

import java.util.List;

@RestController
@RequestMapping("/periodo" )
public class PeriodoController {

    @Autowired
    private PeriodoService periodoService;

    @GetMapping("/List")
    public ResponseEntity<List<Periodo>> findAll() {
        List<Periodo> p = periodoService.obtenerPeridos();
        return ResponseEntity.ok(p);
    }


    @GetMapping("/List/{id}")
    public ResponseEntity<Periodo> findByPeriodo(@PathVariable Long id) {
        Periodo p = periodoService.obtenerPeriodo(id);
        return ResponseEntity.ok(p);
    }

    @PostMapping("/guardar")
    public void guardar(@RequestBody Periodo periodo) {
        periodoService.guardarPeriodo(periodo);

    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id){
        periodoService.eliminarPeriodo(id);

    }
}
