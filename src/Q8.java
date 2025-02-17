public class Q8 {
    class Teste2 {
        int num1, num2;

        int maior()
        {
            if (num1 > num2)
                return true;
            else
                return false;
        }

        void menor()
        {
            if (num1 < num2)
                return num1;
            else
                return num2;
        }
    }
}
//Erros encontrados:
//Método maior() retorna true/false, mas deveria retornar um int
//Correção: o método deve retornar num1 ou num2 e não um boolean.
//Método menor() deveria retornar um int, mas é void
//Correção: o método deve ter o retorno int.
