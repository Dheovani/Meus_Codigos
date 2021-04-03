lajotas = []                                                                                                            #Vetor das lajotas
C = int(input('Quantas lajotas há na cerca? '))                                                                         #Quantidade de lajotas
ini = fim = 0                                                                                                           #Essa variável eu uso para determinar a lajota da posição de Obinho e até onde ele consegue andar
saltos = 0                                                                                                              #Variável para contar o total de saltos do Obinho
cond = True                                                                                                             #Variável de condição do loop principal
for cor in range(0, C):
    cores = int(input(f'Qual a cor da {cor + 1}ª lajota? 1/0\n'))
    if cores == 1:                                                                                                      #Loop determinando qual a cor da lajota
        lajotas.append('Preta')
    else:
        lajotas.append('Branca')
lajotas[0] = 'Preta'
lajotas[C - 1] = 'Preta'                                                                                                #Só pra definir que a primeira e última lajotas serão sempre pretas
for cerca in range(0, C):                                                                                               #Loop pra "desenhar" a cerca...
    if cerca < C - 1:
        print(f'|{lajotas[cerca]}|', end='')
    else:
        print(f'|{lajotas[cerca]}|')
while ini < C - 1 and cond is True:                                                                                     #Loop principal, onde eu determino o ponto onde Obinho está (ini)
    fim = ini + 2                                                                                                       #determino o máximo que ele pode alcançar (fim)
    if fim >= C:                                                                                                        #Esse if é só pro ponto máximo não sei maior que o número de lajotas
        fim = C - 1
    if lajotas[fim] == 'Branca' and lajotas[ini + 1] == 'Branca':                                                       #If prevendo o caso de não haver lajotas pretas para Obinho pular
        cond = False
    else:                                                                                                               #Caso hajam lajotas pretas próximas:
        if lajotas[fim] == 'Preta':                                                                                     #Obinho pode pular pra segunda lajota, pra ser mais rápido
            ini = fim
            saltos += 1
        elif lajotas[ini + 1] == 'Preta':                                                                               #Ou pular pra primeira, caso a segunda seja branca
            ini += 1
            saltos += 1
if ini == C - 1 and cond is True:                                                                                       #Após o loop ser finalizado, essa condicional determina
    print(f'Total de saltos: {saltos}.')                                                                                #o que deve ser o output
else:
    print('-1.')
