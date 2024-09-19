package repository;

import model.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepositorio extends JpaRepository<Estudiantes,Integer> {
}
