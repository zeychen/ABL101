package abl.generated;

import abl.runtime.*;
import wm.WME;
import wm.WorkingMemorySet;
import wm.WMEIndex;
import wm.TrackedWorkingMemory;
import java.util.*;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import abl.learning.*;
import abl.wmes.*;
import abl.actions.*;
import abl.sensors.*;
public class ChaserAgent_Preconditions {
   static public boolean precondition0(int __$behaviorID, Object[] __$args, Map __$variableTable, final BehavingEntity __$thisEntity) {
      switch (__$behaviorID) {
         case 1: {
            // ChangeColor_1
            int id;
            int botY;
            int botX;
               List wmeList0;
               ListIterator wmeIter0;
               wmeList0 = BehavingEntity.getBehavingEntity().lookupWME("BotWME");
               wmeIter0 = wmeList0.listIterator();
               while(wmeIter0.hasNext()) {
                  BotWME wme__0 = (BotWME)wmeIter0.next();
                  if (
                     BehavingEntity.constantTrue(botX = wme__0.getLocationX())
                     &&
                     BehavingEntity.constantTrue(botY = wme__0.getLocationY())
                     &&
                     BehavingEntity.constantTrue(id = wme__0.getId())
                  )

                  {
                     __$variableTable.put("id", new Integer(id));
                     __$variableTable.put("botY", new Integer(botY));
                     __$variableTable.put("botX", new Integer(botX));
                     return true;
                  }

               }


            return false;
         }
         case 3: {
            // fire_1
            int playerX;
            int playerY;
            int id;
            int botY;
            int botX;
               List wmeList0;
               ListIterator wmeIter0;
               wmeList0 = BehavingEntity.getBehavingEntity().lookupWME("PlayerWME");
               wmeIter0 = wmeList0.listIterator();
               while(wmeIter0.hasNext()) {
                  PlayerWME wme__0 = (PlayerWME)wmeIter0.next();
                  if (
                     BehavingEntity.constantTrue(playerX = wme__0.getLocationX())
                     &&
                     BehavingEntity.constantTrue(playerY = wme__0.getLocationY())
                  )

                  {
                        List wmeList1;
                        ListIterator wmeIter1;
                        wmeList1 = BehavingEntity.getBehavingEntity().lookupWME("BotWME");
                        wmeIter1 = wmeList1.listIterator();
                        while(wmeIter1.hasNext()) {
                           BotWME wme__1 = (BotWME)wmeIter1.next();
                           if (
                              BehavingEntity.constantTrue(botX = wme__1.getLocationX())
                              &&
                              BehavingEntity.constantTrue(botY = wme__1.getLocationY())
                              &&
                              BehavingEntity.constantTrue(id = wme__1.getId())
                           )

                           {
                              __$variableTable.put("playerX", new Integer(playerX));
                              __$variableTable.put("id", new Integer(id));
                              __$variableTable.put("playerY", new Integer(playerY));
                              __$variableTable.put("botY", new Integer(botY));
                              __$variableTable.put("botX", new Integer(botX));
                              return true;
                           }

                        }


                  }

               }


            return false;
         }
         case 5: {
            // moveTo_1
            int playerX;
            int playerY;
            int id;
            int botY;
               List wmeList0;
               ListIterator wmeIter0;
               wmeList0 = BehavingEntity.getBehavingEntity().lookupWME("PlayerWME");
               wmeIter0 = wmeList0.listIterator();
               while(wmeIter0.hasNext()) {
                  PlayerWME wme__0 = (PlayerWME)wmeIter0.next();
                  if (
                     BehavingEntity.constantTrue(playerX = wme__0.getLocationX())
                     &&
                     BehavingEntity.constantTrue(playerY = wme__0.getLocationY())
                  )

                  {
                        List wmeList1;
                        ListIterator wmeIter1;
                        wmeList1 = BehavingEntity.getBehavingEntity().lookupWME("BotWME");
                        wmeIter1 = wmeList1.listIterator();
                        while(wmeIter1.hasNext()) {
                           BotWME wme__1 = (BotWME)wmeIter1.next();
                           if (
                              BehavingEntity.constantTrue(botY = wme__1.getLocationY())
                              &&
                              BehavingEntity.constantTrue(id = wme__1.getId())
                           )

                           {
                              __$variableTable.put("playerX", new Integer(playerX));
                              __$variableTable.put("id", new Integer(id));
                              __$variableTable.put("playerY", new Integer(playerY));
                              __$variableTable.put("botY", new Integer(botY));
                              return true;
                           }

                        }


                  }

               }


            return false;
         }
      default:
         throw new AblRuntimeError("Unexpected behaviorID " + __$behaviorID);
      }
   }
}
