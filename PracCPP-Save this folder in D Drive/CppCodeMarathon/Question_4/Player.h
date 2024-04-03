
#ifndef PLAYER_H
#define PLAYER_H

#include<iostream>

enum Playertype{ACHIEVERS, EXPLORERS};

class Player
{
    int *scores_no_of_matches;
    int numberofmatchesplayed[3];
    char *player_name;
    Playertype playertypeObj;

    public:
    ~Player();
    Player();
    Player(int *);
    Player(const Player &p);
    double calAvg();
    bool operator==(Player &p);
    int operator[](int index);
    Player operator=(Player &p);

    friend std::ostream &operator<<(std::ostream &os,const Player &p);
    friend std::istream &operator>>(std::istream &is, Player &p);
};

int findminavgscore(Player [],int );

#endif // PLAYER_H
