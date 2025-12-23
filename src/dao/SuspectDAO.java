package dao;

import db.DBConnection;
import model.Suspect;

import java.sql.*;
import java.util.*;

public class SuspectDAO {

    public List<Suspect> getSuspectsByCase(int caseId) {
        List<Suspect> list = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM suspects WHERE case_id=?");
            ps.setInt(1, caseId);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Suspect(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("statement"),
                        rs.getBoolean("guilty")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // 🔥 NEW
    public void insertSuspect(int caseId, String name, String statement, boolean guilty) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO suspects(name, statement, guilty, case_id) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, statement);
            ps.setBoolean(3, guilty);
            ps.setInt(4, caseId);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
