Mi programa es una calculadora de notas, donde le pide al usuario que introduzca una cantidad de asignaturas de entre 1 y 10, en caso de introducir un valor fuera de ese rango mostrará un mensaje de error
y nos pedirá que introduzcamos otra cantidad de asignaturas. Una vez el numero de asignaturas esta entre 1 y 10 le pedimos las notas al usuario, en el rango entre 0 y 10, de lo contrario al igual que con 
la cantidad de notas, mostrara un mensaje de error y pedirá que introduzcamos la nota de nuevo.
Cuando el usuario introduce todas las notas el programa lee el array de notas que ha rellenado el usuario y lo muestra por pantalla, después calcula y muestra la nota media, utilizando Arrays.stream().average().getAsDouble(),
y lo muestra por pantalla con un "printf()" para poder limitar a 2 los decimales de la nota media. También nos pide el numero de asignaturas suspensas, que las contamos con un Arrays.stream().filter(n -> n<5).count()
y las mostramos por pantalla con un "println". Finalmente nos pide mostrar un mensaje indicando si el usuario ha aprobado o no, con la condición de que la nota media debe ser mayor o igual que 5 y que solo puede tener 1 asignatura suspendida.

En cuanto a dificultad, es un programa muy parecido a lo que hemos estado viendo en clase últimamente, por lo que la estructura del programa la he tenido bastante clara desde el primer momento, y en cuanto a las funciones del programa creo
que son bastante sencillas, si tengo que destacar alguna dificultad o parte que mas me haya costado diría que buscar los métodos, ya que conocía el Arrays.stream, sabia del método average() y ya utilice el count() 
en otro ejercicio hace un tiempo investigando por mi cuenta, pero como aun no los usábamos en clase he tenido que revisar la API de Java y proyectos antiguos como utilizarlos correctamente para poder simplificar el código, ya que podría 
haber acumulado todas las notas en una variable y dividirlas entre la cantidad de notas para la media, y para los suspensos acumular en una variable cada vez que el usuario introduzca un numero menor que 5, pero creo que así queda un código mas limpio.
