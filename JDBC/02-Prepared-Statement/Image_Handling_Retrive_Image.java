import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;

public class Image_Handling_Retrive_Image {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "Dk@8878545059";

        String folderPath = "D:\\Uploaded image\\";
        String sql = "SELECT image from images where image_id = ?";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers Loaded Successful");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());

        }

        try{
            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("Connection Successful");
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1,1);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                byte[] image_data = rs.getBytes("image");
                String image_path = folderPath + "extrected.jpg";
                OutputStream outputStream = new FileOutputStream(image_path);
                outputStream.write(image_data);

            }
            else
            {
                System.out.println("Image Not Found");
            }


        } catch (SQLException | IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    }

