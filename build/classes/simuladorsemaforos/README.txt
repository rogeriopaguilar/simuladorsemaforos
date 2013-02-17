-Programa que simula o tráfego de veículos por um semáforo entre duas ruas que se cruzam e tem direção única
-criado em: jan/2013
-autor: Rogério de Paula Aguilar - rogeriodpaguilarbr@gmail.com

-motivação: Criei este programa após um exercício proposto no guj:

     http://www.guj.com.br/java/291379-criacao-de-um-sistema-de-semafaros-em-java/2#1544630

-classe principal (necessário utilizar o jdk 1.7 ou superior):

     simuladorsemaforos.SimuladorSemaforo


-os arquivos fontes estão com a codificação utf-8
-os fontes deste projeto estão em:
         https://github.com/rogeriopaguilar/Projetos/simuladorsemaforos

-criei o programa no Netbeans 6.9
-necessário utilizar o jdk 1.7 ou superior




-- alterações na versão 0.2 (versão atual):

   1 - o botão adicionar foi modificado para adicionar um carro mesmo quando a simulação está em andamento
   2 - a tabela que mostra os carros é atualizada conforme o tempo de chegada ao semáforo é modificado na simulação;
   3 - foi adicionado um controle que permite alterar o tempo de funcionamento do semáforo;
   4 - o botão preenchimento automático adiciona os carros à simulação mesmo que esta esteja em andamento;
   5 - o tempo considerado para os carros chegarem ao semáforo no preenchimento aleatório era escolhido
       entre 1 e 30 sempre. Agora este tempo é escolhido entre 1 e o tempo selecionado para chegada ao semáforo
       ao lado do combo que mostra o carro;

-- alterações previstas para a versão 0.3:

    1 - criar uma tela para melhor configuração do preenchimento aleatório, permitindo:
        1.1 - selecionar se quer utilizar o tempo escolhido no controle do carro ou um outro valor para
              o tempo de chegada ao semáforo;
        1.2 - selecionar se os carros devem ser adicionados à simulação que já está configurada ou se
              devem sobrescrever a configuração;

    2 - permitir que o tempo de chegada ao semáforo seja alterado mesmo quando a simulação já esteja em andamento;
    3 - permitir o redimensionamento da tela;
    4 - corrigir possível bugs da versão 0.2;
    5 - permitir que o carro seja excluído mesmo se a simulação já estiver em andamento;







