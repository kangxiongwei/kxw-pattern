package com.kxw.pattern.state;

public class Context {
   private State state;
 
   Context(){
   }
 
   public void setState(State state){
      this.state = state;     
   }
 
   public State getState(){
      return state;
   }
}