package day_41_ExceptionsIntro;

import day_37_Inheritance.ScrumTeam.Employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {

        Employee employee = null;
        try {
            System.out.println(employee.salary);//NullPointerException
        }catch (IndexOutOfBoundsException e){
            System.out.println("first cach block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("second catch block");
            e.printStackTrace();
        }catch (ClassCastException e){
            System.out.println("Third catch block");

            e.printStackTrace();
        }catch (RuntimeException e){
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }

        System.out.println("------------------------------");

        try{
            System.out.println("java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }


        //finally sadece ek bir bloktur ve teminate olmadigi surece calisacaktir
//son catch bloktan sonra calistirilir.
                /*final bir keyword
                finally bir bloktur
                finalize bir metoddur*/










    }
}
