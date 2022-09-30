package org.HashMap;

import java.util.Objects;

public class Transaction {

public String sender_user_id;

public String recipient_user_id;

public String amount_of_transaction;

public Transaction(String sender_user_id, String recipient_user_id, String amount_of_transaction) {
	this.sender_user_id = sender_user_id;
	this.recipient_user_id = recipient_user_id;
	this.amount_of_transaction = amount_of_transaction;
}

public Transaction() {
}

public String getSender_user_id() {
	return sender_user_id;
}

public void setSender_user_id(String sender_user_id) {
	this.sender_user_id = sender_user_id;
}

public String getRecipient_user_id() {
	return recipient_user_id;
}

public void setRecipient_user_id(String recipient_user_id) {
	this.recipient_user_id = recipient_user_id;
}

public String getAmount_of_transaction() {
	return amount_of_transaction;
}

public void setAmount_of_transaction(String amount_of_transaction) {
	this.amount_of_transaction = amount_of_transaction;
}

@Override
public boolean equals(Object o) {
	if (this == o) return true;
	if (!(o instanceof Transaction)) return false;
	Transaction that = (Transaction) o;
	return Objects.equals(getSender_user_id(), that.getSender_user_id()) &&
			       Objects.equals(getRecipient_user_id(), that.getRecipient_user_id()) &&
			       Objects.equals(getAmount_of_transaction(), that.getAmount_of_transaction());
	
}
/***
 * Overriding the hashcode() function
 */
@Override
public int hashCode() {
	return Objects.hash(getSender_user_id(), getRecipient_user_id(), getAmount_of_transaction());
}
}
