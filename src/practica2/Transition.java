/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author Dayra
 */
public class Transition {
    public enum Action {MOVER_CANIBAL1, MOVER_CANIBAL2, MOVER_CANIBAL3, MOVER_MISIONERO1,MOVER_MISIONERO2,
    MOVER_MISIONERO3, MOVER_BOTE
    } 
    public State initial;
    public Action action;
    public State doTransition(){
        State result = new State();
        if (action == Action.MOVER_BOTE){
             result.Can1 = initial.Can1;
            result.Can2 = initial.Can2;
            result.Can3 = initial.Can3;
            result.Mis1 = initial.Mis1;
            result.Mis2 = initial.Mis2;
            result.Mis3 = initial.Mis3;
            if (initial.Bote == State.Position.DERECHA)
                result.Bote = State.Position.IZQUIERDA;
            else
                result.Bote = State.Position.DERECHA;
        }
        if (action == Action.MOVER_CANIBAL1){
            result.Can2 = initial.Can2;
            result.Can3 = initial.Can3;
            result.Mis1 = initial.Mis1;
            result.Mis2 = initial.Mis2;
            result.Mis3 = initial.Mis3;
            result.Bote = initial.Bote;
            if (initial.Can1 == State.Position.DERECHA)
                result.Can1 = State.Position.IZQUIERDA;
            else
                result.Can1 = State.Position.DERECHA;
        }
         if (action == Action.MOVER_CANIBAL2){
            result.Can2 = initial.Can1;
            result.Can3 = initial.Can3;
            result.Mis1 = initial.Mis1;
            result.Mis2 = initial.Mis2;
            result.Mis3 = initial.Mis3;
            result.Bote = initial.Bote;
            if (initial.Can2 == State.Position.DERECHA)
                result.Can2 = State.Position.IZQUIERDA;
            else
                result.Can2 = State.Position.DERECHA;
         }
          if (action == Action.MOVER_CANIBAL3){
            result.Can1 = initial.Can1;
            result.Can2 = initial.Can2;
            result.Mis1 = initial.Mis1;
            result.Mis2 = initial.Mis2;
            result.Mis3 = initial.Mis3;
            result.Bote = initial.Bote;
            if (initial.Can3 == State.Position.DERECHA)
                result.Can3 = State.Position.IZQUIERDA;
            else
                result.Can3 = State.Position.DERECHA;
          }
           if (action == Action.MOVER_MISIONERO1){
            result.Can1 = initial.Can1;
            result.Can2 = initial.Can2;
            result.Can3 = initial.Can3;
            result.Mis2 = initial.Mis2;
            result.Mis3 = initial.Mis3;
            result.Bote = initial.Bote;
            if (initial.Mis1 == State.Position.DERECHA)
                result.Mis1 = State.Position.IZQUIERDA;
            else
                result.Mis1 = State.Position.DERECHA;
           }
           if (action == Action.MOVER_MISIONERO2){
            result.Can1 = initial.Can1;
            result.Can2 = initial.Can2;
            result.Can3 = initial.Can3;
            result.Mis1 = initial.Mis1;
            result.Mis3 = initial.Mis3;
            result.Bote = initial.Bote;
            if (initial.Mis2 == State.Position.DERECHA)
                result.Mis2 = State.Position.IZQUIERDA;
            else
                result.Mis2 = State.Position.DERECHA;
           }
            if (action == Action.MOVER_MISIONERO3){
            result.Can1 = initial.Can1;
            result.Can2 = initial.Can2;
            result.Can3 = initial.Can3;
            result.Mis1 = initial.Mis1;
            result.Mis3 = initial.Mis2;
            result.Bote = initial.Bote;
            if (initial.Mis3 == State.Position.DERECHA)
                result.Mis3 = State.Position.IZQUIERDA;
            else
                result.Mis3 = State.Position.DERECHA;
            
            
            }
            return result;
    }
     public Transition(State initial, Action action){
        this.initial = initial;
        this.action = action;
}
}

    

    
