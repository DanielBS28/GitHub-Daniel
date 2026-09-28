num = 10
texto = "10"

print(num == texto) #Es falso no es lo mismo.

#int() convierte texto o decimales a enteros
#float() convierte texto o enteros a decimales
#str() convierte cualquier cosa a texto

print(int(texto) == num) #Ahora si.

texto_decimal = "19.99"
decimal = float(texto_decimal)

#No es lo mismo sumar números que cadenas.

print("5"+"5") #55
print(int("5")+int("5")) #10 
suma = int(texto) + num # 10 + 10
print(suma) # imprime 20

#Y por supuesto no podemos sumar texto y un número
# print("Hola" +  5)
print("Hola " +  str(5))