package vikingbot2013.commands;


/**
 * This is the Command Factory!
 * Use the enumerator to create commands
 * Then pass those commands to our robotCommander
 * @author Cole
 *
 */
public enum Cmd {
	
	/*
	 * @see DriveTrain
	 */
    DRIVE_W(CmdType.CHANGE_DIRECTION, -1f),
    DRIVE_NWW(CmdType.CHANGE_DIRECTION, -.7f),
    DRIVE_NW(CmdType.CHANGE_DIRECTION, -.3f),
    DRIVE_N(CmdType.CHANGE_DIRECTION, 0f),
    DRIVE_NE(CmdType.CHANGE_DIRECTION, .3f),
    DRIVE_NEE(CmdType.CHANGE_DIRECTION, .7f),
    DRIVE_E(CmdType.CHANGE_DIRECTION, 1f),
    DRIVE_STOP(CmdType.CHANGE_SPEED, 0),
    DRIVE_SPEED_20(CmdType.CHANGE_SPEED, .2f),
    DRIVE_SPEED_40(CmdType.CHANGE_SPEED, .4f),
    DRIVE_SPEED_60(CmdType.CHANGE_SPEED, .6f),
    DRIVE_SPEED_80(CmdType.CHANGE_SPEED, .8f),
    DRIVE_SPEED_100(CmdType.CHANGE_SPEED, 1),
    ;

    private final float value;
    private final CmdType type;
    
    private Cmd(final CmdType commandType) {
    	this(commandType, 1);
    }
    private Cmd(final CmdType commandType, final float commandValue) {
        this.value = commandValue;
        this.type = commandType;
    }
    
    public CmdType getCommandType(){
    	return type;
    }
    
    public float getCommandValue(){
    	return value;
    }
}
