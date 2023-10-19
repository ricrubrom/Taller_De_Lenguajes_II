## Tabla de comparacion

| Criterio                       | Opción 1                     | Opción 2                    |
|--------------------------------|------------------------------|-----------------------------|
| Abstracción del mundo real     | Modela elementos audiovisuales en clases separadas. | Modela elementos audiovisuales en clases separadas. |
| Duplicación de código          | Existe cierta duplicación de código en las clases específicas. | Minimiza la duplicación de código mediante una clase base común (`Item`). |
| Re-uso de código               | El código específico de cada tipo de recurso no se reutiliza de manera efectiva. | Promueve el reuso de código al utilizar una clase base común para funcionalidades comunes. |
| Mantenimiento del programa     | Agregar un nuevo tipo de recurso requeriría cambios sustanciales en el código existente. | Facilita la adición de nuevos tipos de recursos con menos esfuerzo. |
| Extensibilidad                 | Menos extensible; agregar un nuevo tipo de recurso requeriría modificaciones importantes. | Más extensible; facilita la adición de nuevos tipos de recursos con menos cambios en el código existente. |
| Polimorfismo                   | No se aplica de manera clara; cada tipo de recurso tiene sus propios métodos. | Demuestra polimorfismo mediante la herencia y la capacidad de las subclases para anular métodos. |

En resumen, la Opción 2 es preferible para cumplir con los requerimientos del Instituto de Artes Audiovisuales, ya que ofrece una mejor abstracción del mundo real, minimiza la duplicación de código, fomenta el reuso de código, facilita el mantenimiento y la extensibilidad del programa, y aplica el polimorfismo de manera más efectiva. La Opción 2 es más modular y flexible, lo que facilita la incorporación de nuevos tipos de recursos en el futuro.


## Verdadero y Falso

a. Una clase abstracta debe tener al menos un método abstracto. JUSTIFIQUE.

    Falsa, una clase abstracta puede no tener métodos abstractos.

b. No pueden definirse constructores en una clase abstracta. JUSTIFIQUE.

    Falsa, una clase abstracta puede tener constructores que luego pueden
    ser llamados por las subclases.

c. Los métodos abstractos no pueden ser declarados en una clase no abstracta (concreta).
JUSTIFIQUE

    Verdadero, ya que los metodos deben siempre tener un cuerpo, y los metodos
    abstractos no lo tienen.

d. Si una clase B extiende una clase abstracta A debe implementar TODOS los métodos de
la clase abstracta A. JUSTIFICAR

    Falsa, si la clase B es abstracta, no es necesario implementar todos los
    metodos de la clase abstracta A.