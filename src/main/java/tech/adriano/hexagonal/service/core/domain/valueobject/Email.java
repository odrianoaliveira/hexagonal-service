package tech.adriano.hexagonal.service.core.domain.valueobject;

public final class Email {
	
	private final String value;
	private final String type;
	
	
	public Email(String value, String type) {
		this.value = value;
		this.type = type;
	}
	
	
	public static EmailBuilder builder() {
		return new EmailBuilder();
	}
	
	
	private static class EmailBuilder {
		
		private String value;
		private String type;
		
		
		public EmailBuilder value(String value) {
			this.value = value;
			return this;
		}
		
		
		public EmailBuilder type(String type) {
			this.type = type;
			return this;
		}
		
		
		public Email build() {
			return new Email(value, type);
		}
	}
}
