package entities;

public class Employe {
    private int id;
    private String nom;
    private String prenom;
    private String nom_dep;
    private int grade;

    public Employe(int id, String nom, String prenom, String nom_dep, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nom_dep = nom_dep;
        this.grade = grade;
    }

    public Employe(){
        id=0;
        nom="";
        prenom="";
        nom_dep="";
        grade=0;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom_dep() {
        return nom_dep;
    }

    public int getGrade() {
        return grade;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom_dep(String nom_dep) {
        this.nom_dep = nom_dep;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o){

        if(o==null)
            return false;
        if(this==o)
            return true;
        if(o instanceof Employe employe ){
            return employe.id==this.id && employe.nom.equals(this.nom) && employe.prenom.equals(this.prenom);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employé: id: " +id + "nom: " +nom + "prenom: " +prenom + "nom_dep: " +nom_dep + "grade: " +grade;
    }


}
