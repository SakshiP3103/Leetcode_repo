class Solution {
    public String interpret(String command) {
      StringBuilder str= new StringBuilder();
            for(int i=0;i<command.length();i++){
                 if(command.charAt(i)=='G'){
                     str.append("G");
                 }
                
                else if(command.charAt(i)=='('){
                    if(command.charAt(i+1)==')')
                    {
                              str.append("o");
                    }  
                    else{
                    str.append("al") ;
                }
                }
                
                
                    
                }
        
        return str.toString();
       
        }
        
    }
