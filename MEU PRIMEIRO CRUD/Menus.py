from biblitoecaAcademia import *

while True:
    print('-----------  MENU -----------\n'
          '   > 1 - CADASTRAR ALUNO <\n'
          '   > 2 - CADASTRAR FUNCIONÁRIO <\n'
          '   > 3 - CADASTRAR MODALIDADE <\n'
          '   > 4 - CADASTRAR PERSONAL <\n')
    primeiro_menu = int(input('O que deseja fazer?\n'
                              'DIGITE AQUI: '))

    if primeiro_menu == 1:
        print('-----------  MENU -----------\n'
              '   > 1 - INSERIR DADOS DO ALUNO <\n'
              '   > 2 - DELETAR ALUNO <\n'
              '   > 3 - MOSTRAR DADOS <\n')
        opcao_aluno = int(input('O que deseja fazer?\n'
                                'DIGITE AQUI: '))
        if opcao_aluno == 1:
            inserirAluno()
        elif opcao_aluno == 2:
            matricula = int(input('Digite a matrícula do aluno: '))
            deletarAluno(matricula)
        else:
            mostrarDadosAluno()

    if primeiro_menu == 2:
        print('-----------  MENU -----------\n'
              '   > 1 - INSERIR DADOS DO FUNCIONARIO <\n'
              '   > 2 - DELETAR FUNCIONARIO <\n'
              '   > 3 - MOSTRAR DADOS DO FUNCIONARIO <\n')
        opcao_funcionario = int(input('O que deseja fazer?\n'
                                      'DIGITE AQUI: '))
        if opcao_funcionario == 1:
            inserirFuncionario()
        elif opcao_funcionario == 2:
            id_funcionario = int(input('Digite ID do funcionário: '))
            deletarFuncionario(id_funcionario)
        else:
            mostrarDadosFuncionario()

    if primeiro_menu == 3:
        print('-----------  MENU -----------\n'
              '   > 1 - INSERIR DADOS DA MODALIDADE <\n'
              '   > 2 - DELETAR MODALIDADE <\n'
              '   > 3 - MOSTRAR DADOS DA MODALIDADE <\n')
        opcao_modalidade = int(input('O que deseja fazer?\n'
                                     'DIGITE AQUI: '))

        if opcao_modalidade == 1:
            inserirModalidade()
        elif opcao_modalidade == 2:
            id_mod = int(input('Digite a matrícul do aluno: '))
            deletarModalidade(id_mod)
        else:
            mostrarDadosModalidade()
    if primeiro_menu == 4:
        print('-----------  MENU -----------\n'
              '   > 1 - INSERIR DADOS DO PERSONAL <\n'
              '   > 2 - DELETAR PERSONAL <\n'
              '   > 3 - MOSTRAR DADOS DO PERSONAL <\n')
        opcao_personal = int(input('O que deseja fazer?\n'
                                   'DIGITE AQUI: '))
        if opcao_personal == 1:
            inserirPersonal()
        elif opcao_personal == 2:
            cpf = int(input('Digite a matrícul do aluno: '))
            deletarPersonal(cpf)
        else:
            mostrarDadosPersonal()

