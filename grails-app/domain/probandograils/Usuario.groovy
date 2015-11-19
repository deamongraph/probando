package probandograils

class Usuario {
    long idUsuario
    String nombre
    String password


    static constraints = {
        nombre size: 1..15,nullable: false,blank:false
    }
}
