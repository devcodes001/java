class CPU {
    double price;

    CPU(double price) {
        this.price = price;
    }

    class Processor {
        int cores;
        String manufacturer;

        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        void printInfo() {
            System.out.println("Cores: " + cores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    static class RAM {
        int memory;
        String manufacturer;

        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        void printInfo() {
            System.out.println("Memory: " + memory + "GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }
}

class CPU1 {
    public static void main(String[] args) {
        CPU cpu = new CPU(350.00);
        CPU.Processor proc = cpu.new Processor(12, "Intel");
        CPU.RAM ram = new CPU.RAM(32, "Kingston");

        System.out.println("CPU Price: " + cpu.price);
        proc.printInfo();
        ram.printInfo();
    }
}
