package marauroa.server.game.db;

/**
 * This exception notify about any generic database exception, mainly about SQLExceptions.
 * 
 * @author miguel
 *
 */
public class GenericDatabaseException extends Exception {
	private static final long serialVersionUID = -2764012454573117520L;

	public GenericDatabaseException(Throwable cause) {
		super(cause);
	}

	public GenericDatabaseException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Do not use
	 * <code>throw new GenericDatabaseException(cause.getMessage())</code>.
	 * use: <code>throw new GenericDatabaseException(cause)</code>.
	 */
	GenericDatabaseException(String message) {
		super(message);
	}
}