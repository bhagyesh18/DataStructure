package ObjectOriented;

enum COMPUTERTYPE {
	PC, SERVER;
}

abstract class Computer {

	public abstract String getRAM();

	public abstract String getHDD();

	public abstract String getCPU();

	@Override
	public String toString() {
		return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
	}
}

class PC extends Computer {

	private String ram;
	private String hdd;
	private String cpu;

	public PC(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

}

class Server extends Computer {

	private String ram;
	private String hdd;
	private String cpu;

	public Server(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

}

class ComputerFactory {

	public static Computer getComputer(COMPUTERTYPE computerType, String ram, String hdd, String cpu) {
		if (computerType == COMPUTERTYPE.PC) {
			return new PC(ram, hdd, cpu);
		} else if (computerType == COMPUTERTYPE.SERVER) {
			return new Server(ram, hdd, cpu);
		}

		return null;
	}
}

public class FactoryPattern {
public static void main(String[] args) {
	Computer pc = ComputerFactory.getComputer(COMPUTERTYPE.PC,"2 GB","500 GB","2.4 GHz");
	Computer server = ComputerFactory.getComputer(COMPUTERTYPE.SERVER,"16 GB","1 TB","2.9 GHz");
	System.out.println("Factory PC Config::"+pc);
	System.out.println("Factory Server Config::"+server);

}
	
}
