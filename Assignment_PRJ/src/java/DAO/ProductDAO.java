/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;
import model.Product;

/**
 *
 * @author USER
 */
public class ProductDAO {

//    String sql;
//    Connection conn;
//    PreparedStatement ps;
//    ResultSet rs;
    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "select *  from Product p inner join Categogies c on p.category_id = c.id";
            Connection conn = new BaseDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(13), rs.getBoolean(11));
                list.add(p);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public List<Product> getAllNewRomandProduct() {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "select top 8 * from Product p inner join Categogies c on p.category_id = c.id where c.name like '%Romand%'\n"
                    + "order by created_date desc ";
            Connection conn = new BaseDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(13), rs.getBoolean(11));
                list.add(p);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public List<Product> getAllNewGilaaProduct() {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "select top 8 * from Product p inner join Categogies c on p.category_id = c.id where c.name like '%Gilaa%'\n"
                    + "order by created_date desc ";
            Connection conn = new BaseDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(13), rs.getBoolean(11));
                list.add(p);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return list;
    }

    public static void create(Product p) {
        try {
            String sql = "INSERT INTO [Web_banson].[dbo].[Product]\n"
                    + "           ([name]\n"
                    + "           ,[category_id]\n"
                    + "           ,[quantity]\n"
                    + "           ,[price]\n"
                    + "           ,[description]\n"
                    + "           ,[imagine]\n"
                    + "           ,[imagine2]\n"
                    + "           ,[imagine3]\n"
                    + "           ,[created_date]\n"
                    + "           ,[status])\n"
                    + "     VALUES\n"
                    + "           (?,?,?,?,?,?,?,?,?,?)";
            Connection conn = new BaseDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, p.getName());
            ps.setInt(2, p.getCategory_id());
            ps.setInt(3, p.getQuantity());
            ps.setInt(4, p.getPrice());
            ps.setString(5, p.getDescription());
            ps.setString(6, p.getImagine());
            ps.setString(7, p.getImagine2());
            ps.setString(8, p.getImagine3());
            ps.setString(9, p.getCreated_date());
            ps.setBoolean(10, p.isStatus());

            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int delete(int id) {
        int k = 0;
        try {
            String sql = "DELETE FROM [Web_banson].[dbo].[Product]\n"
                    + "      WHERE id = ?";
            Connection conn = new BaseDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            k = ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }

    public Product getProductById(int id) {

        try {
            String sql = "select *  from Product p inner join Categogies c on p.category_id = c.id where p.id =?";
            Connection conn = new BaseDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(13), rs.getString(14));
                return p;
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public void update(Product p) {
        try {
            String sql = "UPDATE [Web_banson].[dbo].[Product]\n"
                    + "   SET [name] = ?\n"
                    + "      ,[category_id] = ?\n"
                    + "      ,[quantity] = ?\n"
                    + "      ,[price] = ?\n"
                    + "      ,[description] = ?\n"
                    + "      ,[imagine] = ?\n"
                    + "      ,[imagine2] = ?\n"
                    + "      ,[imagine3] = ?\n"
                    + "      ,[created_date] = ?\n"
                    + "      ,[status] = ?\n"
                    + " WHERE id = ?";
            Connection conn = new BaseDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, p.getName());
            ps.setInt(2, p.getCategory_id());
            ps.setInt(3, p.getQuantity());
            ps.setInt(4, p.getPrice());
            ps.setString(5, p.getDescription());
            ps.setString(6, p.getImagine());
            ps.setString(7, p.getImagine2());
            ps.setString(8, p.getImagine3());
            ps.setString(9, p.getCreated_date());
            ps.setBoolean(10, p.isStatus());
            ps.setInt(11, p.getId());

            ps.executeUpdate();

        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public List<Category> getAllCategory() {

        List<Category> list = new ArrayList<>();
        try {
            String sql = "select*from Categogies";
            Connection conn = new BaseDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Category c = new Category(rs.getInt(1), rs.getString(2), rs.getString(3));
                list.add(c);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<Product> getAllProductbyCategory(int categoryId) {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "select *  from Product p inner join Categogies c on p.category_id = c.id where p.category_id=?";
            Connection conn = new BaseDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, categoryId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(13), rs.getBoolean(11));
                list.add(p);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public List<Product> Search(String keyword) {
        List<Product> list = new ArrayList<>();
        try {
            String sql = "select *  from Product p inner join Categogies c on p.category_id = c.id where p.name like ?";
            Connection conn = new BaseDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "%" + keyword + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(13), rs.getBoolean(11));
                list.add(p);
            }
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int totalPage() throws Exception {
        int total = 0;
        try {
            String sql = "select COUNT(*) from Product";
            Connection conn = new BaseDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                total = rs.getInt(1);
            }
        } catch (SQLException e) {
        }
        return total;
    }

    public ArrayList<Product> pageProduct(int pageIndex) throws Exception {
        ArrayList<Product> lp = new ArrayList<>();
        try {
            String sql = "SELECT top 6 * \n"
                    + "FROM Product p inner join Categogies c on p.category_id = c.id\n"
                    + "where p.id > ?\n"
                    + "ORDER BY p.id";
            Connection conn = new BaseDAO().getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, (pageIndex - 1) * 6);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(13), rs.getBoolean(11));
                lp.add(p);
            }
        } catch (SQLException e) {
        }
        return lp;
    }

    public static void main(String[] args) throws Exception {
        ProductDAO p = new ProductDAO();
        ArrayList<Product> lp = p.pageProduct(5);
        for (Product product : lp) {
            System.out.println(product);
        }
    }

}
