# Semana 1 - Día 1: Fundamentos de POO

## 📘 Conceptos clave y notas recopiladas

### 🔹 `super` vs `this`
- `super`: Accede a la **clase padre** (superclase). Útil para llamar al constructor o métodos de la clase padre.
- `this`: Se refiere al **objeto actual**. Útil para referirse a atributos o métodos dentro de la misma clase.

### 🔹 @Override
Usar `@Override` es una buena práctica para asegurarte de que **estás sobrescribiendo correctamente** un método de una clase padre o interfaz. El compilador lanzará un error si no existe el método original.

### 🔹 Modificadores de acceso
- `private`: Accesible **solo dentro de la clase** donde se declara.
- `protected`: Accesible dentro del **mismo paquete** y por **subclases**.
- `public`: Accesible **desde cualquier parte**.

---

### 🔹 Diferencia entre `==` y `.equals()`
- `==`: Compara **referencias** (si apuntan al mismo objeto en memoria).
- `.equals()`: Compara el **contenido** del objeto, si así está implementado.

---

### 🔹 Interfaz (`interface`)
Una interfaz define un **contrato** que una clase debe cumplir. No tiene implementación (excepto métodos `default` desde Java 8).

- Define **qué hacer**, no **cómo hacerlo**.
- Cada clase que implementa una interfaz debe definir el **comportamiento** (los métodos).

```java
public interface Mascota {
    void jugar();
}
```

### 🔹 ¿Cuándo usar interfaz vs clase abstracta?
| Característica               | Interfaz                                            	| Clase abstracta                             
|------------------------------|--------------------------------------------------------|-----------------|
| ¿Puede tener implementación? | Desde Java 8, sí (`default`), pero no es lo común	| Sí                                            |		
| ¿Puede tener atributos?      | Solo constantes (`public static final`)          | Sí, incluso privados                         |
| ¿Cuándo usar?                | Cuando necesitas solo el contrato, sin lógica      	| Cuando necesitas lógica
																							común y especialización

---

### 🔹 ¿Por qué usamos casteo en `((Mascota) animal).jugar();`?
Porque:
- La lista es de tipo `Animal`, que **no tiene** el método `jugar()`.
- Pero el **objeto real** es un `Perro` o `Gato`, que **implementa** `Mascota`.
- Necesitamos decirle al compilador que confíe en nosotros: "este `Animal` **también** es una `Mascota`."

```java
if (animal instanceof Mascota) {
    ((Mascota) animal).jugar();
}
```

---

### 🔹 ¿Qué hace `instanceof`?
Es un operador que **verifica si un objeto es instancia** de una clase o **implementa** una interfaz.

#### Ejemplos:
```java
Perro p = new Perro("Toby", 5);
System.out.println(p instanceof Animal); // true
System.out.println(p instanceof Mascota); // true
System.out.println(p instanceof Gato);    // false
```

---

## 🎯 Pilares de la POO aplicados

### **1. Abstracción**
> Enfocarse en lo importante, ocultando detalles innecesarios.

**¿Dónde se vio?**
- La clase `Animal` es una representación **genérica**.
- No importa el tipo específico (perro o gato), solo que tiene un nombre, edad y hace un sonido.

#### 💡 Extra: Clase abstracta
```java
public abstract class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void hacerSonido();
}
```
Con esto:
- No puedes instanciar `Animal` directamente.
- Obligas a las subclases a definir su comportamiento.

---

### **2. Herencia**
> Permite que una clase hija herede atributos y comportamientos de una clase padre.

- `Perro` y `Gato` extienden de `Animal`, reutilizando el código común.

---

### **3. Polimorfismo**
> Un mismo método se comporta de diferentes formas según el tipo de objeto.

- `hacerSonido()` se comporta diferente en `Perro` y `Gato`.
- En una lista de tipo `Animal`, puedes recorrer todos los elementos y ejecutar el comportamiento específico.

```java
ArrayList<Animal> animales = new ArrayList<>();
animales.add(new Perro("Toby", 3));
animales.add(new Gato("Michi", 2));

for (Animal animal : animales) {
    animal.hacerSonido(); // polimorfismo en acción
}
```

---

### **4. Encapsulamiento**
> Ocultar los datos internos de un objeto y exponer solo lo necesario mediante métodos públicos.

- Atributos `private` y `protected`.
- Acceso controlado mediante getters y setters.

```java
public class Animal {
    private String nombre;
    // getter y setter
}
```

---
