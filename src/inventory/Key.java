
package inventory;

public class Key extends Item {

    private boolean usedKey;

    public Key() {
        super("Key");
        usedKey = false;
    }

    @Override
    public void use() {

        if (Game.getCurrentRoom().getName().equals("Living Room")) {

            if (usedKey) {
                Game.print("The Office is already unlocked!");
            } else {
                Game.getCurrentRoom().getExit(1).setLocked(false);
                usedKey = true;
                Game.print("Using the key, you unlocked the Office!");
            }

        } else {
            Game.print("You cannot use the key here.");
        }
    }
}
