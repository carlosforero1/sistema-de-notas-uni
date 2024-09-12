package service;

import model.Estudiante;

import java.util.List;

public interface IClienteServicio {

    public List<Estudiante> listarEstudiante();

    public Estudiante bucarEstudiantePorId(Integer IdEstudiante);

    public void guardarEstudiante(Estudiante estudiante);

    public void EliminarEstudiante(Estudiante estudiante);
}
