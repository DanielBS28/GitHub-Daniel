const {readFile} = require('fs/promises');  //Añado promises, importante el punto y coma aquí


//Con readFile podemos leer archivos se manera asíncrona eso significa que cuando se acceda a un archivo luego se esté leyendo se puedan ejecutar otras cosas y cuando termine se ejecuta la promesa

/* Esto se llama IIFE - Inmediatly invoked function expression

( () =>{}

)()

*/


( async () =>{
	console.log("Leyendo el primer archivo...")
	const text = await readFile('./archivo.txt', 'utf-8')
	console.log(text)
	
	console.log("Hacer cosas mientras se lee el archivo...")
	
	console.log("Leyendo el segundo archivo...")
	const text2 = await readFile('./archivo2.txt', 'utf-8')
	console.log(text2)
	
})()
