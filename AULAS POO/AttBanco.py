from BibliotecaBanco import Banco

p1 = Banco("Isa", 12345, 'C')
p1.ativarConta()
p1.ativarLimite(220)
p1.depositar(30)
p1.sacar(10)
