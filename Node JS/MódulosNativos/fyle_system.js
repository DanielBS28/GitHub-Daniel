const fs = require('fs') //A partir de node 16 se recomienda poner node:modulo

//Node JS es monohilo y está basado en eventos, muchas cosas son sincronas.

//Modo Síncrono
const estadoArchivo = fs.statSync('./archivo.txt')

console.log(

	estadoArchivo.isFile(), //Si es un fichero
	estadoArchivo.isDirectory(), // Si es un directorio
	estadoArchivo.isSymbolicLink(), //Si es un enlace simbólico
	estadoArchivo.size,)//Tamaño en bytes


