package abl.generated;

import abl.runtime.*;
import wm.WME;
import java.util.*;
import java.lang.reflect.Method;
import abl.learning.*;
import abl.wmes.*;
import abl.actions.*;
import abl.sensors.*;
public class ChaserAgent_BehaviorFactories {
   static public Behavior behaviorFactory0(int __$behaviorID, Object[] __$args, Hashtable __$boundVars, GoalStep __$parentGoal, String __$signature) {
      switch (__$behaviorID) {
         case 0: {
            // manageFiring_1

            final __StepDesc[] __$steps = {new __StepDesc(0, ChaserAgent.__$stepFactory0_rfield), new __StepDesc(1, ChaserAgent.__$stepFactory0_rfield)};
            return new SequentialBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)0, 0, null, __$steps);
         }
         case 1: {
            // fire_1
               final Object[] __$behaviorFrame = new Object[4];
               __$behaviorFrame[0] = new __ValueTypes.IntVar((Integer)__$boundVars.get("playerX"));
               __$behaviorFrame[1] = new __ValueTypes.IntVar((Integer)__$boundVars.get("playerY"));
               __$behaviorFrame[2] = new __ValueTypes.IntVar((Integer)__$boundVars.get("chaserY"));
               __$behaviorFrame[3] = new __ValueTypes.IntVar((Integer)__$boundVars.get("chaserX"));

            final __StepDesc[] __$steps = {new __StepDesc(2, ChaserAgent.__$stepFactory0_rfield), new __StepDesc(3, ChaserAgent.__$stepFactory0_rfield)};
            return new SequentialBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)0, 1, __$behaviorFrame, __$steps);
         }
         case 2: {
            // WaitAndChangeColor_1

            final __StepDesc[] __$steps = {new __StepDesc(4, ChaserAgent.__$stepFactory0_rfield), new __StepDesc(5, ChaserAgent.__$stepFactory0_rfield)};
            return new ParallelBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)0, 2, null, __$steps, 2);
         }
         case 3: {
            // manageMovement_1

            final __StepDesc[] __$steps = {new __StepDesc(6, ChaserAgent.__$stepFactory0_rfield)};
            return new SequentialBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)0, 3, null, __$steps);
         }
         case 4: {
            // move_1
               final Object[] __$behaviorFrame = new Object[2];
               __$behaviorFrame[0] = new __ValueTypes.IntVar((Integer)__$boundVars.get("playerY"));
               __$behaviorFrame[1] = new __ValueTypes.IntVar((Integer)__$boundVars.get("chaserY"));

            final __StepDesc[] __$steps = {new __StepDesc(7, ChaserAgent.__$stepFactory0_rfield)};
            return new SequentialBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)3, 4, __$behaviorFrame, __$steps);
         }
         case 5: {
            // move_2
               final Object[] __$behaviorFrame = new Object[2];
               __$behaviorFrame[0] = new __ValueTypes.IntVar((Integer)__$boundVars.get("playerY"));
               __$behaviorFrame[1] = new __ValueTypes.IntVar((Integer)__$boundVars.get("chaserY"));

            final __StepDesc[] __$steps = {new __StepDesc(8, ChaserAgent.__$stepFactory0_rfield)};
            return new SequentialBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)3, 5, __$behaviorFrame, __$steps);
         }
         case 6: {
            // move_3
               final Object[] __$behaviorFrame = new Object[2];
               __$behaviorFrame[0] = new __ValueTypes.IntVar((Integer)__$boundVars.get("playerX"));
               __$behaviorFrame[1] = new __ValueTypes.IntVar((Integer)__$boundVars.get("chaserX"));

            final __StepDesc[] __$steps = {new __StepDesc(9, ChaserAgent.__$stepFactory0_rfield)};
            return new SequentialBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)2, 6, __$behaviorFrame, __$steps);
         }
         case 7: {
            // move_4
               final Object[] __$behaviorFrame = new Object[2];
               __$behaviorFrame[0] = new __ValueTypes.IntVar((Integer)__$boundVars.get("playerX"));
               __$behaviorFrame[1] = new __ValueTypes.IntVar((Integer)__$boundVars.get("chaserX"));

            final __StepDesc[] __$steps = {new __StepDesc(10, ChaserAgent.__$stepFactory0_rfield)};
            return new SequentialBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)2, 7, __$behaviorFrame, __$steps);
         }
         case 8: {
            // move_5

            final __StepDesc[] __$steps = {new __StepDesc(11, ChaserAgent.__$stepFactory0_rfield)};
            return new SequentialBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)1, 8, null, __$steps);
         }
         case 9: {
            // Wait_1
               final Object[] __$behaviorFrame = new Object[2];
               __$behaviorFrame[0] = new __ValueTypes.IntVar((Integer)__$args[0]);
               __$behaviorFrame[1] = new __ValueTypes.LongVar();

            final __StepDesc[] __$steps = {new __StepDesc(12, ChaserAgent.__$stepFactory0_rfield), new __StepDesc(13, ChaserAgent.__$stepFactory0_rfield)};
            return new SequentialBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)0, 9, __$behaviorFrame, __$steps);
         }
         case 10: {
            // ChaserAgent_RootCollectionBehavior

            final __StepDesc[] __$steps = {new __StepDesc(14, ChaserAgent.__$stepFactory0_rfield), new __StepDesc(15, ChaserAgent.__$stepFactory0_rfield), new __StepDesc(16, ChaserAgent.__$stepFactory0_rfield)};
            return new CollectionBehavior(__$parentGoal, null, null, null, null, false, __$signature, (short)0, 10, null, __$steps, 3);
         }
      default:
         throw new AblRuntimeError("Unexpected behaviorID " + __$behaviorID);
      }
   }
}
