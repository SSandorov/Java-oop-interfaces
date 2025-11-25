package AbstractClassesAndInterfaces;

//* Las interfaces son contratos que deben ser cumplidos estrictamente
//* por las clases que las implementen
public interface Electric {
  //* no se escriben los metodos de acceso en las propiedades de una interfaz,
  //* ya que todas las propiedades son publicas
  void chargeBattery();

  //* No es comun pero si podisble anadir atributos a una interfaz
  //* estos atributos seran publicos, estaticos y constantes
  int MAX_BATTERY_CAPACITY = 100;
}