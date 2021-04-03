A = input('Digite um número: ')
B = input('Digite outro número: ')
resultado = []
sobra = 0
contA = len(A) - 1
contB = len(B) - 1
while contA >= 0 or contB >= 0:
    if contA >= 0 and contB >= 0:
        soma = int(A[contA]) + int(B[contB]) + sobra
    elif contA >= 0 > contB:
        soma = int(A[contA]) + sobra
    else:
        soma = int(B[contB]) + sobra
    if int(soma) >= 10:
        soma -= 10
        resultado.insert(0, soma)
        sobra = 1
    else:
        resultado.insert(0, soma)
        sobra = 0
    contA -= 1
    contB -= 1
if sobra > 0:
    resultado.insert(0, sobra)
print(resultado)
