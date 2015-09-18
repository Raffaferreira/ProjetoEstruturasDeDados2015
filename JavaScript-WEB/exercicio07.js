var pedagios = prompt("Quantos pedagios você irá pagar ?");
var numeroPdg = [];
var total = 0;

for (var i=0; i < pedagios; i++)
{
    numeroPdg[i] = prompt("Digite o valor de cada pedágio....");
    total += parseFloat(numeroPdg[i]);
}
alert("Alerta total pago em pedágio " + total);

var media = total/numeroPdg.length;
alert("A média é : " + media);