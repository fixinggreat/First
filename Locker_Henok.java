

public class Locker_Henok
{


   public static void main(String[] args) {
 

 

        System.out.print("Open lockers are :");

        for( int i =2;i<=1000;i++)

{

      for( int j =2;j<= i;j++)

      {

   if( (i%j) == 0)

   {

     if( i == (j*j))

       {

   System.out.print("  "+ i);

 

 

       }

 

   }

 

      }

 

 

        }

System.out.println("");

 

       System.out.println("Closed lockers are : ");

 

        for( int i =1;i<=1000;i++)

        {

      for( int j =3;j<= i;j++)

      {

   if( (i%j) != 0)

   {

 

   System.out.print("  "+ i);

 

   }

 

 

   }

 

      }

 

 

        }

    }
