var numero = prompt("Digite um número qualquer...!");
var vezes = 1;


function Random(numero)
{
    var aleatorio = parseInt((Math.random() * 100)+1);

    if(aleatorio != numero)
    {
        alert(aleatorio + " é um número diferente de " + numero);
        alert("Está é a "+ vezes +" vezes que estamos procurando...!");
        console.log("Está é a " + vezes + "tentativa");
        console.log("NÚMERO RANDÔMICO É " + aleatorio);
        vezes++;
        Random(numero);
    }
    return numero;  
}

alert("Achou seu número miseravi " + Random(numero) + "procuramos o número por " + indice + " vezes !!");