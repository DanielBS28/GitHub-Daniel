//Para que se pueda usar esto en otros archivos js hay que poner export delante
export const PI = Math.PI

//Si no se exportan da error
export let usuario = "Daniel"
export let passwd = "qwerty"

//Esto es para que cuando se exporte, lo haga de manera autómática si se llama esta función en otro archivo
export default function saludar(){
console.log("Hola módulos EC6")

}

/*
No puedo hacer un export default a un const o let o función expresada debido al hoisting ya que son expresiones y no saben que valor van a almacenar "por el momento", en las declaras el hosting se hacia de forma automática

Aunque esto se puede resolver si hacemos esto ya que ahora si se sabe 
que valor tiene usuario (ponemosel export default debajo de la declaración)

let usuario = "Daniel"
export default usuario;

Esto no pasaba con el export normal por que en el import esas variables no se usan hasta que se llaman, y el llamado está mas abajo del import

las unicas veces que se puede hacer el export default de la manera que está al principio es con las funciones declaradas y las clases

*/

/*
Solamente podemos tener una exportación default ya que si no daría error

export default function saludar2(){
    console.log("Hola módulos EC6")
    
    }
*/

//Exportación de clase
export class Saludo {

    constructor(){
        console.log("Hola Clases EC6")
    }
    }



