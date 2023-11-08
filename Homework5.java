package _7_클래스들;
class Monitor {
    private final String size;
    private final String color;
    private final String power;

    public Monitor(String size, String color, String power) {
        this.size = size;
        this.color = color;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getPower() {
        return power;
    }
}

class Computer {
    private final String cpu;
    private final String memory;
    private final String hdd;
    private final String color;
    private final String power;

    public Computer(String cpu, String memory, String hdd, String color, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hdd = hdd;
        this.color = color;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on the computer.");
    }

    public String getCpu() {
        return cpu;
    }

    public String getMemory() {
        return memory;
    }

    public String getHdd() {
        return hdd;
    }

    public String getColor() {
        return color;
    }

    public String getPower() {
        return power;
    }
}

class PersonalComputer {
    private final Monitor monitor;
    private final Computer computer;

    public PersonalComputer(Monitor monitor, Computer computer) {
        this.monitor = monitor;
        this.computer = computer;
    }

    public void turnOn() {
//        System.out.println("Turning on the computer.");
        computer.turnOn();
//        System.out.println("Turning on the monitor.");
        monitor.turnOn();
    }

    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.println("CPU: " + computer.getCpu());
        System.out.println("Memory: " + computer.getMemory());
        System.out.println("HDD: " + computer.getHdd());
        System.out.println("Color: " + computer.getColor());
        System.out.println("Power: " + computer.getPower());
        System.out.println("The spec of the monitor");
        System.out.println("Size: " + monitor.getSize());
        System.out.println("Color: " + monitor.getColor());
        System.out.println("Power: " + monitor.getPower());
    }
}

class Homework5 {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("24 inch", "Black", "45W");
        Computer computer = new Computer("Core i7", "16GB", "2TB", "White", "500W");
        PersonalComputer personalComputer = new PersonalComputer(monitor, computer);
        personalComputer.turnOn();
        personalComputer.printInfo();
    }
}
