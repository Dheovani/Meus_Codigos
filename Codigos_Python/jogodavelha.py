from random import choice
from time import sleep
num = [1, 2, 3, 4, 5, 6, 7, 8, 9]
dispon = [1, 2, 3, 4, 5, 6, 7, 8, 9]
cont = 1
escolhamaq = []
escolhajog = []
primeiro = int(input('Quem vai primeiro? Máquina[1] Jogador[2]\n'))
if primeiro == 1:
    select = choice(dispon)
    localnum = num.index(select)
    localmaq = dispon.index(select)
    escolhamaq.append(select)
    num[localnum] = '\033[1;31mX\033[m'
    dispon.pop(localmaq)
    print(select)
while dispon:
    for c in num:
        if cont % 3 == 0:
            print(c)
        else:
            print(c, end=' | ')
        cont += 1
    escolha = int(input('Selecione uma das posições disponíveis:\n'))
    localnum = num.index(escolha)
    localjog = dispon.index(escolha)
    escolhajog.append(escolha)
    escolhajog.sort()
    num[localnum] = '\033[1;34mO\033[m'
    dispon.pop(localjog)
    if dispon:
        if 1 in escolhajog and 2 in escolhajog and 3 in escolhajog:
            print('O jogador venceu!')
            break
        if 4 in escolhajog and 5 in escolhajog and 6 in escolhajog:
            print('O jogador venceu!')
            break
        if 7 in escolhajog and 8 in escolhajog and 9 in escolhajog:
            print('O jogador venceu!')
            break
        if 1 in escolhajog and 5 in escolhajog and 9 in escolhajog:
            print('O jogador venceu!')
            break
        if 3 in escolhajog and 5 in escolhajog and 7 in escolhajog:
            print('O jogador venceu!')
            break
        if 1 in escolhajog and 4 in escolhajog and 7 in escolhajog:
            print('O jogador venceu!')
            break
        if 2 in escolhajog and 5 in escolhajog and 8 in escolhajog:
            print('O jogador venceu!')
            break
        if 3 in escolhajog and 6 in escolhajog and 9 in escolhajog:
            print('O jogador venceu!')
            break
        if 1 in escolhamaq and 2 in escolhamaq and 3 in escolhamaq:
            print('A máquina venceu!')
            break
        if 4 in escolhamaq and 5 in escolhamaq and 6 in escolhamaq:
            print('A máquina venceu!')
            break
        if 7 in escolhamaq and 8 in escolhamaq and 9 in escolhamaq:
            print('A máquina venceu!')
            break
        if 1 in escolhamaq and 5 in escolhamaq and 9 in escolhamaq:
            print('A máquina venceu!')
            break
        if 3 in escolhamaq and 5 in escolhamaq and 7 in escolhamaq:
            print('A máquina venceu!')
            break
        if 1 in escolhamaq and 4 in escolhamaq and 7 in escolhamaq:
            print('A máquina venceu!')
            break
        if 2 in escolhamaq and 5 in escolhamaq and 8 in escolhamaq:
            print('A máquina venceu!')
            break
        if 3 in escolhamaq and 6 in escolhamaq and 9 in escolhamaq:
            print('A máquina venceu!')
            break
        print('Minha vez! Eu escolho', end=' ')
        select = choice(dispon)
        localnum = num.index(select)
        localmaq = dispon.index(select)
        escolhamaq.append(select)
        escolhamaq.sort()
        num[localnum] = '\033[1;31mX\033[m'
        dispon.pop(localmaq)
        print(select)
    else:
        print('Empatou!')
