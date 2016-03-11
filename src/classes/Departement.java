package classes;

//Yes we can

public class Departement {
    private int noDept;
    private String nomDept;
    private Lieu lieu;
    
    //Constructeur
    public Departement(int noDept, String nomDept, Lieu lieu){
        this.noDept = noDept;
        this.nomDept = nomDept;
        this.lieu = lieu;
    }
    
    public Departement(int noDept){
        this.noDept = noDept;
    }
    
    public int getNo(){return this.noDept;}
    public String getNom(){return this.nomDept;}
    public Lieu getLieu(){return this.lieu;}
    
    public boolean equals(Object o){
        if (!(o instanceof Departement)) {
            return false;
        }
        if (this.getNo() == ((Departement)o).getNo()) {
            return true;
        }
        return false;        
    }
    
    public String toString(){
        return this.nomDept;
    }
}
