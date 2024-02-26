/* Aim:- Practical No.1
   Author:- Shreyanshi chavan
   version:- 1.0
   Date:- 30 jan 2024



*/

 class PracticalNo1
{
 public static void main(string []argv)
{
 CompanyData SBJIT = newCompanyData("Shreyanshi Chavan",21,"Female",D06);
 SBJIT.display();
}
}


 Class CompanyData
{
 String name;
 int age;
 String gender;
 int empid;

CompanyData()
{ 

      System.out.println("Inside Default Contructor");
}



  CompanyData(String nm,int ag,String gen,int em)
{
         System.out.println("Inside Parametrised Constructor");
         this.name=nm;
         this.age=ag;
         this.gender=gen;
         this.empid=em;
}
 
 public void display()
{
        System.out.println("Name-"+this.name +"Age-"+this.age +"Gender-"+this.gender +"EmpId-"+this.empid);
}

}