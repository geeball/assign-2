import java.util.ArrayList;

/**
 * Created by U1759657 on 26/02/2018.
 */
public class Questions {
    private ArrayList<Question> zillionaiireQuestions = new ArrayList<>();

    public Questions() {
        Question gkone = new Question("What Ancient City State was ruled by King Leonidas?", 3, "General Knowledge");
        Question gktwo = new Question("What Element has the Chemical Symbol Sn?", 4, "General Knowledge");
        Question gkthree = new Question("Where does a Muscovite live?", 5, "General Knowledge");
        Question gkfour = new Question("What is the main Ingredient in Hummus?", 3, "General Knowledge");
        Question gkfive = new Question("What does UFO Stand for?", 1, "General Knowledge");

        Question scione = new Question("What is the definition of Ataxaphobia?", 4, "Science");
        Question scitwo = new Question("What was Erwin Schrodinger's original nationality?", 5, "Science");
        Question scithree = new Question("Which person is associated with the discovery of Eau de Cologne?", 5, "Science");
        Question scifour = new Question("Which Symbol matches the greek letter of Delta", 4, "Science");
        Question scifive = new Question("What is the Scientific name for the study of human behaviour?", 2, "Science");

        Question natone = new Question("What Animal is the Symbol of the US republican party?", 1, "Nature");
        Question nattwo = new Question("Which bird is described as a thief and is thought by some to bring bad luck?", 3, "Nature");
        Question natthree = new Question("What is the most intelligent family of birds with respect to reasoning power?", 4, "Nature");
        Question natfour = new Question("Which living bird has the longest wingspan", 3, "Nature");
        Question natfive = new Question("Which bird is the international symbol of happiness?", 2, "Nature");

        zillionaiireQuestions.add(gkone);
        zillionaiireQuestions.add(gktwo);
        zillionaiireQuestions.add(gkthree);
        zillionaiireQuestions.add(gkfour);
        zillionaiireQuestions.add(gkfive);

        zillionaiireQuestions.add(scione);
        zillionaiireQuestions.add(scitwo);
        zillionaiireQuestions.add(scithree);
        zillionaiireQuestions.add(scifour);
        zillionaiireQuestions.add(scifive);

        zillionaiireQuestions.add(natone);
        zillionaiireQuestions.add(nattwo);
        zillionaiireQuestions.add(natthree);
        zillionaiireQuestions.add(natfour);
        zillionaiireQuestions.add(natfive);

        printQuestions();

    }

    public void printQuestions(){
        for (Question question : zillionaiireQuestions); {
            System.out.println(zillionaiireQuestions);
        }
    }

    public static void main(String[] args) {
        new Questions();
    }
}
