/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UberAndRental;

import java.util.LinkedList;

/**
 *
 * @author karki
 */
public class binarySearch {
      int binarySearch(LinkedList<Integer> list,int user_input){
        int l = 0;
        int r = list.size()-1;
        
        while(l<=r){            
            int m = l+(r-l)/2;
            
            int a = list.get(m);
                
            if(a == user_input){    //target found
                return m;
                
            }else if(a < user_input){   //look right 
                l = m+1;
            
            }else{  //look left
                r = m-1;
            }
      
        }
        return -1;  //target not found
      }
}
        
