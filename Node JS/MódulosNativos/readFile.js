const fs = require('fs')

//Esto devolvería un buffer de bytes, pero para que lo podamos leer añadimos un segundo parámetro 'utf-8' para que podamos interpretarlo como humanos.

const text = fs.readFileSync('./archivo.txt', 'utf-8')

console.log(text) // Imprimimos el contenido del archivo por la consola 



