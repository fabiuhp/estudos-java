int x = 10;
int y = 20;

boolean resultado = x == 13 && x == 15 || y == 20;

O compilador vai avaliar por ordem de aparencia, por que não tem os parenteses.
E ele vai funcionar assim:
O && sempre vai ser avaliado primeiro.
(x == 13 && x == 15) || y == 20;