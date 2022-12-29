package med.voll.api.paciente;

import med.voll.api.medico.Medico;

public record DadosListagemPaciente(
        String nome,
        String email,
        String telefone
) {
    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getTelefone());
    }
}
