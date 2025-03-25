//Node JS es un entorno de ejecución de JavaScript

console.log("Hola mundo")


//globalThis es una variable global en toda nuestra aplicación, podemos acceder a ella desde donde queramos

console.log(globalThis) //En el navegador globalThis apunta el objeto windows, mientras que en node apunta a global

//Puedo ejecutar código JavaScript

function suma (a,b){
    return a+b
}

console.log(suma(1,2))

//Con esta línea importo el modulo suma.js para usar la función que está allí. (Esto se llama Common JS y está un poco obsoleto)

//Podríamos haber puesto el nombre que quisieramos
const sumaSeparada = require('./suma')

console.log(sumaSeparada(3,5))

/*
Si lo hubieramos importado de la manera que el nombre tiene que ser igual que el de la función tendría que haberlo echo así:

const { sum } = require('./suma')
*/