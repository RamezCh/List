package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Pharmacy {
    private Map<String, Medication> medications = new HashMap<String, Medication>();

    public Pharmacy(){}

    public void addMedication(Medication medication) {
        medications.put(medication.getName().toLowerCase(), medication);
    }

    public Medication find(String medicationName) {
        return medications.get(medicationName.toLowerCase());
    }

    public void delete(String medicationName) {
        medications.remove(medicationName.toLowerCase());
    }

    public int getCount() {
        return medications.size();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return Objects.equals(medications, pharmacy.medications);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(medications);
    }

    @Override
    public String toString() {
        return "Pharmacy {\n" +
                "medications = " + medications + "\n}";
    }
}
