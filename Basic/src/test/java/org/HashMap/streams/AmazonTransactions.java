package org.HashMap.streams;

import java.util.Objects;

public class AmazonTransactions {

int buyer_identity;
int seller_identity;
String transaction_amount;

public AmazonTransactions(int buyer_identity, int seller_identity, String transaction_amount) {
	this.buyer_identity = buyer_identity;
	this.seller_identity = seller_identity;
	this.transaction_amount = transaction_amount;
}

public int getBuyer_identity() {
	return buyer_identity;
}

public void setBuyer_identity(int buyer_identity) {
	this.buyer_identity = buyer_identity;
}

public int getSeller_identity() {
	return seller_identity;
}

public void setSeller_identity(int seller_identity) {
	this.seller_identity = seller_identity;
}

public String getTransaction_amount() {
	return transaction_amount;
}

public void setTransaction_amount(String transaction_amount) {
	this.transaction_amount = transaction_amount;
}

@Override
public boolean equals(Object o) {
	if (this == o) return true;
	if (o == null || getClass() != o.getClass()) return false;
	AmazonTransactions that = (AmazonTransactions) o;
	return getBuyer_identity() == that.getBuyer_identity() && getSeller_identity() == that.getSeller_identity() && Objects.equals(getTransaction_amount(), that.getTransaction_amount());
}

@Override
public int hashCode() {
	return Objects.hash(getBuyer_identity(), getSeller_identity(), getTransaction_amount());
}

@Override
public String toString() {
	return "AmazonTransactions{" +
			       "buyer_identity=" + buyer_identity +
			       ", seller_identity=" + seller_identity +
			       ", transaction_amount='" + transaction_amount + '\'' +
			       '}';
}
}
