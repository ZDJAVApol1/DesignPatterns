package pl.sda.zdjavapol1.obserwator;

public interface Obserwator {

    void aktualizacja(float temp, float wilgotnosc, float cisnienie);
}
