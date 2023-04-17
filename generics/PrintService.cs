using System;
namespace Programacao_Orientada_a_Objetos.Generics
{

    /* PROBLEMA 1: REUSO, ESSE CODIGO SO FUNCIONA COM VALORES INTEIROS, CASO EU QUERIA
     * VALORES STRING,DOUBLE, ETC. EU TENHO QUE CRIAR UMA NOVA CLASSE.
     * 
     * PODERIAMOS UTILIZAR O OBJECT, POREM ENTRAMOS EM M SEGUNDO PROBLEMA QUE E O TYPE SAFETY
     * POIS NAO TEMOS GARANTIA NENHUMA QUE VIRA UM TIPO EXPECIFICO DE VALOR
     * ISSO NAO SERA ACUSADO COMO ERRO PELO COMPLIADOR POREM PODE GERAR UMA EXCECAO EM TEMPO DE EXECUCAO
     * (ALEM DA PEQUENA PERDA DE PERFORMANCE QUE TEMOS POR UTILIZAR O OBJECT DEVIDO AO BOXING E UNBOXING
     */
    class PrintService
    {
        private int[] array = new int[10];
        private int count = 0;
        public void addValue(int value)
        {
            if (count >= 10)
            {
                throw new InvalidOperationException("The array is full!");
            }
            else
            {
                array[count] = value;
                count++;
            }
        }
        public int first()
        {
            return array[0];
        }
        public void print()
        {
            Console.Write("[");
            for(int i=0; i < count - 1; i++)
                Console.Write(array[i] + ", ");
            if(count > 0)
            {
                Console.Write(array[count-1] + "]");
            }
        }
    }
}
