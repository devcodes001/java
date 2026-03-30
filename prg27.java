import java.io.*;

class prg27 {
     public static void main(String[] args) throws Exception {
          FileInputStream fin = new FileInputStream("source.txt");
          FileOutputStream fout = new FileOutputStream("dest.txt");
          int ch;
         
   
          while((ch = fin.read())!=-1){
              fout.write(ch);
          }
          fin.close();
          fout.close();
        }
  }
