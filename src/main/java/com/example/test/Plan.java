package com.example.test;

public class Plan {
    // Coefficients de l'équation du plan ax + by + cz + d = 0
    private double a;
    private double b;
    private double c;
    private double d;

    // Constructeur
    public Plan(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    // Méthode pour vérifier si un point (x, y, z) est sur le plan
    public boolean estSurPlan(double x, double y, double z) {
        double resultat = a * x + b * y + c * z + d;
        return resultat == 0;
    }

    // Méthodes getters et setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    // Méthode toString pour afficher l'équation du plan
    @Override
    public String toString() {
        return a + "x + " + b + "y + " + c + "z + " + d + " = 0";
    }
}
