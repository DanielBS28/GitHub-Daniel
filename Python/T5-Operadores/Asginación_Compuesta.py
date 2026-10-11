#Es lo mismo que en otros lenguajes que conozco.

contador = 0

contador += 1 #Contador = Contador + 1
contador -= 1 #Contador = Contador - 1
contador *= 1 #Contador = Contador * 1
contador /= 1 #Contador = Contador / 1
contador //= 1 #Contador = Contador // 1
contador **= 1 #Contador = Contador ** 1
contador %= 1 #Contador = Contador % 1

#También existen los operadores de bits y desplazamiento

# Definición de valores base (en binario y decimal)
a = 0b1100  # 12 en decimal
b = 0b1010  # 10 en decimal

# AND bit a bit (&): 1 si ambos bits son 1
res_and = a & b  # 0b1000 (8 en decimal)
print(f"AND: {bin(res_and)} -> {res_and}")

# OR bit a bit (|): 1 si al menos un bit es 1
res_or = a | b  # 0b1110 (14 en decimal)
print(f"OR:  {bin(res_or)} -> {res_or}")

# XOR bit a bit (^): 1 si los bits son distintos
res_xor = a ^ b  # 0b0110 (6 en decimal)
print(f"XOR: {bin(res_xor)} -> {res_xor}")

# NOT / Complemento a dos (~): invierte todos los bits (~x = -(x + 1))
res_not = ~a  # -13 en decimal
print(f"NOT: {res_not}")

# Desplazamiento a la izquierda (<<): desplaza bits, equivale a multiplicar por 2^n
desp_izq = a << 2  # 0b110000 (48 en decimal)
print(f"Desplazamiento izquierda: {bin(desp_izq)} -> {desp_izq}")

# Desplazamiento a la derecha (>>): desplaza bits, equivale a dividir entre 2^n
desp_der = a >> 2  # 0b0011 (3 en decimal)
print(f"Desplazamiento derecha:   {bin(desp_der)} -> {desp_der}")

# Asignación con operadores de bits
mascara = 0b0001  # 1

# Activar bit (OR)
mascara |= 0b0010  # 0b0011 (3)

# Comprobar o filtrar bit (AND)
mascara &= 0b0010  # 0b0010 (2)

# Alternar bit (XOR)
mascara ^= 0b0010  # 0b0000 (0)

# Desplazamiento y asignación
valor = 2  # 0b0010
valor <<= 2  # 0b1000 (8)
valor >>= 1  # 0b0100 (4)

# Inicialización
elementos = [10, 20, 30, 40]

# Acceso e indexación
primer_elem = elementos[0]  # 10
ultimo_elem = elementos[-1]  # 40

# Slicing (sublistas): [inicio:fin_exclusivo:paso]
sub_lista = elementos[1:3]  # [20, 30]

# Modificación in-place con operadores compuestos
elementos += [50, 60]  # Equivalente a elementos.extend([50, 60])
elementos *= 2  # Duplica los elementos contenidos

print("Lista resultante:", elementos)