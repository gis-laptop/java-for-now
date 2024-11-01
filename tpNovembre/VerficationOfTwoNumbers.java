public class VerficationOfTwoNumbers{

    public double verifedValue;
    
    VerficationOfTwoNumbers(double verifedValue){
        this.verifedValue=verifedValue;
    }
    public void verification(){
        if(verifedValue%2==0)
        System.out.println("Le nombre est pair");

        else{
            System.out.println("Le nombre est impair");
        }
    }


    public static void main(String[] args) {

        VerficationOfTwoNumbers test = new VerficationOfTwoNumbers(25);
        test.verification();
    }
}