package br.com.karanalpe.envioemail.test;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EnvioEmail {

	// referência: http://jamacedo.com/2010/02/envio-de-email-de-forma-facil-com-java/
	public static void main(String[] args) throws EmailException {
		sendEmail();

	}

	public static void sendEmail() throws EmailException {

		SimpleEmail email = new SimpleEmail();
		// Utilize o hostname do seu provedor de email
		System.out.println("alterando hostname...");
		email.setHostName("smtp.gmail.com");

		// Quando a porta utilizada não é a padrão (gmail = 465)
		email.setSmtpPort(465);

		// Adicione os destinatários
		email.addTo("karanalpe@hotmail.com");

		// Configure o seu email do qual enviará
		email.setFrom("karanalpe@gmail.com", "Karan User");

		// Adicione um assunto
		email.setSubject("Lembrete de senha");

		// Adicione a mensagem do email
		email.setMsg("Lembrete de senha karanalpe ");

		// Para autenticar no servidor é necessário chamar os dois métodos abaixo
		System.out.println("autenticando...");
		email.setSSL(true);
		email.setAuthentication("seuEmail@gmail.com", "suaSenha");
		System.out.println("enviando...");
		email.send();
		System.out.println("Email enviado!");
	}

}
