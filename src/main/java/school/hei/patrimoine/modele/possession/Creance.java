package school.hei.patrimoine.modele.possession;

import java.time.LocalDate;

public final class Creance extends Argent {
  public Creance(String nom, LocalDate t, int valeurComptable, Devise devise) {
    super(nom, t, valeurComptable, devise);
    if (valeurComptable < 0) {
      throw new IllegalArgumentException();
    }
  }
}
