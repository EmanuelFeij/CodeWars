
class Name(val firstName: String,val lastName: String){ 
    override fun toString(): String { 
        return """(${lastName.toUpperCase()}, ${firstName.toUpperCase()})"""
    } 
}

fun meeting(s: String): String {

    return s.split(";").map{ Name( it.split(":")[0].toLowerCase() , it.split(":")[1].toLowerCase() ) }
                       .sortedWith(compareBy(Name::lastName).thenBy(Name::firstName))
                       .joinToString(separator="")
   
}