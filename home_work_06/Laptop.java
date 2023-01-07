package home_work_06;

// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;
// import java.util.Scanner; 
// import java.util.Set;

public class Laptop {
    private String model; // Aser, Samsung, Apple
    private String ram; // оперативка //  16, 32, 64
    private String hardDisk; // Гбайт // 1000, 500, 300
    private String opSystem; // Windows, Linux, macOS
    private String color; // black, white, grey
    
    
    public Laptop(String model, String ram, String hardDisk, String opSystem, String color) {
        this.model = model;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.opSystem = opSystem;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getOpSystem() {
        return opSystem;
    }

    public void setOpSystem(String opSystem) {
        this.opSystem = opSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Laptop [model=" + model + ", ram=" + ram + ", hardDisk=" + hardDisk + ", opSystem="
                + opSystem + ", color=" + color + "]" + "\n";
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + ((ram == null) ? 0 : ram.hashCode());
        result = prime * result + ((hardDisk == null) ? 0 : hardDisk.hashCode());
        result = prime * result + ((opSystem == null) ? 0 : opSystem.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (ram == null) {
            if (other.ram != null)
                return false;
        } else if (!ram.equals(other.ram))
            return false;
        if (hardDisk == null) {
            if (other.hardDisk != null)
                return false;
        } else if (!hardDisk.equals(other.hardDisk))
            return false;
        if (opSystem == null) {
            if (other.opSystem != null)
                return false;
        } else if (!opSystem.equals(other.opSystem))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        return true;
    }
}

