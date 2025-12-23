package dao;

import db.DBConnection;
import model.Case;

import java.sql.*;
import java.util.*;

public class CaseDAO {

    public Case getRandomCase() {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "SELECT * FROM cases ORDER BY RAND() LIMIT 1";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                return new Case(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("description"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    // Insert case-Admin feature
    public void insertCase(String title, String description, String difficulty) {
        try {
            Connection con = DBConnection.getConnection();
            String sql = "INSERT INTO cases(title, description, difficulty, resolved) VALUES (?, ?, ?, false)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, description);
            ps.setString(3, difficulty);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // fetch all cases
    public List<Case> getAllCases() {
        List<Case> list = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM cases");

            while (rs.next()) {
                list.add(new Case(
                        rs.getInt("id"),
                        rs.getString("title"),
                        rs.getString("description")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
