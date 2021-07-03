/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.jframe;

import entity.Admin;
import entity.NhanVien;
import entity.User;

/**
 *
 * @author ADMIN
 */
public class TestJFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User user = new Admin();
        user.setUsername("kukodon");
        user.setPassword("thanhtroll123");
        user.setHoTen("Anh Quân");
        LoginForm f = new LoginForm(user);
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
//           User x = new Admin();
//           x.setHoTen("Anh Quan");
//           System.out.println("Admin: "+x.getHoTen()+", "+x.getRole());
//           
//           User y = new NhanVien();
//           y.setHoTen("Quan Anh");
//           System.out.println("Nhan vien: "+y.getHoTen()+", "+y.getRole());
    }
    
}
