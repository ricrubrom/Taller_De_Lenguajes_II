package unlp.info.comparacionstring;
public class StringDemo {
    public static void main(String[] args) {
        String str1="Leones y Tigres y Osos!";
        String str2="Leones y Tigres y Osos!";
        String str3=str2;
        String str4=new String("Leones y Tigres y Osos!");
        String str5=" Y yo!";
        String str6="Leones y Tigres y Osos! Y yo!";
        String str7= str1 + str5;
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1==str4);
        System.out.println(str2==str3);
        System.out.println(str2==str4);
        System.out.println(str3==str4);
        System.out.println(str6==str7);
        System.out.println(str1.equals(str4));
        System.out.println(str6.equals(str7));
    }
}



/*
* b)¿Qué hace el método equals de la clase String?
*   El método equals de la clase String compara el contenido de dos cadenas de caracteres.
*
* c)Suponga que cuenta con una clase Persona que modela a las personas del mundo real.
*        i. ¿Considera que sería interesante hacer un “override” (sobreescritura) del método
*            equals? Si la respuesta es afirmativa, indique el criterio de comparación, caso
*            contrario JUSTIFIQUE.
*               Sí, ya que el método equals de la clase Object compara las referencias de los objetos y no el contenido.
*
*        ii. En caso de no sobreescribir el método equals, ¿cuál es el criterio por default en
*            Java para comparar dos (2) personas?
*               El criterio por default en Java para comparar dos personas es comparar las referencias de los objetos.
*
*
*
* */
