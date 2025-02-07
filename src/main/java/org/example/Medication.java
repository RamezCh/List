package org.example;

import java.util.Objects;

public class Medication {
    private String name;
    private double price;
    private boolean isAvailable;

    public Medication(String name, double price, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Medication that = (Medication) o;
        return Double.compare(price, that.price) == 0 && isAvailable == that.isAvailable && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, isAvailable);
    }

    @Override
    public String toString() {
        return String.format(" Medication { name = '%s', price = %.2f, available = %s }\n", name, price, isAvailable ? "Yes" : "No");
    }
}
