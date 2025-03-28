const fs = require('fs/promises') //Añado promises

//Esto devolvería un buffer de bytes, pero para que lo podamos leer añadimos un segundo parámetro 'utf-8' para que podamos interpretarlo como humanos.

/*Esto es de manera asíncrona, es decir se pueden ir ejecutando otras cosas mientras que por ejemplo se lee el archivo, pero hay un pequeño probñema y es que no sabemos cuando ha terminado de leer un archivo para ejecutar una función, pero para ello existen también las promesas en vez de usar callbacks*/

console.log("Leyendo el primer archivo...")
//Con readFile podemos leer archivos se manera asíncrona eso significa que cuando se acceda a un archivo luego se esté leyendo se puedan ejecutar otras cosas y cuando termine se ejecuta la promesa
const text = fs.readFile('./archivo.txt', 'utf-8').then(text =>{

	console.log(text)
})

console.log("Hacer cosas mientras se leen los archivos...")

console.log("Leyendo el segundo archivo...")
const text2 = fs.readFile('./archivo2.txt', 'utf-8').then(text2 =>{

	console.log(text2)
})

