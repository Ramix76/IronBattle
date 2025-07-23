# 🛡️ IronBattle - RPG Battle Simulator

**IronBattle** es un simulador simple de combate RPG en consola que enfrenta a dos personajes, **Warrior** o **Wizard**, cada uno con atributos y habilidades únicas. El programa permite crear personajes, mostrar sus estadísticas iniciales y simular una batalla por turnos entre ellos.

---

## 🧩 Funcionalidades

### ✅ Creación de Personajes

- Los usuarios pueden crear dos personajes con nombre personalizado.
- Cada personaje puede ser **Warrior** o **Wizard**.
- La selección de clase se realiza mediante pulsar `1` para Warrior y `2` para Wizard, con **validación de entrada**.
- Los personajes se inicializan con **atributos aleatorios**:
  - **Wizard**: HP (50–100), Mana (10–50), Intelligence (1–50)
  - **Warrior**: HP (100–200), Stamina (10–50), Strength (1–10)

### 📊 Estadísticas y Tipos

- Cada personaje tiene un método `getStats()` que devuelve una cadena con sus atributos actuales.
- Los personajes tienen un **identificador único (UUID)** para seguimiento interno.

### ⚔️ Sistema de Combate

- Los personajes se enfrentan en **rondas alternadas** donde ambos atacan en cada turno.
- Cada clase tiene un **ataque específico**:

#### 🧙 Wizard:

- Puede lanzar un **Fireball** (requiere al menos 5 de mana), que causa daño según su inteligencia.
- Si no tiene suficiente mana, ataca con el **Staff** (2 puntos de daño) y **regenera 1 de mana**.
- Si no tiene nada de mana, simplemente **recupera 2 de mana**.

#### 🛡 Warrior:

- Puede realizar un **ataque pesado** (requiere al menos 5 de stamina), causando daño basado en su fuerza.
- Si no tiene suficiente stamina, realiza un **ataque débil** (mitad de fuerza) y **regenera 1 de stamina**.
- Si no tiene stamina, simplemente **recupera 2 de stamina**.

### ⏸️ Interacción y Pausa

- Al final de cada ronda, el programa solicita al usuario pulsar ENTER para continuar, pausando la batalla para observar su progreso paso a paso.

### 🏁 Finalización de la Batalla

- La batalla termina cuando **uno o ambos personajes mueren** (HP <= 0).
- Se muestra el **ganador**, o si hay **empate**.
- En caso de empate, la batalla se **reinicia automáticamente**.

---

## 🆕 Funcionalidades Extra (Bonus)

### 📁 Importación de Personajes desde CSV

- Se pueden importar personajes desde un archivo `characters.csv` localizado en la ruta del proyecto.
- El archivo debe tener el formato:
  name,type,hp,stamina/mana,strength/intelligence
  Gandalf,Wizard,80,40,45
  Conan,Warrior,150,30,9
- El sistema ignora líneas inválidas y comentarios (líneas que comienzan con `#`).
- Si hay **menos de dos personajes válidos**, se muestra un mensaje de error.

### 🔄 Generación Automática de Personajes y Combate

- Se puede elegir una opción para **generar dos personajes aleatorios automáticamente** (Wizard o Warrior).
- Sus atributos también se asignan aleatoriamente.
- Inmediatamente después, se inicia el combate sin necesidad de ingresar nombres o clases.

### 🔁 Repetir Combate o Salir

- Al finalizar un combate, se pregunta al usuario:  
  `Do you want to return to the main menu? (y/n):`
- Solo se aceptan entradas válidas (`y` o `n`).
- En caso de responder `y`, se vuelve al menú principal.
- En caso de `n`, el programa se cierra elegantemente.

---

## 🚀 Cómo usar

1. Clona o descarga este repositorio con los archivos fuente Java (`Character`, `Wizard`, `Warrior`, `BattleSimulator`, `CharacterImporter`, `Main`, etc.).
2. Asegúrate de tener un archivo `characters.csv` válido si deseas usar la importación desde CSV.
3. Compila y ejecuta `Main.java` desde tu IDE (como IntelliJ) o línea de comandos.
4. ¡Disfruta de tus batallas RPG!

---
