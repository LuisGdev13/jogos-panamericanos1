package br.com.fiap.repository;

import br.com.fiap.model.Medalha;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MedalhaRepository {
    private Connection conn = (new ConnectionFactory()).getConnection();

    public MedalhaRepository() throws SQLException {
        }

        public void registrar(Medalha medalha) throws SQLException {
            String sql = "INSERT INTO medalha (modalidade, submodalidade, genero, tipo, pais ) VALUES (?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = this.conn.prepareStatement(sql, new String[]{"id"})) {
                pstmt.setString(2, medalha.getModalidade());
                pstmt.setString(3, medalha.getSubmodalidade());
                pstmt.setString(4, medalha.getGenero());
                pstmt.setString(5, medalha.getTipo());
                pstmt.setString(6, medalha.getPais());
                pstmt.executeUpdate();

                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        medalha.setId(rs.getLong(1));
                    }
                }
            }
        }

    public List<Medalha> listarTodos() throws SQLException {
        List<Medalha> medalhas = new ArrayList<>();

        String sql = "SELECT modalidade, submodalidade, genero, tipo, pais FROM medalha";

        try (PreparedStatement pstmt = this.conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {

                Medalha medalha = new Medalha();
                medalha.setId(rs.getInt("medalha_id"));
                medalha.setModalidade(rs.getString("modalidade"));
                medalha.setSubmodalidade(rs.getString("submodalidade"));
                medalha.setGenero(rs.getString("genero"));
                medalha.setTipo(rs.getString("tipo"));
                medalha.setPais(rs.getString("pais"));

                medalhas.add(medalha);
            }

        } catch (SQLException e) {
            System.err.println("Erro ao listar medalhas: " + e.getMessage());
            throw e;
        }

        return medalhas;
    }


    public void alterarPremiacao(String modalidade, String submodalidade, String genero, Medalha novaMedalha) throws SQLException {
        String sql = """
        UPDATE medalha
        SET tipo = ?
        WHERE modalidade = ? AND submodalidade = ? AND genero = ?
    """;

        try (PreparedStatement pstmt = this.conn.prepareStatement(sql)) {
            pstmt.setString(1, novaMedalha.getTipo());
            pstmt.setString(2, modalidade);
            pstmt.setString(3, submodalidade);
            pstmt.setString(4, genero);

            int linhasAfetadas = pstmt.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println(" Premiação atualizada com sucesso!");
            } else {
                System.out.println(" Nenhum registro encontrado para atualizar.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar premiação: " + e.getMessage());
            throw e;
        }
    }

    public void alterarPremiacao(Medalha medalha) {
    }

    public List<Medalha> buscarPorModalidade(String modalidade) {
        return null;
    }
}


