public class Cpu {
    private double price;
    private Processor processor;
    private static RAM ram;
    
    public Cpu(double price, int cores, String manufacturer) {
        this.price = price;
        this.processor = new Processor(cores, manufacturer);
    }
    
    public static class RAM {
        private int memory;
        private String manufacturer;
        
        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
        
        public int getMemory() {
            return memory;
        }
        
        public String getManufacturer() {
            return manufacturer;
        }
    }
    
    public class Processor {
        private int cores;
        private String manufacturer;
        
        public Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }
        
        public int getCores() {
            return cores;
        }
        
        public String getManufacturer() {
            return manufacturer;
        }
    }
    
    public Processor getProcessor() {
        return processor;
    }
    
    public RAM getRAM() {
        return ram;
    }
    
    public void setRAM(int memory, String manufacturer) {
        ram = new RAM(memory, manufacturer);
    }
    
    public static void main(String[] args) {
        System.out.println("\nName:CHRISTEENA JOY\nReg No:22MCA020\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:04/04/2023\n\n");
        Cpu cpu = new Cpu(500.0, 4, "Intel");
        cpu.setRAM(8, "Kingston");
        System.out.println("Processor cores: " + cpu.getProcessor().getCores());
        System.out.println("Processor manufacturer: " + cpu.getProcessor().getManufacturer());
        System.out.println("RAM memory: " + cpu.getRAM().getMemory());
        System.out.println("RAM manufacturer: " + cpu.getRAM().getManufacturer());
    }
}

