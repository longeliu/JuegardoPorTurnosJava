package FactoryMundos;

import FactoryEnemigos.Azotamentes.Azotamentes;
import FactoryEnemigos.Gigante.Gigante;
import FactoryEnemigos.Huargo.Huargo;
import FactoryEnemigos.Kobold.Kobold;

public class CostaDeLaEspada implements EnemyFactory{
    public Kobold creaKobold() {
        return null;
    }

    public Gigante creaGigante() {
        return null;
    }

    public Azotamentes creaAzotamentes() {
        return null;
    }

    public Huargo creaHuargo() {
        return null;
    }
}
