package service;

import model.Profesores;

import java.util.List;

public interface IProfesoresServicio {
    public List<Profesores> listarProfesores();

    public Profesores bucarProfesoresPorId(Integer Profesores);

    public void guardarProfesores(Profesores Profesores);

    public void EliminarProfesores(Profesores Profesores);

}
