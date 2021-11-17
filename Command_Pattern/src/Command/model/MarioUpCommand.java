package Command.model;

import Command.interfaces.Command;

public class MarioUpCommand implements Command {

    private MarioCharacterReceiver marioCharacter;

    public MarioUpCommand(MarioCharacterReceiver marioCharacter) {
        this.marioCharacter = marioCharacter;
    }

    @Override
    public void execute() {
        marioCharacter.moveUp();

    }
}
