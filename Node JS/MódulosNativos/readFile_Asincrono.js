const fs = require('fs')

/*
Podemos convertir el require fs (que no es de promesas) a promesas de la siguiente manera, esto es solo en los modulos nativos queno tienen promesas nativas:

const { promisify } = require('util') //node:util

const readFilePromise = promisify(fs.readFile)

readFilePromise('./archivo.txt', 'utf-8').then(text => {
console.log(text)})
*/

/*Esto es de manera asíncrona, es decir se pueden ir ejecutando otras cosas mientras que por ejemplo se lee el archivo, pero hay un pequeño probñema y es que no sabemos cuando ha terminado de leer un archivo para ejecutar una función, pero para ello existen los callbacks que nos solucionan este problema*/

console.log("Leyendo el primer archivo...")
//Con readFile podemos poner un tercer parámetro que es un callback y eso significa que cuando se acceda a un archivo luego se esté leyendo se puedan ejecutar otras cosas pero que cuando haya terminado se ejecute el callback
const text = fs.readFile('./archivo.txt', 'utf-8', (err, text)=>{

	console.log(text) // Imprimimos el contenido del archivo por la consola 
})

console.log("Hacer cosas mientras se leen los archivos...")

console.log("Leyendo el segundo archivo...")
const text2 = fs.readFile('./archivo2.txt', 'utf-8', (err, text2)=>{

	console.log(text2) // Imprimimos el contenido del archivo por la consola 
})





