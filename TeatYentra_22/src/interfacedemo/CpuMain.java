package interfacedemo;
//Demonstrating the inner class (non-static)
class CPU{
	double price;
	class Processor{
		double cores;
		String manufacture;
		double getCache(){
			return 4.2;
		}
	}
	class RAM{
		double memory;
		String manfacturer;
		double getClockSpeed(){
			return 5.5;
		}
	}
}
public class CpuMain {
	public static void main(String[] args) {
		CPU cpu=new CPU();
		CPU.Processor processer = cpu.new Processor();
		CPU.RAM ram=cpu.new RAM();
		System.out.println("processor cache= "+processer.getCache());
		System.out.println("clock speed ="+ram.getClockSpeed());
	}
}
