class CPU
{
    double price;
    // nested class
    class Processor
    {

        // members of nested class
        double cores;
        String manufacturer;

        double getCache()
        {
            return 4.3;
        }
    }

    // nested protected class
    protected class RAM{

        // members of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed()
        {
            return 5.5;
        }
    }
}

public class Inner
{
    public static void main(String[] args)
    {

        // Membuat objek CPU Outer class
        CPU cpu = new CPU();

       // Membuat Objek Prosesor inner Class dengan Outer Class
        CPU.Processor processor = cpu.new Processor();

        // Membuat Objek Ram inner class dengan outer class CPU
        CPU.RAM ram = cpu.new RAM();
        System.out.println("Processor Cache = " + processor.getCache());
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());
    }
}