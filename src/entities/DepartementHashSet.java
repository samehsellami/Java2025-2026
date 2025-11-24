package entities;

import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement>{

    private HashSet<Departement> departements;

    public  DepartementHashSet(){
        this.departements=new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement dep) {
        departements.add(dep);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement dep : departements) {
            if(dep.getNomDep().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement dep) {
        return departements.contains(dep);
    }

    @Override
    public void supprimerDepartement(Departement dep) {
        departements.remove(dep);
    }

    @Override
    public void displayDepartement() {
        for(Departement dep : departements) {
            System.out.println(dep);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sorted= new TreeSet<>(
                (d1,d2) -> Integer.compare(d1.getId(), d2.getId()));

        sorted.addAll(departements);
        return sorted;
    }
}
