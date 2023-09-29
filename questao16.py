horaInicio = int(input("Digite a hora de início do jogo: "))
horaFim = int(input("Digite a hora de fim do jogo: "))

if horaInicio <= horaFim:
    duracao = horaFim - horaInicio
else:
    duracao = 24 - horaInicio + horaFim

print(f"A duração do jogo é de {duracao} horas")