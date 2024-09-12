package service;

import model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import repository.EstudianteRepositorio;

import java.util.List;
import java.util.Optional;

public class ClienteServicio implements IClienteServicio {

    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    @Override
    public List<Estudiante> listarEstudiante() {
        List<Estudiante> estudiante = estudianteRepositorio.findAll();
        return estudiante;
    }

    @Override
    public Estudiante bucarEstudiantePorId(Integer idEstudiante) {
        Estudiante estudiante = estudianteRepositorio.findById(idEstudiante).orElse(null);
        return estudiante;
    }

    @Override
    public void guardarEstudiante(Estudiante estudiante) {
        estudianteRepositorio.save(estudiante);
    }

    @Override
    public void EliminarEstudiante(Estudiante estudiante) {
        estudianteRepositorio.delete(estudiante);
    }
}
