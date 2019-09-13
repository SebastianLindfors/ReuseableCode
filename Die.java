 /**
 *  Class Represents a Fair N-sided die (sides CANNOT be negative or zero).
 *
 *  Class can also be used to make dice with custom sides, in this case a
 *  String array should be used as constructor argument and a die with sides
 *  equal to the length of the array will be created.
 *
 *  Dice start with a random face up.
 *
 *  The dice can also be given specific names. The names are the only class
 *  variable that can be changed post constructor.
 *
 *  Ues the method roll() to roll the die, then use method getCurrentFace()
 *  or getCurrentFaceString() to read the die.
 *
 * **/
public class Die {

    // ---- Class Variables ---- //

    private int sides;
    private int currentFace;

    private String dieName;
    private String[] sideOptions;

    // ---- Constructors ---- //

    public Die (int numberOfSides) {

        if (numberOfSides < 1) { throw (new IllegalArgumentException("Cannot create die with less than 1 side")); };

        sides = numberOfSides;
        roll();

        dieName = "Fair " + sides + "-sided die";

        sideOptions = new String[sides];
        for (int i = 0; i < sides; i++) {
            sideOptions[i] = "" + (i + 1);
        }
    }

    public Die (int numberOfSides, String name) {

        if (numberOfSides < 1) { throw (new IllegalArgumentException("Cannot create die with less than 1 side")); };

        sides = numberOfSides;
        roll();

        dieName = name;

        sideOptions = new String[sides];
        for (int i = 0; i < sides; i++) {
            sideOptions[i] = "" + (i + 1);
        }
    }

    public Die(String[] sideText) {

        if (sideText.length < 1) { throw (new IllegalArgumentException("Cannot create die with less than 1 side")); };

        sides = sideText.length;
        roll();

        dieName = "A special " + sideText.length + "-sided die";
        sideOptions = sideText;

    }

    public Die(String[] sideText, String name) {

        if (sideText.length < 1) { throw (new IllegalArgumentException("Cannot create die with less than 1 side")); };

        sides = sideText.length;
        roll();

        dieName = name;
        sideOptions = sideText;
    }

    // ---- Methods ---- //
    public void roll() {

        currentFace = (int) (1 + Math.random()*sides);

    } //Sets the currentFace variable to a random face.

    private int getSides() {return sides;}
    private int getCurrentFace() {return currentFace;} //Use this to read a normal die

    public String getDieName() { return dieName;}
    public String getCurrentFaceString() { return sideOptions[currentFace]; } //Use this to read a special die

    public void setDieName(String newName) {

        dieName = newName;

    }


}
