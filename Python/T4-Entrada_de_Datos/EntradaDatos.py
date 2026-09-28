#Usaremos la función input() para "escuchar" por teclado como el scanner teclado en Java

#Sintaxis recomendada: variable = input("Mensaje para el usuario: ") 
#Se puede poner sin mensaje pero el programa parará en ese momento y es un poco confuso

#SIEMPRE EL INPUT SERÁ UNA STRING TENDREMOS QUE CONVERTIRLO SI QUEREMOS OTRO TIPO DE DATOS
nombre = input("¿Cúal es tu nombre?: ")
print(f"Tu nombre es: {nombre}")

edad = int(input("¿Cúal es tu edad?: ")) #Lo convierto ya directamente a int desde el input
print(f"Tu edad son: {edad} años")

altura = float(input("¿Cúal es tu altura?: ")) 
print(f"Mides {altura} metros")

#Nota: en python no hay que limpiar el buffer (\n) como en Java.
