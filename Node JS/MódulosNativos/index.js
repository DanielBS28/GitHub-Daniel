//Los módulos nativos permiten recolectar información de diferentes sitios, archivos, ficheros, web, sistema operativo...

//El módulo os es del sistema operativo
const os = require('node:os') //podría haber puesto solo os

console.log("Información del sistema operativo", os.platform())
console.log("Versión del sistema operativo", os.release())
console.log("Arquitectura", os.arch())
console.log("CPU's", os.cpus())

