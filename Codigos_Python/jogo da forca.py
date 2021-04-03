secret = input("Defina uma palavra para a forca: ").lower()                                                             #input de definição da palavra
forca = acertos = erros = corretas = tentadas = palavra = ""                                                            #variáveis para guardar strings
chances = 6                                                                                                             #variável do contador de chances
for c in range(0, len(secret)):
    forca += "_ "                                                                                                       #estrutura condicional para definir uma "forca"
print(f'Vamos jogar forca. Tente acertar a palavra!\n{forca}')                                                          #print da forca
forca = forca.split()                                                                                                   #transformando a forca em uma lista de strings
while chances != 0 and palavra != secret:                                                                               #loop das tentativas da forca
    chute = input('Chute uma letra: ').lower()                                                                          #input das letras tentadas
    if chute in secret and chute not in tentadas:                                                                       #estrutura para continuação do jogo quando o chute é correto
        tentadas += chute                                                                                               #contabilizador de letras tentadas
        local = secret.index(chute)
        forca[local] = chute
        t = secret.find(chute)
        while t > -1:                                                                                                   #estrutura para for as letras corretas na forca
            t = secret.find(chute, t + 1)
            if t > -1:
                local = secret.index(chute, local+1)
                forca[local] = chute
        corretas += chute                                                                                               #contabilizador de letras corretas
        print(f'Acertou! Letras utilizadas {list(corretas) + list(erros)}')
        print(f'Chances restantes = {chances}.')                                                                        #print da situação do jogo caso chute correto
        print(' '.join(forca))
        for letra in secret:                                                                                            #estrutura que adiciona as letras corretas à variável
            if letra == chute:
                acertos += letra
    elif chute in tentadas:                                                                                             #estrutura para evitar letras já tentadas
        print("Você já tentou essa letra! Tente novamente")
    else:                                                                                                               #estrutura para continuação do jogo caso chute errado
        tentadas += chute
        erros += chute
        chances -= 1
        print(f'Errou, tente novamente! Letras utilizadas {list(corretas) + list(erros)}.')
        print(f'Chances restantes = {chances}.')                                                                        #print da situação do jogo caso chute errado
        print(' '.join(forca))
    if len(acertos) == len(secret):                                                                                     #estrutura de montagem da palavra correta
        for a in secret:
            palavra += a
if chances != 0:                                                                                                        #estrutura de julgamento da situação final do jogo
    print(f'Parabéns, você descobriu! A palavra era {palavra}.')
else:
    print(f'Você foi enforcado!')
