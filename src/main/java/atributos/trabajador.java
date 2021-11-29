package atributos;

public class trabajador extends persona {
    public String isapre;
    public String AFP;

    public trabajador(String nombre, String apellido, int rut, String isapre, String AFP){
        super(nombre, apellido, rut);
        this.isapre= isapre;
        this.AFP= AFP;
    }

    public void setIsapre(String isapre) {
        this.isapre = isapre;
    }

    public void setAFP(String AFP) {
        this.AFP = AFP;
    }

    public String getIsapre() {
        return isapre;
    }

    public String getAFP() {
        return AFP;
    }

    public String toString(){
        return nombre+";"+ apellido+";"+isapre+";"+AFP;
    }


}
