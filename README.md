# IronBattle - RPG Battle Simulator

IronBattle es un simulador simple de combate RPG en consola que enfrenta a dos personajes, **Warrior** o **Wizard**, cada uno con atributos y habilidades únicas. El programa permite crear personajes, mostrar sus estadísticas iniciales y simular una batalla por turnos entre ellos.

---

## Funcionalidades

### Creación de Personajes
- Los usuarios pueden crear dos personajes con nombre personalizado.
- Cada personaje puede ser **Warrior** o **Wizard**.
- La selección de clase se realiza mediante pulsar `1` para Warrior y `2` para Wizard, con validación de entrada.
- Los personajes se inicializan con atributos aleatorios:
    - **Wizard:** `HP` (50-100), `Mana` (10-50), `Intelligence` (1-50)
    - **Warrior:** `HP` (100-200), `Stamina` (10-50), `Strength` (1-10)

### Estadísticas y Tipos
- Cada personaje tiene un método `getStats()` que devuelve una cadena con sus atributos actuales.
- Los personajes tienen un identificador único (UUID) para seguimiento.

### Sistema de Combate
- Los personajes se enfrentan en rondas alternadas donde ambos atacan en cada turno.
- Cada clase tiene un ataque específico:
    - **Wizard:**
        - Puede lanzar un *Fireball* (requiere al menos 5 de mana) que causa daño basado en la inteligencia.
        - Si no, ataca con el *Staff* por 2 puntos de daño y regenera 1 de mana.
        - Si no tiene mana, recupera 2 puntos de mana.
    - **Warrior:**
        - Puede hacer un ataque pesado (requiere al menos 5 de stamina) que causa daño basado en fuerza.
        - Si no, realiza un ataque débil que causa la mitad de fuerza y regenera 1 de stamina.
        - Si no tiene stamina, recupera 2 puntos de stamina.

### Interacción y Pausa
- Al final de cada ronda, la consola pide al usuario pulsar ENTER para continuar, pausando el combate y permitiendo seguir el desarrollo paso a paso.

### Finalización de la Batalla
- La batalla termina cuando uno o ambos personajes mueren (HP <= 0).
- Se muestra el ganador o si hay empate.
- En caso de empate, la batalla se reinicia automáticamente.

---

## Cómo usar

1. **Clonar o descargar el repositorio** con los archivos fuente Java (`Character`, `Wizard`, `Warrior`, `BattleSimulator`, `Main`, etc.).