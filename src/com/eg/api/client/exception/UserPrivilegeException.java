package com.eg.api.client.exception;

/**
 * Exception thrown when a user does not have the necessary privileges to perform an action.
 * {"code":400,"error":"User does not have privilege to execute this API"}
 * @since 2026-02-22
 * @author Pandian
 * @version 1.0
 */
public class UserPrivilegeException extends RuntimeException {

	public UserPrivilegeException(String string) {
		super(string);
	}

	private static final long serialVersionUID = 1L;

}
