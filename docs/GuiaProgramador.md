# Guia Para Progamadores
![Paquetacion](/docs/images/package.png) Para poder entender este proyecto primero debemos saber como esta distribuida la paquetacion del mismo.

## Carpeta Docs
En esta carpeta se almacenara toda la documentacion necesaria para el entendimiento del proyecto por una entidad externa. Habran documentaciones como:
- Guia para Progamadores
- Raiz del proyecto

## Carpeta Source(src)
Aqui se guardara todo, distribuido en net, doulingo que sera la empresa, y sus diferentes ramas, tales como el storage, donde se almacenaran datos, utility, donde estaran clases de utilidad como el menu. y fuera de todo esta nuestra app, donde se ejecutaran los metodos mediante un objeto.

## Clase Menu
Esta sera una clase de utilidad que contendra dentro de si misma un metodo estatico que desplegara el menu al ser llamado invocado mediante su propia clase.
![menu](/docs/images/showMenu.png)

## Clase DictionaryClass
Aqui se guardaran todos los metodos que interactuaran con el menu y el usuario. tambien tendra un atributo que sera un Map quien recibira una clave tipo String y un valor Tipo Set, de esta manera filtrara la llave por una letra y su valor seran las palabras almacenadas que inicien por esta misma clave.

![alt text](/docs/images/atributeDic.png)

### Metodo addWord

![alt text](/docs/images/addWord.png)

Este metodo pedira una palabra la cual sera limpiada de espacios y pasada a minuscula para evitar problemas de comparacion a futuro. Luego mediante el metodo subString tomaremos la primera letra de esta palabra, luego mediante un if, veremos si esta letra ya es una llave en nuestro mapa, de no ser asi sera añadida como llave la primera letra, y la palabra agregada al set que tiene por valor, y de conteneder ya una llave con la primera letra de la palabra, añadira la palabra al set correspondiend mediante el filtro de clave.

### Metodo removeWord

![alt text](/docs/images/removeWord.png)

Tambien pedira una palabra que sera limpiada y pasada a minuscula, luego tomaremos su primera letra  y crearemos un set con los valores del map que tengan la primera letra pedida. luego con el if verificaremos si no es nula, de no serlo eliminaremos la palabra del set directamente, y de ser nula notificaremos que no ha sido encontrada la palabra

### Metodo wordChecker

![alt text](/docs/images/wordChecker.png)

Pedira una palabra al usuario, luego esta palabra la limpiara, para mosteriormente mediante el set creado con el map si la palabra pertenece al set, y no hay espacio nulo, entonces retornara un true, con este metodo en la app mediante un if alertamos al usuario mediante la interfaz que la palabra existe.

### Metodo ValuesKey

![alt text](/docs/images/valuesKeys.png)

Mostrara todas las llaves del map almacenadas mediante el metodo keySet() lo pondremos dentro del JOptionPane para que se imprima por interface

### Metodo showWordsForKey

![alt text](/docs/images/showWoFK.png)

pediremos una palabra al usuario donde sera limpiada y luego tomada su inicial para filtrar por clave, luego creamos un set con la clave usando el metodo get para el map dictionary y mediante el StringBuilder si no es nulo, imprimimos las palabras que empiezan por la letra clave/key con ayuda de un for each para el recorrido del set, y un else por si no hay ninguna llave que almacene palabras.

### Override toString

![alt text](/docs/images/toString.png)

Lo usamos para recorrer el mapa y poder imprimir el mapa, aunque es perfectamente posible sin este, se ha puesto por buena praxis.

## Clase App

![alt text](/docs/images/app1.png)

En esta clase instanciaremos un objeto tipo DictionaryClass para acceder a los metodos creados antes, creamos un booleano que sera verdadero al menos que se le especifique lo contrario, y un while que mantendra su bucle mientras el booleano sea true, dentro del while el switch para el bucle del menu, y la opcion del usuario cada vez que itere. en el caso uno usamos un try catch apra las excepciones de null y Fuera de los limtes del String. y llamamos nuestro metodo respecto a la opcion menu/caso

![alt text](/docs/images/appCase3.png)

El caso 2 y 3 es exactamente lo mismo con try catch y llamada a los metodos. Nuestro caso 4 llamara unicamente al metodo sin un try catch dado que solo es una impresion no lanzara ninguna excepcion, nuestro caso 3 llama un metodo que solo devolvera un true, false, asi que mediante un if else imprimimos la informacion al usuario.

![alt text](/docs/images/appLast.png)

El caso 5 nuevamente usara un try catch para evitar nulos y fuera del limite de String llamando el metodo respectivo en su try, mientras que el 6 volvera la variable false y asi termianara la ejecucion del codigo.

[volver](/README.md)

## Gracias por interesarse en nuestro programa.