package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DTO.Cachorro;
import DTO.Pais;
import Conexao.Conexao;

public class CachorroDAO {

    final String NOMETABELA = "doguinho";

    public boolean inserir(Cachorro dog) {
        String sql = "INSERT INTO " + NOMETABELA +
                     "(nome, Sexo, cor, tipo_pelo, data_nascimento, raca, pai, mae, dono, peso, tamanho, chip) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try (Connection conn = Conexao.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, dog.getNome());
            ps.setString(2, dog.getSexo());
            ps.setString(3, dog.getCor());
            ps.setString(4, dog.getTipo_pelo());
            ps.setDate(5, Date.valueOf(dog.getData_nascimento()));
            ps.setString(6, dog.getRaca());
            ps.setString(7, dog.getPai().getNome());
            ps.setString(8, dog.getMae().getNome());
            ps.setString(9, dog.getDono());
            ps.setDouble(10, dog.getPeso());
            ps.setDouble(11, dog.getTamanho());
            ps.setInt(12, dog.getChip());

            ps.executeUpdate();
            
            ps.close();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(int id_dog) {
        String sql = "DELETE FROM " + NOMETABELA + " WHERE id_dog = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id_dog);
            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean alterar(Cachorro dog) {
        String sql = "UPDATE " + NOMETABELA +
                     " SET Nome = ?, Sexo = ?, cor = ?, tipo_pelo = ?, data_nascimento = ?, raca = ?, pai = ?, mae = ?, dono = ?, peso = ?, tamanho = ?, chip = ? " +
                     "WHERE id_dog = ?;";

        try (Connection conn = Conexao.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, dog.getNome());
            ps.setString(2, dog.getSexo());
            ps.setString(3, dog.getCor());
            ps.setString(4, dog.getTipo_pelo());
            ps.setDate(5, Date.valueOf(dog.getData_nascimento()));
            ps.setString(6, dog.getRaca());
            ps.setString(7, dog.getPai().getNome());
            ps.setString(8, dog.getMae().getNome());
            ps.setString(9, dog.getDono());
            ps.setDouble(10, dog.getPeso());
            ps.setDouble(11, dog.getTamanho());
            ps.setInt(12, dog.getChip());
            ps.setInt(13, dog.getId_dog());

            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean existe(Cachorro dog) {
        String sql = "SELECT * FROM " + NOMETABELA +
                     " WHERE nome = ? AND Sexo = ? AND cor = ? AND tipo_pelo = ? AND data_nascimento = ? AND raca = ? AND pai = ? AND mae = ? AND dono = ? AND peso = ? AND tamanho = ? AND chip = ?;";

        try (Connection conn = Conexao.conectar();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, dog.getNome());
            ps.setString(2, dog.getSexo());
            ps.setString(3, dog.getCor());
            ps.setString(4, dog.getTipo_pelo());
            ps.setDate(5, Date.valueOf(dog.getData_nascimento()));
            ps.setString(6, dog.getRaca());
            ps.setString(7, dog.getPai().getNome());
            ps.setString(8, dog.getMae().getNome());
            ps.setString(9, dog.getDono());
            ps.setDouble(10, dog.getPeso());
            ps.setDouble(11, dog.getTamanho());
            ps.setInt(12, dog.getChip());

            try (ResultSet rs = ps.executeQuery()) {             
                return rs.next();
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Cachorro> PesquisarTodos() {
        String sql = "SELECT * FROM " + NOMETABELA + ";";

        try (Connection conn = Conexao.conectar();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            return MontarLista(rs);

        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private List<Cachorro> MontarLista(ResultSet rs) {
        List<Cachorro> listObj = new ArrayList<>();

        try {
            while (rs.next()) {
                Cachorro obj = new Cachorro();
                Pais pai = new Pais();
                Pais mae = new Pais();

                pai.setNome(rs.getString(7));
                mae.setNome(rs.getString(8));

                obj.setId_dog(rs.getInt(1));
                obj.setNome(rs.getString(2));
                obj.setSexo(rs.getString(3));
                obj.setCor(rs.getString(4));
                obj.setTipo_pelo(rs.getString(5));
                obj.setData_nascimento(rs.getDate(6).toLocalDate());
                obj.setRaca(rs.getString(9));
                obj.setPai(pai);
                obj.setMae(mae);
                obj.setDono(rs.getString(10));
                obj.setPeso(rs.getDouble(11));
                obj.setTamanho(rs.getDouble(12));
                obj.setChip(rs.getInt(13));

                listObj.add(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listObj;
    }
}
