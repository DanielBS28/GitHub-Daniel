//Para importar algo ponemos import llaves (con las variables, nombres que queramos)
//por que es para importar todas las  funciones ("como objeto") que están exportadas del archivo 
//y from "carpeta donde esta el archivo. MUY IMPORTANTE ESPECIFICAR BIEN LA RUTA YA SEA CON ./ ../ ETC"

//El orden de la importación da igual, ese saludar del principio es por el export default (ver constantes.js para entender esto)
import saludar, {PI, usuario, passwd, Saludo} from "./constantes.js"

//Funciones exportadas, las podía haber exportado arriba si hubiera querido pero era para tenerlas separadas
import {sumar, restar} from "./aritmética.js"

import { aritmetica } from "./aritmética.js"

/*
Aquí podía haber creado un alias por si aritmética es una palabra muy larga 
se pondría aritmeca as nombrealias, entonces cada vez que queramos usar aritmetica ahora será el nombre que queramos.

import { aritmetica as ar} from "./aritmética.js"
*/

console.log("Archivo modulos.js")
console.log(PI)
console.log(usuario)
console.log(passwd)

console.log(sumar(2,3))
console.log(aritmetica.dividir(10,2))

saludar()

const saludoHola = new Saludo();
