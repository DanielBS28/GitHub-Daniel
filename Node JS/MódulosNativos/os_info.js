//Los módulos nativos permiten recolectar información de diferentes sitios, archivos, ficheros, web, sistema operativo...

//El módulo os es del sistema operativo
const os = require('os') //podría haber puesto 'node:os'
//Podría también haber puesto como si fuera EC6 Modules -> import os from 'os' tendría que usar extensión .mjs


console.log("Información del sistema operativo", os.platform())
console.log("Versión del sistema operativo", os.release())
console.log("Arquitectura", os.arch())
console.log("CPU's", os.cpus())
console.log("Memoria libre", os.freemem()/ 1024 / 1024)
console.log("Memoria total", os.totalmem() / 1024 / 1024)
console.log("Up time", os.uptime() / 60 / 60)


