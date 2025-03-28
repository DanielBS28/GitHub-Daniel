const fs = require('fs')

//Esto devolvería un buffer de bytes, pero para que lo podamos leer añadimos un segundo parámetro 'utf-8' para que podamos interpretarlo como humanos.

/*Esto es de manera síncrona, es decir va de manera lineal el programa hacia abajo y no se puede ejecutar otras cosas del programa hasta que no finalice lo que se está ejecutando en ese momento*/

console.log("Leyendo el primer archivo...")
const text = fs.readFileSync('./archivo.txt', 'utf-8')

console.log(text) // Imprimimos el contenido del archivo por la consola 

console.log("No puedo hacer otras cosas hasta que se termine de leer el archivo1")

console.log("Leyendo el segundo archivo...")
const text2 = fs.readFileSync('./archivo2.txt', 'utf-8')

console.log(text2)

