package work_6;

import java.util.*;

public class Notebook {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notebook notebook)) return false;
        return Objects.equals(getStamp(), notebook.getStamp()) && Objects.equals(model, notebook.model) && Objects.equals(getRAM(), notebook.getRAM()) && Objects.equals(getHardDiskCapacity(), notebook.getHardDiskCapacity()) && Objects.equals(opirationSystem, notebook.opirationSystem) && Objects.equals(color, notebook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStamp(), model, getRAM(), getHardDiskCapacity(), opirationSystem, color);
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "stamp='" + stamp + '\'' +
                ", model='" + model + '\'' +
                ", RAM='" + RAM + '\'' +
                ", hardDiskCapacity='" + hardDiskCapacity + '\'' +
                ", opirationSystem='" + opirationSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    private String stamp;
    private String model;
    private Integer RAM;
    private Integer hardDiskCapacity;
    private String opirationSystem;
    private String color;

    public Notebook(String stamp, String model, Integer ram, Integer hardDiskCapacity,
                    String opirationSystem, String color) {
        this.stamp = stamp;
        this.model = model;
        RAM = ram;
        this.hardDiskCapacity = hardDiskCapacity;
        this.opirationSystem = opirationSystem;
        this.color = color;
    }

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getHardDiskCapacity() {
        return hardDiskCapacity;
    }

    public String getModel() {
        return model;
    }

    public String getOpirationSystem() {
        return opirationSystem;
    }

    public String getColor() {
        return color;
    }
}