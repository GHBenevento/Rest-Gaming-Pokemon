package unittesting.Classes.data2;

public enum Action {
    EAT, FIGHT, TRAIN, PLAY ,SLEEP
}
/*
give_food
    -> -hunger
    -> -dogecoin
fight
    -> -energy
    -> +hunger

        if win
             -> +happy
             -> +dogecoin +bonus
        else
            -> -happy
            -> +dogecoin

train
    -> +hunger and obtain xp
    -> +energy +bonus
    -> -dogecoin
play
    -> +happy
    -> -energy
sleep
    -> +energy

 A w->3__+1
 B l->1__+1
   */