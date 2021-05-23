package FactoryMundos;

import FactoryEnemigos.Azotamentes.Azotamentes;
import FactoryEnemigos.Azotamentes.AzotamentesMarLunar;
import FactoryEnemigos.Gigante.Gigante;
import FactoryEnemigos.Gigante.GiganteMarLunar;
import FactoryEnemigos.Huargo.Huargo;
import FactoryEnemigos.Huargo.HuargoMarLunar;
import FactoryEnemigos.Kobold.Kobold;
import FactoryEnemigos.Kobold.KoboldMarLunar;

public class MarLunar implements EnemyFactory{//Devuelve un nuevo enemigo del mundo 3

    public Kobold creaKobold() {
        return new KoboldMarLunar();
    }

    public Gigante creaGigante() {
        return new GiganteMarLunar();
    }

    public Azotamentes creaAzotamentes() {
        return new AzotamentesMarLunar();
    }

    public Huargo creaHuargo() {
        return new HuargoMarLunar();
    }
}
