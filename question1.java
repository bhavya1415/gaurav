import java.util.*;
import java.text.ParseException; 
import java.text.SimpleDateFormat; 
import java.util.concurrent.TimeUnit; 
import java.util.Date;
class employee
{
  String name;
  int empID;
  String dob;
  String doj;

      employee()  //construstor
      {
       name=null;
       empID=0;
       dob=null;
       doj=null;
       }
}//employee end

class staff extends employee
{
   private String section_name;
   private String designation;

   staff()  //constructor
   {
    super(); // for base class
    section_name=null;
    designation=null;
   }  
    
    void setDetails() 
{
Scanner sc=new Scanner(System.in);
  System.out.println("Enter name");
  name = sc.nextLine();
  System.out.println("Enter birth");
  dob= sc.nextLine();
  System.out.println("Enter employee ID");
  empID = sc.nextInt();
  System.out.println("Enter date of joining");
  doj= sc.nextLine();
  System.out.println("Enter Section name ");
  String s1 = sc.nextLine();
  System.out.println("Enter designation");
  designation = sc.nextLine();
}

 void sameDesignation(staff s2)
 {
  if(designation.equals(s2.designation))
   System.out.println("Both have same designation");
  else
   System.out.println("Both have different designation");
 }
 void showDetails(staff s)
{
  System.out.println("name : " + s.name +
		  "\ndateOfBirth : " + s.dob +
		  "\nEmployee ID " + s.empID +
		    "\ndateOf Joining" +s.doj +
		   "\n designaiton : " + s.designation);
 }

}// staff ends

class faculty extends employee
{
 Scanner sc=new Scanner(System.in);
 private String departmentName;
 private int noOfPublications;

 faculty(){
  super();
  departmentName = null;
  noOfPublications = 0;
 }

 void sameDepartment(faculty s2) {
  if(departmentName.equals(s2.departmentName))
   System.out.println("Both have same department");
  else
   System.out.println("Both have different department");
 }

 void setDetails() {
  System.out.println("Enter name");
  name = sc.nextLine();
  System.out.println("Enter birth");
  dob = sc.nextLine();
  System.out.println("Enter employee ID");
  empID = sc.nextInt();
  System.out.println("Enter date of joining");
  doj= sc.nextLine();
  System.out.println("Enter department name");
  String s1 = sc.nextLine();
  departmentName = sc.nextLine();
  System.out.println("Enter no of publication ");
  noOfPublications = sc.nextInt();

 }

 void showDetails(faculty s){
  System.out.println("name : " + s.name +
		  "\ndateOfBirth: " + s.dob +
		  "\nEmployee ID " + s.empID +
		    "\ndateOfJoining" +s.doj +
		  "\ndepartment Name : " + s.departmentName +
		  "\n no of publication: "+s.noOfPublications);
 }

}//faculty class ends

class TempEmployee extends employee
{
 private String sectionName;
 private String lastWorkingDay;
 Scanner sc=new Scanner(System.in);

 TempEmployee(){
  super();
  sectionName=null;
 lastWorkingDay=null;
 }
 void workingdays(TempEmployee s) 
{
   SimpleDateFormat sdf = new SimpleDateFormat( "dd.MM.yyyy");
   String start=s.doj;
   String end=s.lastWorkingDay;
try{
   Date obj1=sdf.parse(start);
   Date obj2=sdf.parse(end);
  long difference_In_Time = obj2.getTime() - obj1.getTime();
              long difference_In_Seconds 
                = TimeUnit.MILLISECONDS 
                      .toSeconds(difference_In_Time) 
                  % 60;
            long difference_In_Minutes 
                = TimeUnit 
                      .MILLISECONDS 
                      .toMinutes(difference_In_Time) 
                  % 60; 
  
            long difference_In_Hours 
                = TimeUnit 
                      .MILLISECONDS 
                      .toHours(difference_In_Time) 
                  % 24; 
  
            long difference_In_Days 
                = TimeUnit 
                      .MILLISECONDS 
                      .toDays(difference_In_Time) 
                  % 365; 
  
            long difference_In_Years 
                = TimeUnit 
                      .MILLISECONDS 
                      .toDays(difference_In_Time) 
                  / 365l;
            System.out.print( 
                "Difference"
                + " between two dates is: "); 
  
            // Print result 
            System.out.println( 
                difference_In_Years 
                + " years, "
                + difference_In_Days 
                + " days, "
                + difference_In_Hours 
                + " hours, "
                + difference_In_Minutes 
                + " minutes, "
                + difference_In_Seconds 
                + " seconds"); 
 }
catch (ParseException e) { 
            e.printStackTrace(); 
        }
}

