package com.eg.api.client.exception;
/**
 * Exception thrown when a test is not associated with a component type.
 * 
 * @author Murugapandian
 * @since 1.0
 *
 */
public class TestNotAssociatedException extends RuntimeException {
	private static final long serialVersionUID = -3207430024678111039L;

	public TestNotAssociatedException(String string) {
		super(string);
	}

}
