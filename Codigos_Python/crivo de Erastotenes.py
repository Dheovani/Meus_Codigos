num = []                                                                                                                #Vetor pra armazenar os números
for c in range(1, int(input('Encontrar os primos até que número? ')) + 1):                                              #Estrutura FOR pra adicionar todos os números de 1 até o limite indicado
    num.append(c)
print(num)
cont = 2
while cont <= len(num)**1/2:                                                                                            #Loop funcionará até a raiz quadrada do todal de variáveis no vetor
    for d in num:                                                                                                       #Estrutura em FOR pra excluir os números que foram múltiplos de d
        if d != cont and d%cont == 0:
            num.pop(num.index(d))
    cont += 1                                                                                                           #Contador que administra o Loop principal
num.pop(num.index(1))                                                                                                   #Excluir o número 1 pq o sor disse que não é primo
print(f'Números primos: {num}')                                                                                         #System.out.printIN();
