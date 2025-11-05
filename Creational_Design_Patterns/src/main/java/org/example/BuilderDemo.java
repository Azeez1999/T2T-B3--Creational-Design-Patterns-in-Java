package org.example;

public class BuilderDemo {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
                .setCPU("Intel Core i9")
                .setRAM(32)
                .setStorage(1_000)
                .setGraphicsCard("NVIDIA RTX 4080")
                .build();


        Computer officePC = new Computer.Builder()
                .setCPU("Intel Core i5")
                .setRAM(16)
                .setStorage(512)
                .setGraphicsCard("Integrated")
                .build();


        System.out.println(gamingPC);
        System.out.println(officePC);
    }
}


class Computer {
    private final String CPU;
    private final int RAM; // in GB
    private final int storage; // in GB
    private final String graphicsCard;


    private Computer(Builder b) {
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.storage = b.storage;
        this.graphicsCard = b.graphicsCard;
    }


    public static class Builder {
        private String CPU;
        private int RAM;
        private int storage;
        private String graphicsCard;


        public Builder setCPU(String CPU) { this.CPU = CPU; return this; }
        public Builder setRAM(int RAM) { this.RAM = RAM; return this; }
        public Builder setStorage(int storage) { this.storage = storage; return this; }
        public Builder setGraphicsCard(String graphicsCard) { this.graphicsCard = graphicsCard; return this; }


        public Computer build() { return new Computer(this); }
    }


    @Override public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM=" + RAM + "GB" +
                ", storage=" + storage + "GB" +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }
}