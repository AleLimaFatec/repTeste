public class App {
    public static void main(String[] args) throws Exception {
        String[][] alunos = {
            {"ALE","10"},
            {"ANA","8"},
            {"MARIA","4"},
            {"JOÃO","7"},
            {"Jorginho","10"}
        };

        alunos[3][0] = "PEDRO";
        

        for(String[] linhas:alunos){
            for(String coluna:linhas){
                System.out.print(coluna+ " ");
            }
            System.out.println();
        }
        
        
    }
}
