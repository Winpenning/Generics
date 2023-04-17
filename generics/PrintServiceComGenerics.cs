using System;
namespace Programacao_Orientada_a_Objetos.Generics
{
/*AGORA NOSSA CLASSE E DE UM TIPO GENERICO ESPECIFICO CHAMADO DE T PODEMOS REUTILIZA-LA 
, TERA O TYPE SAFETY E MELHOR DESENPENHO, O TIPO DE DADO QUE SERA UTILIZADO PODEMOS ESPECIFICAR 
NA HORA NESCESSARIA*/
    class PrintServiceComGenerics<T>
    {
        private T[] array = new T[10];
        private int count = 0;

        public void addValue(T value)
        {
            if (count == 10)
            {
                throw new InvalidOperationException("The array is full!");
            }
            else
            {
                array[count] = value;
                count++;
            }
        }
        public T first()
        {
            return array[0];
        }

        public void print()
        {
            Console.Write("[");
            for(int i = 0; i< count - 1; i++)
            {
                Console.Write(array[i] + ", ");
            }
            if(count > 0)
            {
                Console.Write(array[count-1] +"]");
            }
        }

    }
}
