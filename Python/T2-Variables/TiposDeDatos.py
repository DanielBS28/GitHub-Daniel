#Hay 4 tipos de datos principales

#int (Enteros sin decimales)
#float (Flotantes con punto: reales)
#str (String: cadenas de texto)
#bool (Booleanos)

#int 

numero = 5
puntos = 85

#float

precio = 19.99
pi = 3.14
temperatura = -5.7
#Nota 10 es int pero 10.0 es float y además las variables en python pueden cambiar de tipo de datos a lo largo del programa es decir un float puede ser luego perfectamente un int
#por ejemplo: precio = 20

#str

#Las String pueden ir en comillas simples o dobles

curso = "Python"
ejemplo2 = 'Daniel'
cp = "28037" #¡Esto es una String no un número!

# ESTO DARÁ ERROR print(cp + 5)
print(cp + str(5)) #Esto ya no dará error pero se concatena no se suma.


# bool (Booleanos)

esVerdadero = True
esFalso = False


#¿TENEMOS DUDAS DE QUE TIPO DE DATOS TENEMOS EN UNA VARIABLE? -> Funcion type
#Util para el debugger
print(type(esVerdadero))
print(type(pi))
print(type(cp))
print(type(numero))



