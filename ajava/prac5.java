//package ajava;
//
//
//import java.sql.*;
//import java.util.Scanner;
//class Student{
//    String driver="com.mysql.jdbc.Driver";
//    String url="jdbc:mysql://localhost:3306/";
//    String dbanme="mkd";
//    String username="root";
//    String password="";
//    Connection conn=null;
//    Statement stmt=null;
//    ResultSet rs=null;
//    String sql="";
//    Student(){
//        try{
//        Class.forName(driver);
//        conn=DriverManager.getConnection(url+dbanme, username, password);
//        stmt=conn.createStatement();
//        System.out.println(" successfully connected!.");
//        }
//        catch(Exception e){
//            System.out.println("failed to connect to Database");
//        }
//    }
//    protected void finalize()  
//    {  try{
//        stmt.close();
//        conn.close();
//        }catch(Exception e){
//
//        }
//
//    }  
//    void search(String sid){
//        try{
//            sql="select * from Student where sid='"+sid+"'";
//            rs=stmt.executeQuery(sql);
//            if(rs.next()){
//            System.out.println("Name of Student is: "+rs.getString("name")); 
//            }
//            else{
//                System.out.println("Data not available");
//            }
//            rs.close();
//        }
//        catch(Exception e){
//
//        }
//    }
//
//
//    int insertstudent(String sid,String name){
//        int no_of_row=0;
//        try{
//            sql="insert into Student value('"+sid+"','"+name+"')";
//            no_of_row=stmt.executeUpdate(sql);
//            if (row >0)
//            System.out.println(" Data inserted SuccesFully!.");
//            else
//            System.out.println(" Data not Inserted Successfully!!!..");
//        }catch(Exception e){
//            System.out.println(e);
//        }
//    }
//    int deletestudent(String sid){
//        int no_of_row=0;
//        try{
//            sql="delete from Student where sid='"+sid+"'";
//            no_of_row=stmt.executeUpdate(sql);
//            if (no_of_row>0){
//                
//            }
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }
//        return no_of_row;
//    }
//    int updatestudent(String sid,String name){
//        int no_of_row=0;
//        try{
//            sql="update Student set name='"+name+"' where sid='"+sid+"'";
//            no_of_row=stmt.executeUpdate(sql);
//        }
//        catch(Exception e){
//
//        }
//        return no_of_row;
//    }
//    public static void main(String[] args) {
//        Student s1=new Student();
//        Scanner in1=new Scanner(System.in);
//        while (true){
//            System.out.println("Enter your choice \n 1.search \n  2.insert \n 3.update \n 4.delete Student \5.exit");
//            int choice=in1.nextInt();
//            if (choice==1){
//                System.out.println("\n Enter Id of The Student For Search the name of Student");
//                String id=in1.next();
//                System.out.println(id);
//                s1.search(id);
//            }
//            else if (choice==2){
//                System.out.println("\n Enter Id: ");
//                String id=in1.next();
//                System.out.println("\n Enter Name: ");
//                String name=in1.next();
//                s1.insertstudent(id,name);
//            }
//            else if (choice==3){
//                System.out.println("\n enter id of student and name of student \n");
//                String id=in1.next();
//                String name=in1.next();
//                s1.updatestudent(id,name);
//            }
//            else if (choice==4){
//                System.out.println("\n enter  id of student \n");
//                String id=in1.next();
//                s1.deletestudent(id);
//            }
//            else{
//                break;
//            }
//        }
//    }
//}
//
