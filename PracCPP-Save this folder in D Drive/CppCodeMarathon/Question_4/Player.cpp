#include "Player.h"
#include <cstring>

Player::~Player()
{
    delete player_name;
    std::cout << "~Player() called..." << std::endl;
}

Player::Player()
{
    *scores_no_of_matches = 2;
    numberofmatchesplayed[*scores_no_of_matches];
    player_name = new char[strlen(player_name) + 1];
    strcpy(player_name, "Hrushant");
    playertypeObj = ACHIEVERS;
}

Player::Player(int *noOfMatch)
{
    player_name = new char[20];
    numberofmatchesplayed[0] = noOfMatch[0];
    numberofmatchesplayed[1] = noOfMatch[1];
    numberofmatchesplayed[2] = noOfMatch[2];
}

Player::Player(const Player &p)
{
    this->scores_no_of_matches = p.scores_no_of_matches;
    this->numberofmatchesplayed[3] = p.numberofmatchesplayed[3];
    this->player_name = p.player_name;
    this->playertypeObj = p.playertypeObj;
}

double Player::calAvg()
{
    int sum = 0;
    for (int i = 0; i < 3; i++)
    {
        sum = sum + numberofmatchesplayed[i];
    }
    return sum / 3.0;
}

bool Player::operator==(Player &p)
{
    return this->calAvg() == p.calAvg();
}

int Player::operator[](int index)
{
    try
    {
        if (index < 3 && index > 0)
        {
            return numberofmatchesplayed[index];
        }
        else
        {
            throw std::runtime_error("Index out of range");
        }
    }
    catch (const std::exception &e)
    {
        std::cerr << e.what() << '\n';
    }
}

Player Player::operator=(Player &p)
{
    this->numberofmatchesplayed[3] = p.numberofmatchesplayed[3];
    for(int i=0;i<3;i++)
    {
        this->scores_no_of_matches[i] = p.scores_no_of_matches[i];
    }
    this->player_name = p.player_name;
    this->playertypeObj = p.playertypeObj;
    return *this;
}

std::ostream &operator<<(std::ostream &os, const Player &p)
{
    os << p.numberofmatchesplayed[3];
    for(int i=0;i<3;i++)
    {
        os << p.scores_no_of_matches[i];
    }
    os << p.player_name << " " << p.playertypeObj << std::endl;
    return os;
}

std::istream &operator>>(std::istream &is, Player &p)
{
    std::cout<<"Enter number of matches played : "<<std::endl;
    is>>p.numberofmatchesplayed[3];
    for(int i=0;i<3;i++)
    {
        std::cout<<"Enter score of match : "<<std::endl;
        is>>p.scores_no_of_matches[i];
    }
    std::cout<<"Enter player name : "<<std::endl;
    is>>p.player_name;
    return is;
}
