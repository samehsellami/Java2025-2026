package entities;


public class Departement {

    private int id;
    private String nomDep;
    private int nbEmp;

    public Departement(int id, String nomDep, int nbEmp) {
        this.id = id;
        this.nomDep = nomDep;
        this.nbEmp = nbEmp;
    }

    public Departement(){
        this.id = 0;
        this.nomDep = "";
        this.nbEmp = 0;
    }

    //getters

    public int getId() {
        return id;
    }

    public String getNomDep() {
        return nomDep;
    }

    public int getNbEmp() {
        return nbEmp;
    }

    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }

    public void setNbEmp(int nbEmp) {
        this.nbEmp = nbEmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if(null == o)
            return false;

        if(o instanceof Departement dep){
            return this.id == dep.id &&  this.nomDep.equals(dep.nomDep);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Departement: ID = " + id + ", nomDep = " + nomDep + ", nbEmp = " + nbEmp;
}

}

