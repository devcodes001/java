class CPU {
    double price;

    class Processor {
        int cores;
        String manufacturer;

        void display() {
            System.out.println("Processor cores: " + cores);
            System.out.println("Processor manufacturer: " + manufacturer);
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        void display() {
            System.out.println("RAM memory: " + memory + "GB");
            System.out.println("RAM manufacturer: " + manufacturer);
        }
    }

    public static void main(String[] args) {
        CPU cpu = new CPU();
        cpu.price = 25000; 

        CPU.Processor processor = cpu.new Processor();
        processor.cores = 8;
        processor.manufacturer = "Intel";

        CPU.RAM ram = new CPU.RAM();
        ram.memory = 16;
        ram.manufacturer = "Corsair";

        System.out.println("CPU Price: " + cpu.price);
        processor.display();
        ram.display();
    }
}
