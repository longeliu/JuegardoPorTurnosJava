package FactoryMundos;

import FactoryEnemigos.Azotamentes;
import FactoryEnemigos.Gigante;
import FactoryEnemigos.Huargo;
import FactoryEnemigos.Kobold;

public interface EnemyFactory {
    Kobold creaKobold();
    Gigante creaGigante();
    Azotamentes creaAzotamentes();
    Huargo creaHuargo();
}
