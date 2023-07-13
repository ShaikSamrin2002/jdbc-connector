import java.sql.*;
class firstclass {
    public static void main(String[] args){
        //System.out.println("Hello World");
        try{
            //  load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // create connection
            //url,username,password
           // build a connection road from program to database
            String url="jdbc:mysql://localhost:3306/teacher";
            String username="root";
            String password="Samrin@2003";
            Connection con=DriverManager.getConnection(url, username, password);
            Statement stmt=con.createStatement();
            int result=stmt.executeUpdate("insert into student(id,name,address) values('100','sam','nandyal')");
            if(result>0)
            {
            System.out.println("Successfully inserted");
            }
            else{
                System.out.println("Unsuccessfull insertion");
            }
            if(con.isClosed())
            {
              System.out.println("Connection is Closed");
            }
            else{
                System.out.println("Connection is Created");
            }
        }catch(Exception e){e.printStackTrace();}          

    }
}