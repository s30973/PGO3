public class Employee {
   String imie,nazwisko,adres,mail,pesel;
   int rokZatrudnienia;


   Employee(String imie,String nazwisko,String adres,String mail,String pesel, int rokZatrudnienia){
      this.mail = mail;
      this.nazwisko = nazwisko;
      this.adres = adres;
      this.rokZatrudnienia = rokZatrudnienia;
      this.pesel = pesel;
      this.imie = imie;
   }


   public int calculateSalary() {
      int baseSalary = 3000;
      int currentYear = 2024;
      int yearsWorked = currentYear - rokZatrudnienia;

       return baseSalary+yearsWorked*1000;
   }
}