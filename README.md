 EJERCICIO Desarrollo Colaborativo con Refactoring
FASE PREPARATORIA
Crear un repositorio en vuestro GitHub llamado refactoring, cada alumno elegirá 5 ejercicios
de Java que modificará para incluir código a refactorizar (se valorará la calidad/ complejidad
del código a refactorizar, evitar poner sólo nombres incorrectos de variables,...).
Muy importante documentar lo que hace cada ejercicio en vuestro README para que los
compañeros tengan información sobre el código de cada ejercicio y lo entiendan mejor.
Una vez preparados los 5 ejercicios subirlos a vuestro repositorio remoto refactoring.
FASE COLABORACIÓN
Consulta los repositorios de distintos compañeros (al menos 5), haz un fork de aquellos en
los que quieras colaborar y trabajar sobre ellos siguiendo los pasos del desarrollo
colaborativo:
● Haz un fork del repositorio en el que se quiere contribuir.
● Clona ese repositorio en local.
● Realiza los cambios o añadidos pertinentes en el código. Recuerda modificar el
README con las MEJORAS aportadas.
● Actualiza tu repositorio remoto.
● Haz un pull request, es decir, solicita permiso al dueño del repositorio original para
que incorpore tus cambios.
Cuando eres tú el dueño del repositorio original tienes que revisar los cambios que ha
hecho el compañero y, si lo crees oportuno, aceptarás el pull request para que las
modificaciones sean efectivas.
NOTA: Documentar y entregar todas las acciones realizadas con las correspondientes
capturas de pantalla.
Cambios de la variable n de nombre a num
Cambio en el metodo MEDAINEGATIVO  a nombre mediaNegativo

*Comentario de Juanma*

Cambios realizados:

1-Cálculos fuera del bucle principal: Los métodos de suma, resta, multiplicación y división ahora se ejecutan solo una vez, después de que todos los números hayan sido ingresados.

2-Uso de foreach en los métodos: Reemplacé el bucle for por un bucle foreach en sumaNumeros() y multiplicacionNumeros() para mejorar la legibilidad.

3-Inicialización y errores en multiplicación y división: Los cálculos de multiplicación y división se inicializan correctamente y se maneja el error de división/multiplicación por cero solo una vez.

4-Refactorización de los bucles: Los bucles de resta y multiplicación empiezan en el índice 1 para evitar usar el primer valor varias veces.

