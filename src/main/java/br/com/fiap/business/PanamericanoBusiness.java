package br.com.fiap.business;

import br.com.fiap.model.Medalha;
import br.com.fiap.util.QuadroTO;
import br.com.fiap.repository.MedalhaRepository;

import java.sql.SQLException;
import java.util.List;

public class PanamericanoBusiness {

    private MedalhaRepository repository;

    {
        try {
            repository = new MedalhaRepository();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void registrarMedalha(Medalha medalha) throws SQLException {
        repository.registrar(medalha);
    }

    public void atualizarMedalha(Medalha medalha) {
        repository.alterarPremiacao(medalha);
    }

    public List<Medalha> listarQuadroMedalhas() {
        try {
            return repository.listarTodos();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public List<Medalha> listarPorModalidade(String modalidade) {
        return repository.buscarPorModalidade(modalidade);
    }
}
