class Fib implements Runnable{
    public void run(){
         int a = 0,b = 1;
         for (int i =1 ;i<=5;i++){
             System.out.println(a);
             int c = a+b;
             a = b;
             b = c;
           
         }
   }

}

class Even implements Runnable {
     public void run() {
        for(int i =1;i<=10;i++){
           if(i%2==0){
             System.out.println(i);
           }
        }
        }
}
class fibinacci{
     public static void main(String[] args){
         Thread t1 = new Thread(new Fib());
         Thread t2 = new Thread(new Even());
         t1.start();
         t2.start();

    }
}
