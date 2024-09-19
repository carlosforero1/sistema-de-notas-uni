package service;

import model.Estudiantes;
import org.springframework.beans.factory.annotation.Autowired;
import repository.EstudianteRepositorio;

import java.util.List;

public class EstudianteServicio implements IEstudianteServicio {

    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    @Override
    public List<Estudiantes> listarEstudiante() {
        List<Estudiantes> estudiante = estudianteRepositorio.findAll();
        return estudiante;
    }

    @Override
    public Estudiantes bucarEstudiantePorId(Integer idEstudiante) {
        Estudiantes estudiante = estudianteRepositorio.findById(idEstudiante).orElse(null);
        return estudiante;
    }

    @Override
    public void guardarEstudiante(Estudiantes estudiante) {
        estudianteRepositorio.save(estudiante);
    }

    @Override
    public void EliminarEstudiante(Estudiantes estudiante) {
        estudianteRepositorio.delete(estudiante);
    }
}
