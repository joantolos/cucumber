package com.joantolos.cucumber;

/**
 *
 * Created by jtolos on 23/02/2015.
 */
public class Molecule {
    private int molecularWeight;

    public Molecule(int molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    public String getMoleculeSize(int jumpingRepetitions) {
        if (molecularWeight > 10000 && jumpingRepetitions < 10) {
            return "be a big molecule";
        } else {
            return "be a tiny molecule";
        }
    }
}
