package service;

import model.Estudiantes;

import java.util.List;

public interface IEstudianteServicio {

    public List<Estudiantes> listarEstudiante();

    public Estudiantes bucarEstudiantePorId(Integer IdEstudiante);

    public void guardarEstudiante(Estudiantes estudiante);

    public void EliminarEstudiante(Estudiantes estudiante);
}
