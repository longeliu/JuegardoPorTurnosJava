package FactoryMundos;

import FactoryEnemigos.Azotamentes.Azotamentes;
import FactoryEnemigos.Gigante.Gigante;
import FactoryEnemigos.Huargo.Huargo;
import FactoryEnemigos.Kobold.Kobold;

public interface EnemyFactory {
    Kobold creaKobold();
    Gigante creaGigante();
    Azotamentes creaAzotamentes();
    Huargo creaHuargo();
}
