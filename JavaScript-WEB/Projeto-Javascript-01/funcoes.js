alert("Mensagem simples");

// na Javascript, a tipagem é DINÂMICA
var frase1 = "boa noite, galera!";
var numero1 = 10;
var numero2 = 7.5;

// alert(frase1);
// alert(numero1+5);
// alert(numero2*2);

// saida na aba "Console"
console.log(frase1);
console.error(numero1+5);
console.warn(numero2*2);

// entrada de dados via janela: "prompt()"
var entrada = prompt("Digite um numero");
console.log("Seu numero x2 é "+(entrada*2));

// caso seja necessário converter de texto p/ numero
var x = "8.5";
var y = "7";

console.log("O x é  "+ typeof x );
console.log("O y é  "+ typeof y );

var xnumerico = parseFloat(x); // convertido p/ real
var ynumerico = parseInt(y); // convertido p/ inteiro
