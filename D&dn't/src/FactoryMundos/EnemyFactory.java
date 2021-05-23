package FactoryMundos;

import FactoryEnemigos.Azotamentes.Azotamentes;
import FactoryEnemigos.Gigante.Gigante;
import FactoryEnemigos.Huargo.Huargo;
import FactoryEnemigos.Kobold.Kobold;

public interface EnemyFactory {//interfaz factory que contiene los metodos de creaccion
    Kobold creaKobold();
    Gigante creaGigante();
    Azotamentes creaAzotamentes();
    Huargo creaHuargo();
}
