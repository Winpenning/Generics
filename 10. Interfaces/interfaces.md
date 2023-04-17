# INTERFACES

É um tipo que define um conjunto de operações que uma classe deve implementar.

A interface estabelece um **contrato** que a classe ou struct deve cumprir.

Vantagens de interfaces:
- Sistemas de baixo aclopamento (ou seja, cada um faz classe/struct faz apenas a sua tarefa);
- Sistemas flexíveis.

_Convenção: Colocar um I ( i maiúsculo antes do nome da interface)_


~~~cs
interface IConta{
	double saldo();
	double titular();
}
~~~

---

## Problema exemplo

Uma locadora brasileira de carros cobra um **valor por hora para 
locações de até 12 horas**. Porém, **se a duração da locação 
ultrapassar 12 horas, a locação será cobrada com base em um valor 
diário**. Além do valor da locação, é **acrescido no preço o valor do
imposto conforme regras do país** que, no caso do **Brasil, é 20% 
para valores até 100.00, ou 15% para valores acima de 100.00.** Fazer um 
**programa que lê os dados da locação (modelo do carro, instante inicial
e final da locação), bem como o valor por hora e o valor diário de locação.**
O programa deve então **gerar a nota de pagamento (contendo valor da locação,
valor do imposto e valor total do pagamento)** e **informar os dados na tela.**


Nosso UML:
![problema exemplo](problema.png)

Teremos uma classe genérica chamada `TaxService `
que pode ou não ser do Brasil. Agora o `RentalService`
vai depender unicamente de `TaxService`.

A interface vai definir um contrato que o serviço de imposto (`TaxService`) deve cumprir recebendo uma quantia e retornando o valor do imposto.


A partir disso podemos criar serviços específicos que implementem essa interface

☀️ Se o `BrazilTaxService` realiza uma interface com `ITaxService` então ele deve obrigatoriamente implementar o método tax.☀️

Logo temos:

- ITaxService: implementa o método tax.
- RentalService: atributos priceperhour:double, priceperday:double e taxservice:ITaxService (que receberá um valor sem ser instanciado, chamamos isso de injeção de dependência).
-