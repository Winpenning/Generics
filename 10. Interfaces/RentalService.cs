namespace Programacao_Orientada_a_Objetos._10._Interfaces
{
    class RentalService
    {
        public double priceperhour { get; set; }
        public double priceperday { get; set;}
        private ITaxService taxservice;

        public RentalService(double priceperhour, double priceperday, ITaxService taxservice)
        {
            this.priceperhour = priceperhour;
            this.priceperday = priceperday;
            this.taxservice = taxservice;
        }

        public void ProcessInvoice(CarRental carrental)
        {
            TimeSpan durantion = carrental.finish.Subtract(carrental.start);

        }
    }
}
