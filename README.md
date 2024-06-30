# Sistematização do Exercício do Curso Programação por Objeto

Problema - A empresa MGS (Max Global Sports) atua no ramo de representação de empresas que produzem artigos esportivos em todo o mundo. Seus funcionários viajam pelos quatro cantos do planeta oferecendo os produtos que a MGS representa para diversas empresas. A rotina pesada dos seus funcionários resultou em vários episódios de saúde no quais os empregados ficaram inconscientes e precisaram de auxílio de pessoas desconhecidas. Para apoiar seus funcionários nessas situações, a MGS encomendou um sistema de geração de cartões com as principais informações dos funcionários, alergias, problemas médicos, bem como telefones e e-mails de contato. O sistema deve ser capaz de armazenar as informações dos empregados e apresentá-las quando o respectivo identificador for fornecido.

A fim de solucionar a problemática e utilizando-se dos conceitos de Programação Orientada em Projetos, utilizando-se da linguagem de programa Java, descreve-se a seguir os procedimentos utilizados:

Criação de uma Classe Funcionarios com Atributos capazes de identificar esses. Portanto, contempla dados pessoais (nome, cargo, cpf), bem como dados relacionados a sua saúde. Por se tratar de uma primeira versão não se preocupou nesse momento com LGPD, que considera esses ultimos como dados sensiveis. Sendo assim, na versão final deve se obrigatoriamente considerar essa situação.

No passo seguinte, foi construido um constructor cuja funcão será criar um objeto novo, sempre que for chamado. Ponto importante, na Programação por Objeto.

Haja vista que a empresa conta como Funcionarios contratados por CLT, bem como por Trainers (estagiarios). O sistema proposto utiliza dos conceitos de herança e poliformismo. Sendo assim, foram criadas subclasses FuncionarioCLT e FuncionarioEstagiario, ambas utilizam do "super" para chamar o constructor da subclasse. Essas classes são extensão da super Classe funcionário, sendo que os dados podem subscrever os demais (@Override)

Com intuito de facilitar o uso, via terminal o usuário pode cadastrar todos os funcionarios, realizar busca pelo CPF, bem como obter uma relação de todos os funcionários cadastros. Sendo o CPF uma chave, portanto, não sendo possível a sua repetição, foi criada funcionadade que não permite a sua repetição. Em uma versão final, o sistema deverá conter outras validações essenciais ao seu pleno funcionamento, entre elas - validação detelefone, e-mail como a verificação de preenchimento de campos obrigátorios.

Sendo assim, submeto a apreciação a versão inicial do sistema, que nesse momento já pode ser útil.


