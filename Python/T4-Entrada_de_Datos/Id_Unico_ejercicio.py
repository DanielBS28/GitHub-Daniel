import random


nombre = input("Dime tu nombre: ")
apellido = input("Dime tus apellidos: ")
anio = int(input("Dime tu año de nacimiento: "))
#Luego generar valor aletorio y concatenarlo con las dos primeras letras de nombre apellido (En mayusculas), y los dos digitos últimos del año.

id = nombre.strip().upper()[0:2] #Forma buena de hacerlo
id += apellido.strip().upper()[0] #Primero la posición 0
id += apellido.strip().upper()[1] #Luego la 1, podría haberlo hecho como hice en el nombre era para probar cosas nuevas
id += str(anio)[-2:]
id += str(random.randint(1000,9999))

print("Tu ID único es: " + id)