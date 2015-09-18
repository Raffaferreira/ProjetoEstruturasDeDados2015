var mediaAprovacao = prompt("Qual a média de aprovação?");
var maximoFaltas = prompt("Qual o máximo de faltas?");

console.log("Parabéns, você tentou " + cadastrarNotasFrequencia(mediaAprovacao,maximoFaltas) + " vezes !!");
alert("Parabéns, você tentou " + cadastrarNotasFrequencia(mediaAprovacao, maximoFaltas) + " vezes, até passar em estruturas de dados");

function cadastrarNotasFrequencia(mediaAprovacao, maximoFaltas)
{
    var tentativas = 1;

    var nota1 = prompt("Digite a primeira nota");
    var nota2 = prompt("Digite a segunda nota");
    var faltas = prompt("Digite o número de faltas");

    var mediaAntingida = (nota1 + nota2) / 2;

    if(mediaAntingida < mediaAprovacao || faltas > maximoFaltas )
    {
        tentativas++;
        cadastrarNotasFrequencia(mediaAprovacao, maximoFaltas);
    }
    return tentativas;
}