import java.io.*;

class prg26 {
     public static void main(String[] args) throws Exception {
          FileWriter fw = new FileWriter("test.txt");
          fw.write("hello java file handling ");
          fw.close();
         
          FileReader fr = new FileReader("test.txt");
          
          int ch;
       
          while((ch = fr.read())!=-1){
              System.out.print((char) ch);
          }
          fr.close();
        }
  }
