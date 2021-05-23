package FactoryMundos;

import FactoryEnemigos.Azotamentes.Azotamentes;
import FactoryEnemigos.Azotamentes.AzotamentesCostaEspada;
import FactoryEnemigos.Gigante.Gigante;
import FactoryEnemigos.Gigante.GiganteCostaEspada;
import FactoryEnemigos.Huargo.Huargo;
import FactoryEnemigos.Huargo.HuargoCostaEspada;
import FactoryEnemigos.Kobold.Kobold;
import FactoryEnemigos.Kobold.KoboldCostaEspada;

public class CostaDeLaEspada implements EnemyFactory{//Devuelve un nuevo enemigo del mundo 2

    public Kobold creaKobold() {
        return new KoboldCostaEspada();
    }

    public Gigante creaGigante() {
        return new GiganteCostaEspada();
    }

    public Azotamentes creaAzotamentes() {
        return new AzotamentesCostaEspada();
    }

    public Huargo creaHuargo() {
        return new HuargoCostaEspada();
    }
}
