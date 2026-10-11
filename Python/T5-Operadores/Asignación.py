numero  = 5
print(f"El valor de número: {numero}")
cadena = "Hola"
print(cadena)

#Asignación multiple

#Varias variables por comas y después del igual se toman esos valores
variable1, variable2, variable3 = 10, "Hola", True
print(f"Variable1: {variable1}") #10
print(f"Variable2: {variable2}") #"Hola"
print(f"Variable3: {variable3}") #True

#Asignación encadenada

var1 = var2 = var3 = "Hola" #Todas las vzriables tienen "Hola"
print(f"Var1: {var1}") #"Hola"
print(f"Var2: {var2}") #"Hola"
print(f"Var3: {var3}") #"Hola"

# Esto da error: var1,var2, var3 = "Hola" 

#Con input habría que poner un split si usamos encadenada
nombre, apellido = input("Dime tu nombre y apellido (separados con -)").split("-")
print("Nombre: " + nombre)
print("Apellido: "+ apellido)
#Si no pongo el split dará error. 
