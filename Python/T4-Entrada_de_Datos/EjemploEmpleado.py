
nombre = input("¿Cúal es tu nombre?: ")
print(f"Tu nombre es: {nombre}")

edad = int(input("¿Cúal es tu edad?: ")) #Lo convierto ya directamente a int desde el input
print(f"Tu edad son: {edad} años")

salario = float(input("¿Cúal es tu salario?: ")) 
print(f"Tu salario son {salario} €")

esJefe = input("¿Eres jefe de departamento? (Si/No)")
#Convertir a booleano 
esJefe = esJefe.lower() == "si" #Cualquier otra cadena será falso

if(esJefe):
    print("Eres jefe de departamento: " + str(esJefe))
else:
    print("Eres jefe de departamento: " + str(esJefe))


