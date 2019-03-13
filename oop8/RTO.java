import java.util.Scanner;

class Vehicle{
    String reg_date,color,wheeler,manufacturing_date;
    int reg_n;
    Vehicle(){
        Scanner input=new Scanner(System.in);
        reg_date=input.next();
       
        color=input.next();
        wheeler=input.next();
        manufacturing_date=input.next();
        reg_n=input.nextInt();
   
    }
}

class owner extends Vehicle{
    String name,address;
    owner(){
        super();
        Scanner input=new Scanner(System.in);
        name=input.next();
        address=input.next();
    }
    public boolean search(int check){
        if(check==reg_n)
            return true;
        else return false;
    }
    public void show_details(){
        System.out.println("The details of the owner is "+name+" "+address);
    }
}

class RTO{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=2,i;
        owner[] o=new owner[2];
        for(i=0;i<2;i++){
            o[i]=new owner();
        }
        System.out.println("Enter the vehicle number(int)");
        int check=input.nextInt();
        boolean flag=false;
        for(i=0;i<2;i++){
            flag=o[i].search(check);
            if(flag==true)
                break;
        }
        if(i>1)
            System.out.println("The owner wasn't found");
        else
            o[i].show_details();

    }
}

