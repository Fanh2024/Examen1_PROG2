A. Théorie

1- L’annotation @Override signifie que la méthode d'une classe fille redéfinit la méthode de la classe mère.
2- On a souvent besoin de redéfinir equals et hashCode pour
  . comparer les objets en fonction de leurs valeurs
  . utiliser les objets comme clés
3- Le polymorphisme statique permet de créer plusieurs méthodes avec le même nom mais des paramètres différents dans une classe.
  . EXEMPLE :
    class Additionner {
      public int add(int a, int b) {
        return a + b;
      }
      public double add(double a, double b) {
        return a + b;
      }
    }
