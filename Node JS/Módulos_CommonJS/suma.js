function sumaSeparada(a,b) {
    return a+b
}

//Con esta línea puedo exportar la función sumaSeparada y que se pueda usar en otros archivos
module.exports = sumaSeparada


/*
Otra manera de exportar sería como si fuera un objeto: entonces al exportarlo se usa el nombre sumaSeparada y obligo a usar este nombre

module.exports ={

sumaSeparada: function sumaSeparada(a,b) {
    return a+b
}
}
*/