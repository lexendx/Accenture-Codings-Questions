class ReverseNum{
public static void main(String[] args) {

    int num =987654, reverse = 0;
    while( num!= 0){

        int digit= num%10;
        reverse = reverse*10+ digit;
num/=10;



    }
    System.out.println("Reversed Number:" + reverse);
}




}