package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {

    private ArrayList<Employe> employees;

    public SocieteArrayList() {
        employees = new ArrayList<>();
    }

    @Override
    public void ajouterEmploye(Employe employe) {
        if(employe!=null) {
            employees.add(employe);
        }
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for(Employe employee : employees) {
            if(employee.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe employe){
        if(employees.contains(employe)) {
            return true;
        }
        return false;
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employees.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for(Employe employee : employees) {
            System.out.println(employee);
        }
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employees, Comparator.comparing(Employe::getId));
        System.out.println("tri par ID:");
        displayEmploye();
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employees, Comparator
                .comparing(Employe::getNom_dep)
                .thenComparing(Employe::getGrade));
        System.out.println("Employés triés par dep puis grade :");
        displayEmploye();
}
}
