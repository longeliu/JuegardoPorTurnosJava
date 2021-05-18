package FactoryMundos;

import FactoryEnemigos.Azotamentes.Azotamentes;
import FactoryEnemigos.Azotamentes.AzotamentesVientohelado;
import FactoryEnemigos.Gigante.Gigante;
import FactoryEnemigos.Gigante.GiganteVientohelado;
import FactoryEnemigos.Huargo.Huargo;
import FactoryEnemigos.Huargo.HuargoVientohelado;
import FactoryEnemigos.Kobold.Kobold;
import FactoryEnemigos.Kobold.KoboldVientohelado;

public class ValleVientohelado implements EnemyFactory{
    public Kobold creaKobold() {
        return new KoboldVientohelado();
    }

    public Gigante creaGigante() {
        return new GiganteVientohelado();
    }

    public Azotamentes creaAzotamentes() {
        return new AzotamentesVientohelado();
    }

    public Huargo creaHuargo() {
        return new HuargoVientohelado();
    }
}
