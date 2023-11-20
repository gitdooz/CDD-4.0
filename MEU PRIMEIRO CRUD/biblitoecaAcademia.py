from BancoDeDados import *
import os
cursor = banco.cursor()


def inserirAluno(nome, cpf, telefone, email, endereco):
    cadastro_aluno = 'insert into alunos (nome, cpf, telefone, email, endereco) values (%s, %s, %s, %s,%s);'
    data = (nome, cpf, telefone, email, endereco)
    cursor.execute(cadastro_aluno, data)
    banco.commit()
    os.system('cls')
    print('\nAluno cadastrado com sucesso.')


def deletarAluno(matricula):
    deletar_aluno = f'DELETE FROM alunos WHERE matricula = "{matricula}"'
    cursor.execute(deletar_aluno)
    banco.commit()
    os.system('cls')
    print('\nAluno deletado com sucesso.')

def mostrarDadosAluno():
    consulta_aluno = 'SELECT * FROM alunos;'
    cursor.execute(consulta_aluno)
    resultado = cursor.fetchall()
    for x in resultado:
        print(x)


def inserirFuncionario(nome, cpf_funcionario, departamento, salario):
    cadastro_funcionario = ('insert into funcionarios (nome, cpf_funcionario, departamento, salario) '
                            'values (%s, %s, %s, %s);')
    data = (nome, cpf_funcionario, departamento, salario)
    cursor.execute(cadastro_funcionario, data)
    banco.commit()
    os.system('cls')
    print('\nFuncionario cadastrado com sucesso.')


def deletarFuncionario(id_funcionario):
    deletar = f'DELETE FROM func WHERE id_funcionario = "{id_funcionario}"'
    cursor.execute(deletar)
    banco.commit()
    os.system('cls')
    print('Funcionário deletado com sucesso.')


def mostrarDadosFuncionario():
    consulta_funcionario = 'SELECT * FROM funcionarios;'
    cursor.execute(consulta_funcionario)
    resultado = cursor.fetchall()
    for x in resultado:
        print(x)


def inserirModalidade(nome):
    cadastro_modalidade = f'INSERT into modalidades (nome) VALUES ("{nome}");'
    cursor.execute(cadastro_modalidade)
    banco.commit()
    os.system('cls')
    print('\nModalidade cadastrada com sucesso.')


def deletarModalidade(id_mod):
    deletar = f'DELETE FROM modalidades WHERE id_mod = "{id_mod}"'
    cursor.execute(deletar)
    banco.commit()
    os.system('cls')
    print('Modalidade deletada')

def mostrarDadosModalidade():
    consulta_modalidades = 'SELECT * FROM modalidades;'
    cursor.execute(consulta_modalidades)
    resultado = cursor.fetchall()
    for x in resultado:
        print(x)



def inserirPersonal(cpf, cref, nome, telefone, email):
    cadastro_personal = 'insert into personal (cpf, cref, nome, telefone, email) values (%s, %s, %s, %s,%s);'
    data = (cpf, cref, nome, telefone, email)
    cursor.execute(cadastro_personal, data)
    banco.commit()
    os.system('cls')
    print('Personal cadastradoa com sucesso.')

def deletarPersonal(cpf):
    deletar = f'DELETE FROM personal WHERE cpf = "{cpf}"'
    cursor.execute(deletar)
    banco.commit()
    os.system('cls')
    print('Personal deletadx com sucesso.')


def mostrarDadosPersonal():
    consulta_personal = 'SELECT * FROM personal;'
    cursor.execute(consulta_personal)
    resultado = cursor.fetchall()
    for x in resultado:
        print(x)
