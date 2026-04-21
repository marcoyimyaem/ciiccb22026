

import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class ExceptionsLesson{
    
    public static void main(String[] args) throws Exception, RuntimeException {
        throw new Exception("Bad Code");
        // throw new RuntimeException("Bad Code");
    }
}
class ExceptionLesson2{
    static void getException() throws Exception{
            
        }
    public static void main(String[] args) {
        

        try{
            getException();
            Connection conn = DriverManager.getConnection(null,null,null);
            
            // System.out.println(args[0]);
            System.out.println(12/0);
            
        }
        
        catch(SQLException e){}
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("eeeee");
            System.exit(0);
        }
        catch(RuntimeException e){
            System.out.println(e);
            
        }
        catch(Exception e){
            
        }

        finally{
            System.out.println("finally block");
        }

        System.out.println("done");
        
    }
}
class ExceptionLesson3{
    public static void main(String[] args) {
        FileReader reader = null;
        try{
            reader = read();
            }
        catch(IOException e){
            try{
                if(reader!=null){
                    reader.close();
                            }
                }
            catch(IOException inner){
                    //
                }
            }
        }
            
            private static FileReader read() throws IOException {
                return null;
            }
}