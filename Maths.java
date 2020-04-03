public class Maths {
  // ============== GLOBALES ==============
  final double PI = 3.14159265358979323846;

  public static int parseInt(Double a) {
    Double round = a + 0.5;
    String compose = round.toString();
    String cRound = compose.substring(0, compose.indexOf("."));
    return Integer.parseInt(cRound);
  }

  // ============== ARITMÉTICA ==============
  // SUMA
  public static double sum(Double a, Double b) {
    return a + b;
  }

  // RESTA
  public static double dif(Double a, Double b) {
    return a - b;
  }

  // MULTIPLICACIÓN
  public static double mult(Double a, Double b) {
    return a * b;
  }

  // DIVISION
  public static double div(Double a, Double b) {
    return (double) (a / b);
  }

  // FACTORIAL
  public static double fact(int a) {
    if (a == 0)
      return 1;
    else {
      // VARIABLE DE SALIDA
      double out = a;

      // RECORRER A VECES
      for (int factIndex = 1; factIndex <= a - 1; factIndex++)
        out *= factIndex;

      // RETORNAR SALIDA
      return out;
    }
  }

  // POTENCIA
  public static double pow(double x, int n) {
    if (n == 0)
      return 1;
    else {
      // VARIABLE DE SALIDA
      double out = x;

      // RECORRER A N VECES
      for (int powIndex = 0; powIndex < n - 1; powIndex++)
        out *= x;

      // RETORNAR SALIDA
      return out;
    }
  }

  // RAÍZ CUADRADA
  public static double sqrt(double a) {
    // VARIABLES TEMPORALES
    double temp;
    double divs = a / 2;

    // MÉTODO DE SUMA DE DIVISOR
    do {
      temp = divs;
      divs = (temp + (a / temp)) / 2;
    } while ((temp - divs) != 0);

    // RETORNAR RAÍZ
    return divs;
  }

  public static double inverse(Double a) {
    return (double) (1 / a);
  }

  // NEGATIVO
  public static double negative(Double a) {
    return a * -1;
  }

  // ========== ALGEBRA ==========
  // CALCULAR ECUACIÓN CUADRÁTICA
  public static Double[] quadEq(int a, int b, int c) {
    // VARIABLE DE SALIDA
    Double[] out = new Double[2];

    // CALCULAR CON ECUACIÓN POSITIVA
    out[0] = (-b + sqrt((int) pow(b, 2) - (4 * a * c))) / 2 * a;

    // CALCULAR CON ECUACIÓN NEGATIVA
    out[1] = (-b - sqrt((int) pow(b, 2) - (4 * a * c))) / 2 * a;

    // RETORNAR RESPUESTAS
    return out;
  }

  // FACTORIZACIÓN
  public static int[] quadBin(int a, int b, int c) {
    // VALOR POR DEFECTO
    int[] out = { -1, -1 };

    // CUADRADOS
    int aRoot = parseInt(sqrt(a));
    int cRoot = parseInt(sqrt(b));

    // VERIFICAR SI ES UN BINOMIO CUADRADO PERFECTO
    if ((2 * cRoot * aRoot) == b) {
      out[0] = cRoot;
      out[1] = aRoot;
    }

    // RETORNAR RAÍCES
    return out;
  }

  public static int[] quadDif(int a, int b) {
    // CUADRADOS
    int aRoot = parseInt(sqrt(a));
    int cRoot = parseInt(sqrt(b));

    // VALOR POR DEFECTO
    int[] out = { aRoot, cRoot };

    // RETORNAR RAÍCES
    return out;
  }

  // ============== TRIGONOMÉTRICAS ==============
  public static double sin(double a) {
    if (a == Double.NEGATIVE_INFINITY || !(a < Double.POSITIVE_INFINITY)) {
      return Double.NaN;
    }

    double temp = 0;

    for (int i = 0; i < 100; i++)
      temp += pow(-1, i) * (pow(a, (2 * i) + 1) / fact((2 * i) + 1));

    return temp;
  }

  public static double cos(double a) {
    if (a == Double.NEGATIVE_INFINITY || !(a < Double.POSITIVE_INFINITY)) {
      return Double.NaN;
    }

    double temp = 0;

    for (int i = 0; i < 100; i++)
      temp += pow(-1, i) * (pow(a, (2 * i)) / fact((2 * i)));

    return temp;
  }

  public static double tan(double a) {
    if (a == Double.NEGATIVE_INFINITY || !(a < Double.POSITIVE_INFINITY)) {
      return Double.NaN;
    }

    return sin(a) / cos(a);
  }
}
