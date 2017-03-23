/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.ArrayList;
import practica2.Transition.Action;

/**
 *
 * @author Dayra
 */
public class State {
    public enum Position {DERECHA, IZQUIERDA}
    
    public Position Can1;
    public Position Can2;
    public Position Can3;
    public Position Mis1;
    public Position Mis2;
    public Position Mis3;
    public Position Bote;
    
    
     public boolean isValid(){
        if ((Can1 == Position.DERECHA)&& 
                (Can2 == Position.DERECHA)&&
                (Can3 == Position.DERECHA)&&
                (Mis1 == Position.IZQUIERDA)&&
                (Mis2 == Position.IZQUIERDA)&&
                (Mis3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Can1 == Position.DERECHA)&& 
                (Can2 == Position.DERECHA)&&
                (Can3 == Position.DERECHA)&&
                (Mis1 == Position.IZQUIERDA)&&
                (Mis2 == Position.DERECHA)&&
                (Mis3 == Position.DERECHA)&&
                (Bote == Position.DERECHA))
            return false;
        if ((Can1 == Position.DERECHA)&& 
                (Can2 == Position.IZQUIERDA)&&
                (Can3 == Position.IZQUIERDA)&&
                (Mis1 == Position.IZQUIERDA)&&
                (Mis2 == Position.DERECHA)&&
                (Mis3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Can1 == Position.DERECHA)&& 
                (Can2 == Position.IZQUIERDA)&&
                (Can3 == Position.DERECHA)&&
                (Mis1 == Position.IZQUIERDA)&&
                (Mis2 == Position.IZQUIERDA)&&
                (Mis3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Can1 == Position.IZQUIERDA)&& 
                (Can2 == Position.IZQUIERDA)&&
                (Can3 == Position.DERECHA)&&
                (Mis1 == Position.IZQUIERDA)&&
                (Mis2 == Position.DERECHA)&&
                (Mis3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Can1 == Position.IZQUIERDA)&& 
                (Can2 == Position.DERECHA)&&
                (Can3 == Position.DERECHA)&&
                (Mis1 == Position.IZQUIERDA)&&
                (Mis2 == Position.IZQUIERDA)&&
                (Mis3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Can1 == Position.IZQUIERDA)&& 
                (Can2 == Position.IZQUIERDA)&&
                (Can3 == Position.IZQUIERDA)&&
                (Mis1 == Position.IZQUIERDA)&&
                (Mis2 == Position.DERECHA)&&
                (Mis3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Can1 == Position.IZQUIERDA)&& 
                (Can2 == Position.DERECHA)&&
                (Can3 == Position.DERECHA)&&
                (Mis1 == Position.IZQUIERDA)&&
                (Mis2 == Position.IZQUIERDA)&&
                (Mis3 == Position.DERECHA)&&
                (Bote == Position.DERECHA))
            return false;
        if ((Can1 == Position.IZQUIERDA)&& 
                (Can2 == Position.IZQUIERDA)&&
                (Can3 == Position.DERECHA)&&
                (Mis1 == Position.IZQUIERDA)&&
                (Mis2 == Position.DERECHA)&&
                (Mis3 == Position.DERECHA)&&
                (Bote == Position.DERECHA))
            return false;
        if ((Can1 == Position.IZQUIERDA)&& 
                (Can2 == Position.DERECHA)&&
                (Can3 == Position.IZQUIERDA)&&
                (Mis1 == Position.IZQUIERDA)&&
                (Mis2 == Position.DERECHA)&&
                (Mis3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Can1 == Position.IZQUIERDA)&& 
                (Can2 == Position.DERECHA)&&
                (Can3 == Position.DERECHA)&&
                (Mis1 == Position.DERECHA)&&
                (Mis2 == Position.IZQUIERDA)&&
                (Mis3 == Position.IZQUIERDA)&&
                (Bote == Position.DERECHA))
            return false;
       
            //terminar toda la lista de estados invalidos
        return true;
    
}
      public boolean isFinal(){
        if ((Can1 == Position.IZQUIERDA)&&
                (Can2 == Position.IZQUIERDA)&&
                (Can3 == Position.IZQUIERDA)&&
                (Mis1 == Position.IZQUIERDA)&&
                (Mis2 == Position.IZQUIERDA)&&
                (Mis3 == Position.IZQUIERDA)&&
                (Bote == Position.IZQUIERDA))
            return true;
        return false;
}
      public ArrayList<Transition> validTransitions(){
        ArrayList<Transition> result = new 
            ArrayList<Transition>();
        //Mover al bote siempre es posible
        result.add(new Transition(this,Action.MOVER_BOTE));
        //Mover a la oveja solo es posible con el granjero
        if (Mis1 == Bote){
            result.add(new Transition(this,Action.MOVER_MISIONERO1));
        }
        //Mover a los demas objetos queda en la comodidad 
        //de su hogar
        return result;
    }
    public static void main(String[] args){
        State test = new State();
        test.Bote = Position.DERECHA;
        System.out.print(test);
   }
    @Override
    public String toString(){
        return "Posición Misionero1: " + Mis1 + "," +
                "Posición Misionero2: "+ Mis2 + "," +
                "Posición Misionero3: " + Mis3 + "," +
                "Posición Canibal1: " + Can1 + "," +
                "Posición Canibal2: " + Can2 + "," +
                "Posición Canibal3: " + Can3 + "," +
                "Posición Bote: "+ Bote;
                }
}
