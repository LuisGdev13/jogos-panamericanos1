package br.com.fiap.repository;

import br.com.fiap.model.Medalha;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MedalhaRepository {
    private Connection con = (new ConnectionFactory()).getConnection();
        public MedalhaRepository() throws SQLException {
        }

        public void registrar(Medalha medalha) throws SQLException {
            String sql = "INSERT INTO medalha (medalha_id, modalidade, submodalidade, genero, tipo, pais ) VALUES (?, ?, ?, ?, ?, ?)";

            try (PreparedStatement pstmt = this.con.prepareStatement(sql, new String[]{"id"})) {
                pstmt.setLong(1, medalha.getId());
                pstmt.setString(2, medalha.getModalidade());
                pstmt.setString(3, medalha.getSubmodalidade());
                pstmt.setString(4, medalha.getGenero());
                pstmt.setString(5, medalha.getTipo());
                pstmt.setString(5, medalha.getPais());
                pstmt.executeUpdate();

                try (ResultSet rs = pstmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        medalha.setId(rs.getLong(1));
                    }
                }
            }

        }

    public void alterarPremiacao(String modalidade, String submodalidade, String genero, Medalha novaMedalha ) throws SQLException {
        String sql = "UPDATE ch_consultas SET status_consulta = ? WHERE id = ?";

        try (PreparedStatement pstmt = this.con.prepareStatement(sql)) {
            pstmt.setString(1, novaMedalha.getModalidade());


            pstmt.executeUpdate();
        }

    }
    }
