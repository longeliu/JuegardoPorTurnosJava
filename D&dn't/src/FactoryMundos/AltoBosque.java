package FactoryMundos;

import FactoryEnemigos.Azotamentes.Azotamentes;
import FactoryEnemigos.Azotamentes.AzotamentesAltoBosque;
import FactoryEnemigos.Gigante.Gigante;
import FactoryEnemigos.Gigante.GiganteAltoBosque;
import FactoryEnemigos.Huargo.Huargo;
import FactoryEnemigos.Huargo.HuargoAltoBosque;
import FactoryEnemigos.Kobold.Kobold;
import FactoryEnemigos.Kobold.KoboldAltoBosque;

public class AltoBosque implements EnemyFactory{
    public Kobold creaKobold() {
        return new KoboldAltoBosque();
    }

    public Gigante creaGigante() {
        return new GiganteAltoBosque();
    }

    public Azotamentes creaAzotamentes() {
        return new AzotamentesAltoBosque();
    }

    public Huargo creaHuargo() {
        return new HuargoAltoBosque();
    }
}
