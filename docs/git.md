## **¿Qué hacen los comandos de Git?**

### `git init`
Inicializa un repositorio Git **local** en la carpeta actual. Esto crea una carpeta oculta `.git/` donde Git guarda todos los cambios y configuraciones del proyecto.

---

### `git config --global user.name "Tu Nombre"`  
### `git config --global user.email "tucorreo@ejemplo.com"`
Estos comandos configuran tu identidad en Git, para que cada commit que hagas tenga tu nombre y correo (muy útil si trabajas en equipo o subes a GitHub).

---

### `.gitignore`

Este archivo le dice a Git **qué archivos o carpetas debe ignorar**. Por ejemplo:

- `/bin/` o `/target/`: carpetas generadas por compilación (no necesitas versionarlas).
- `.class`, `.log`, `.iml`: archivos temporales, de logs, o del IDE.

Evita subir cosas innecesarias que ensucien el repositorio o filtren cosas privadas (como claves o archivos enormes).

---

### 🔹 `git add .`

Agrega **todos los archivos del proyecto** al área de staging (preparados para hacer commit). Puedes hacer `git add archivo.java` si quieres hacerlo más selectivo.

---

### 🔹 `git commit -m "mensaje"`

Crea un **punto de guardado** con todos los archivos agregados. El `-m` te permite escribir un mensaje corto que explique qué hiciste.

---

### 🔹 `git remote add origin <URL>`

Le dices a tu Git local: “Aquí está mi repositorio en GitHub, lo llamaremos `origin`”.  
Esa URL es donde se subirá tu trabajo.

---

### 🔹 `git branch -M main`

Le cambias el nombre a tu rama actual (por defecto `master`) a `main`. GitHub usa `main` como estándar ahora.

---

### 🔹 `git push -u origin main`

Subes tu commit al repositorio de GitHub, y le dices que en adelante **sincronice esta rama `main`** con la que está en `origin`.

Buenas prácticas desde ya:
Cada día crea un commit nuevo.

Usa mensajes de commit claros y en presente:

"agrega clases de práctica para encapsulamiento"

"refactoriza clase Persona usando buenas prácticas"

Puedes crear ramas si haces pruebas avanzadas más adelante (git checkout -b feature-x).