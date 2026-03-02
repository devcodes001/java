class Cpu{
    double price;
    Cpu(double price){
       this.price = price;
    }
    class Processor{
        int cores;
        String manufacturer;
        Processor(int cores,String manufacturer){
           this.cores = cores;
           this.manufacturer = manufacturer;

        }
    }
    void display(){
        System.out.println("Cores :"+ cores);
        System.out.println("Manufacturer:"+manufacturer);
    } 
    }
    static class RAM{
        int memory;
        String manufacturer;
        
        RAM(int memory,String manufacturer){
            this.memory = memory;
            this.manufactuer = manufactuer;
        }
        void display(){
            System.out.println("Memory :"+ memory);
            System.out.println("Manufacturer:"+manufacturer);
        }

    }
}

class test{
    public static void main(String[] args){
        Cpu cpu = new Cpu(3500.0);
        Cpu.Processor proc = cpu.new Processor(12,"Intel");
        Cpu.RAM ram = new Cpu.RAM(32,"Kingston");
        System.out.println("CPU Price: " + cpu.price);
        proc.display();
        ram.display();
        

   
    }





}














