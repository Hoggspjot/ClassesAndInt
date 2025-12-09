package december.day041225.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Material material = new Material("steel", 7850);
        Thing steelWire = new Thing("wire", material, 0.03);

        steelWire.show();

        try (Scanner scanner = new Scanner(System.in)) {
            steelWire.setVolume(scanner.nextDouble());
            Material copper = new Material("copper", 8500);

            steelWire.setMaterial(copper);

            steelWire.show();
        }

    }
}


class Material {
    private String name;
    private double plot;

    public Material(String name, double plot) {
        this.name = name;
        this.plot = plot;
    }

    public String getName() {
        return name;
    }

    public double getPlot() {
        return plot;
    }
}

class Thing {
    private String name;
    private Material material;
    private double volume;

    public Thing() {
    }

    public Thing(String name, Material material, double volume) {
        this.name = name;
        this.material = material;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMass() {
        return material.getPlot() * volume;
    }

    public void show() {
        System.out.printf("%s;%s;%.0f;%.2f;%.1f\n",getName(),material.getName(),material.getPlot(),volume,getMass());
    }
}
