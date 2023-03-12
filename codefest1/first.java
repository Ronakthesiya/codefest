import java.io.*;
import java.util.*;

public class first{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
    try {
        BufferedReader reader=new BufferedReader(new FileReader("TWSP_small3.txt"));
        int t;
        
        t = Integer.parseInt(reader.readLine());
        System.out.println(t);
        int a[][]=new int[t][3];
        
        for(int i=0;i<t;i++){
            String k=reader.readLine();
            
            a[i][0]=((k.charAt(0)-'0')*10)+(k.charAt(1)-'0')+160;
            a[i][1]=((k.charAt(4)-'0'))*10+(k.charAt(5)-'0')+160;
            a[i][2]=((k.charAt(8)-'0'))*10+(k.charAt(9)-'0')+160;

            if(a[i][0]>=10){
                a[i][0]-=160;
            }
            if(a[i][1]>=10){
                a[i][1]-=160;
            }
            if(a[i][2]>=10){
                a[i][2]-=160;
            }
        }

        for(int i=0;i<t;i++){
            for(int j=0;j<t-1-i;j++){
                if(a[j][0]>a[j+1][0]){
                    int temp1=a[j][0];
                    int temp2=a[j][1];
                    int temp3=a[j][2];
                    a[j][0]=a[j+1][0];
                    a[j][1]=a[j+1][1];
                    a[j][2]=a[j+1][2];
                    a[j+1][0]=temp1;
                    a[j+1][1]=temp2;
                    a[j+1][2]=temp3;
                }
                if(a[j][0]==a[j+1][0]){
                    if(a[j][1]>a[j+1][1]){
                        
                        int temp2=a[j][1];
                        int temp3=a[j][2];
                        
                        a[j][1]=a[j+1][1];
                        a[j][2]=a[j+1][2];
                       
                        a[j+1][1]=temp2;
                        a[j+1][2]=temp3;
                    }
                    if(a[j][1]==a[j+1][1]){
                        if(a[j][2]>a[j+1][2]){
                            int temp3=a[j][2];
                            a[j][2]=a[j+1][2];
                            a[j+1][2]=temp3;
                        }
                    }
                }
            }
        }

        for(int i=0;i<t;i++){
            System.out.println(a[i][0]+" "+a[i][1]+" "+a[i][2]);
        }
    } catch (NumberFormatException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
    }

}