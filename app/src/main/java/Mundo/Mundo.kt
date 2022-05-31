package Mundo

fun paswords_iguales(contraseña_uno:String,contraseña_dos:String):Boolean{
    return contraseña_uno==contraseña_dos
}

class Usuario{
    var nombre = ""
    //CONSTRUCTOR PRIMARIO
    constructor()
    //CONSTRUCTOR SEGUNDARIO
    //SIEMPRE HAY QUE CREAR DOS CONSTRUCTUCTOR EN PARA UNA CLASE

    constructor(nombre: String){
        this.nombre=nombre
    }

    fun danombre()=nombre

}