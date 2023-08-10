
package model;

import java.util.HashMap;

public class Cartt extends HashMap<Object, Object>{
    public Cartt(){
    }
    public void addCart(Cart pc){
        int key = pc.getProduct().getId();
        if (this.containsKey(key)){
            int oldQuantity = ((Cart)this.get(key)).getQuantity_cart();
            ((Cart)this.get(key)).setQuantity_cart(oldQuantity+1);
        }else{
            this.put(key, pc);            
        }
        
    }
}
