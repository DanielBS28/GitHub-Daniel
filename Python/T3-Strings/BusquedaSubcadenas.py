#El método .find("palabra") nos devuelve el indice del primer caracter de la subcadena que buscamos, sino devuelve -1. SOLO TOMA EN CUENTA LA PRIMERA APARICIÓN

cadena = "Hola mundo"
#H0 o1 l2 a3 _4 m5 u6 n7 d8 o9
indice = cadena.find("mundo") #devolverá 5 ya que encontró la secuencia mundo a partir del indice 5.

print(cadena)
print(indice)

print("Indice de la subcadena Hola: "+ str(cadena.find("Hola")))
print(f"Indice de la subcadena hola: {cadena.find("hola")}")