# jogo-pega-pontos---Parte-1
Esse jogo se trata de uma atividade do curso de Sistemas e Mídia Digitais, na cadeira de Matemática Aplicada a Multimida.
A framework utilizada foi o Processing.
Nessa primeira parte do código eu criei vetores que serão necessários para distribuição dos pontos no ambiente do jogo
e serão capturados ao longo da partida.
Em seguida eles foram introduzidos na cena através de uma função inicializadora (void Setup) função da própria framework, onde a mesma é executada apenas uma vez e aplicado o framerate da cena, que terá papel importante na parte 2 do projeto.
A sua distribuição na cena é feita de forma randômica, respeitando os limites da cena (Size(720,720)) e o preenchimento dos espaço pelos eixo X e Y por meio do for (12x10).
Por fim, foi adicionado um valor randômico que irá ser utilizado por um dos inimigos, para que ele estâncie em uma posição aleatória na cena


Feito isso, foi introduzido uma serie de funções (cenario(), marcaPontos(), contadorFrame(), keyReleased(), keyPressed()), todas responsáveis por introduzir na cena ou realizar cálculos das suas devidas nomenclaturas, em ressalva a keyReleased() e keyPressed(), que são responsáveis pela verificação de movimentação do personagem controlável e por realizar a movimentação do personagem, respectivamente.
