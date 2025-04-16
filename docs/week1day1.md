super vs this:
super → Accede a la clase padre.
this → Accede al propio objeto actual.

@Override:
Es buena práctica ponerla para asegurarte de que estás sobrescribiendo correctamente.

Control de acceso:
private: sólo dentro de la clase.
protected: accesible desde subclases.
public: accesible desde cualquier parte.

Diferencia == vs .equals():
== compara referencias (si apuntan al mismo objeto).
.equals() compara contenido (si el contenido es igual).

Interface:
An interface defines a contract, there is not implementation.
You can defines "what to do" but not "how to do it".
But each class implementing this interface, must define "how to do it" which means the methods behavior.
The IDE is not asking for a behavior in the method, because it is an interface.

¿Cuándo usar interfaz vs clase abstracta?
Característica					Interfaz												Clase abstracta
¿Puede tener implementación?	Desde Java 8, sí (default), pero lo normal es que no	Sí
¿Puede tener atributos?			Solo constantes (public static final)					Sí (incluso privados)
¿Usar cuando…?					Necesites solo el contrato sin lógica					Necesites lógica compartida entre subclases

¿Por qué se usó casteo en ((Mascota) animal).jugar();?
Porque:

La lista es de Animal, y Animal no tiene el método jugar().
Pero sabemos que el objeto concreto sí es un Perro o Gato, que implementa Mascota.
Entonces, el compilador necesita que le digas explícitamente: “confía en mí, este Animal también es una Mascota”. Ahí entra el casteo.
if (animal instanceof Mascota) {
    ((Mascota) animal).jugar();
}

¿Qué hace instanceof?
Es un operador que verifica si un objeto es instancia de una clase o implementa una interfaz.

Ejemplos:

Perro p = new Perro("Toby", 5);
System.out.println(p instanceof Animal); // true
System.out.println(p instanceof Mascota); // true
System.out.println(p instanceof Gato); // false
	