 void setDetails() 
{
  System.out.println("Enter name");
  name = sc.nextLine();
  System.out.println("Enter date of birth");
  dob = sc.nextLine();
  System.out.println("Enter empID  ");
  empID = sc.nextInt();
  System.out.println("Enter date of joining");
  doj= sc.nextLine();
  System.out.println("Enter sectionName");
  sectionName = sc.nextLine();
  System.out.println("Enter lastWorkingDay");
  lastWorkingDay = sc.nextLine();

 }

 void showDetails(TempEmployee s)
{
  System.out.println("name : " +    s.name +"\nDate Of Birth : " +    s.dob +"\nempID: " + s.empID+"\nDate Of Joining" +s.doj +"\nsectionName : " +    s.sectionName +"\n lastWorkingDay  : " + s.lastWorkingDay);

   }

}
//TempEmployeet class ends

public class question1
{
 public static void main(String args[]) 
{
  Scanner sc=new Scanner(System.in);
  staff[] staffs = new staff[10];
  faculty[] faculties = new faculty[10];
  TempEmployee[] TempEmployees = new TempEmployee[10];

  int sf= 0;
  int f=0;
  int te=0;

  int input;
  while(true) {
   System.out.println("MENU\n"
   		+ "1)create obj\n"
   		+ "2)display details\n"
   		+ "3)set details\n"
   		+ "0)Exit");
   input = sc.nextInt();

   if(input == 1) {
    System.out.println("create object of \n"
    		+ "1)staff\n"
    		+ "2)faculty\n"
    		+ "3)TempEmployee");
    int inp = sc.nextInt();
    if(inp == 1) {
     staffs[sf] = new staff();
     sf++;
    }
    else if(inp == 2) {
     faculties[f] = new faculty();
     f++;
    }
    else if(inp == 3) {
     TempEmployees[te] = new TempEmployee();
     te++;
    }
    else System.out.println("Wrong input");

    System.out.println("object created successfully");

   }

   if(input == 2) {
    System.out.println("details of object  \n"
    		+ "1)staff\n"
    		+ "2)faculty\n"
    		+ "3)TempEmployee");
    int d = sc.nextInt();

   if(d==1) 
{
System.out.println("Enter employee ID");
    int inp = sc.nextInt();
    for(int i=0;i<sf;i++)
     if(staffs[i].empID==inp) 
     staffs[i].showDetails(staffs[i]);


}

    if(d==2) 
{
    System.out.println("Enter employee id");
    int inp = sc.nextInt();
    for(int i=0;i<f;i++)
     if(faculties[i].empID == inp) faculties[i].showDetails(faculties[i]);
    }
    else if(d==3) {
    System.out.println("Enter employee id");
    int inp = sc.nextInt();
    for(int i=0;i<te;i++)
 if(TempEmployees[i].empID == inp)
TempEmployees[i].showDetails(TempEmployees[i]);
/*      TempEmployees[i].workingdays(TempEmployees[i]);  */
    }


   }
   if(input == 3) 
{
    System.out.println("set details of object  \n"
    		+ "1)staff\n"
    		+ "2)faculty\n"
    		+ "3)TempEmployee");
    int d = sc.nextInt();

    if(d==1) {
     staffs[sf-1].setDetails();
    }
    else if(d==2) {
     faculties[f-1].setDetails();

    }
    else if(d==3) {
     TempEmployees[te-1].setDetails();
    }
    else 
    System.out.println("wrong input");

    System.out.println("Details entered successfully");
   }
  if(input == 0)
{
System.out.println("Successful");
break;
} 
  }


}
}
