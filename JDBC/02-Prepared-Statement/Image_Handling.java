import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;

public class Image_Handling {
    public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/mydatabase";
            String username = "root";
            String password = "Dk@8878545059";

            String imagePath = "D:\\Images Upload\\20240727_165537.jpg";
            String sql = "INSERT INTO images(image) VALUES (?)";

            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("Drivers Loaded Successful");
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());

            }

            try{
                Connection connection = DriverManager.getConnection(url,username,password);
                System.out.println("Connection Successful");

                FileInputStream fileInputStream = new FileInputStream(imagePath);
                byte[] image_data = new byte[fileInputStream.available()];
                fileInputStream.read(image_data);
                PreparedStatement ps = connection.prepareStatement(sql);
                ps.setBytes(1,image_data);
                int affectedRow = ps.executeUpdate();
                if(affectedRow>0)
                {
                    System.out.println("Image Inserted");
                }
                else {
                    System.out.println("image Insertion Failed");
                }

                } catch (SQLException | IOException ex) {
                throw new RuntimeException(ex);
            }
            }
        }


