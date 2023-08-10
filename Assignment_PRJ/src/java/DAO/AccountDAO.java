/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.UIManager.getString;
import model.Account;

/**
 *
 * @author USER
 */
public class AccountDAO {

    public Account login(String username, String password) {
        try {
            String sql = "select*from Account where username = ? and password = ?";
            Connection conn = new BaseDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
            }
        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public Account checkUser(String username) {
        try {
            String sql = "select*from Account where username = ? ";
            Connection conn = new BaseDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);          
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
            }
        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    
    public static void signUp(String user,String pass, String displayName,String email,String phoneNumber) {

        try {
            String sql = "INSERT INTO [Web_banson].[dbo].[Account]\n"
                    + "           ([username]\n"
                    + "           ,[password]\n"
                    + "           ,[displayname]\n"
                    + "           ,[email]\n"
                    + "           ,[numberphone]\n"
                    + "           ,[isAdmin])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,0)";
            Connection conn = new BaseDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setString(3, displayName);
            ps.setString(4, email);
            ps.setString(5, phoneNumber);
            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(AccountDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
