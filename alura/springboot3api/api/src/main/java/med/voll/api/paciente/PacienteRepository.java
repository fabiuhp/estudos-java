package med.voll.api.paciente;

import med.voll.api.medico.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
