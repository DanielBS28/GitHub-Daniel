#La función replace busca una cadena dentro de otra y la sustituye, cambio lo viejo por lo nuevo, al ser inmutable no de modifica la original

#Usos, limpiar una cadena o cambiar algo con f strings tipo {nombre} y ahí poner una variable

#Sintaxis: .replace("viejo","nuevo", opcional este tercer parámetro sirve para las veces que queramos poner el texto nuevo cada vez que encuenta la cadena)

nombre = "Daniel"
texto = "Hola soy AQUIVANOMBRE AQUIVANOMBRE AQUIVANOMBRE"
texto2 = f"Hola soy {nombre}"

print(texto)
print(texto2)

print("Usamos replace: ")

print(texto.replace("AQUIVANOMBRE", nombre)) #Remplaza todo lo que encuentre con la palabra vieja
print(texto.replace("AQUIVANOMBRE", nombre,1)) #Solo reemplaza una vez
print(texto.replace("AQUIVANOMBRE", nombre,2)) #Solo reemplaza 2 veces
print(texto.replace("AQUIVANOMBRE", "Asela")) #Puedo poner texto, no es necesario que sea una variable
print(texto2.replace(f"{nombre}", "Asela")) #Con f Strings

