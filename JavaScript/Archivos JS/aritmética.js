export function sumar(a,b) {
    return a +b
}

export function restar(a,b) {
    return a -b
}

function multiplicar(a,b) {
    return a *b
}

function dividir(a,b) {
    return a /b
}

//De esta forma voy a exportar dos funciones como un objeto junto para que no tenga que exportar una a una las funciones, podia haber puesto las otras pero es para tenerlas también como ejemplo
export const aritmetica = {

   // multiplicar:multiplicar esto es la forma larga, pero con literales se puede simplificar así:
    multiplicar,
    dividir

}