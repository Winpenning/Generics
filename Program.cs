using Programacao_Orientada_a_Objetos.Generics;
using Programacao_Orientada_a_Objetos._10;

namespace Programacao_Orientada_a_Objetos
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Select a content \n1 - Interfaces\n2 - Generics");
            int esc = int.Parse(Console.ReadLine());

            switch (esc)
            {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    Console.WriteLine("select a resolution \n1 - whitout generics\n2 - with generics");
                    byte esccase2 = byte.Parse(Console.ReadLine());

                    if(esccase2 == 1)
                    {
                        Console.Write("How many values? ");
                        int count = int.Parse(Console.ReadLine());
                        PrintService printService = new PrintService();
                        for (int i = 0; i < count; i++)
                        {
                            int value = int.Parse(Console.ReadLine());
                            printService.addValue(value);
                        }
                        printService.print();
                        printService.first();
                        
                    }
                    else
                    {
                        Console.WriteLine("How many values? ");
                        int count = int.Parse(Console.ReadLine());

                        PrintServiceComGenerics<string> printServiceComGenerics = new PrintServiceComGenerics<string>();
                        for(int i = 0; i < count; i++)
                        {
                            string value = Console.ReadLine();
                            printServiceComGenerics.addValue(value);
                        }
                        printServiceComGenerics.print();
                        printServiceComGenerics.first();
                    }
                    break;

            }
        }
    }
}