package com.company;

public class CommonCharacter {

    public void removeCommon(String s1, String s2){

        String commonCharacter ="";
        for (int i=0 ; i< s1.length(); i++){
            for(int j=0; j< s2.length(); j++){
                if(s1.charAt(i) == s2.charAt(j))
                {
                    commonCharacter += s1.charAt(i);
                }
            }
        }


        for(int i=0; i< commonCharacter.length(); i++){
            String cc = commonCharacter.charAt(i) +"" ;
            s1 = s1.replace(cc,"");
            s2 = s2.replace(cc, "");

        }


    }
    public static void main (String [] args){
        {
            CommonCharacter cc = new CommonCharacter();
            cc.removeCommon("abcdef", "abcssdef");

        }
    }
}
