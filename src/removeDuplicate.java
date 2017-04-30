/* program to build any collection containing duplicates.
   Create its copy with all duplicates removed.*/
public class removeDuplicate { 
    public static int[] RDuplicate(int[] input){         
        int j = 0;
        int i = 1;
        //return if the array length is less than 2
        if(input.length < 2){
            return input;
        }
        while(i < input.length){
            if(input[i] == input[j]){
                i++;
            }else{
                input[++j] = input[i++];
            }   
        }
        int[] output = new int[j+1];
        for(int k=0; k<output.length; k++){
            output[k] = input[k];
        }         
        return output;
    }     
    public static void main(String a[]){
        int[] input1 = {2,3,6,6,8,9,10,10,10,12,12};
        int[] output = RDuplicate(input1);
        //printing output after removing duplicate
        for(int i:output){
            System.out.print(i+" ");
        }
    }
}
