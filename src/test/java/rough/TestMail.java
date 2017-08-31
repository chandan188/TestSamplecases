package rough;

import javax.mail.internet.AddressException;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;

public class TestMail {
	
	public static void main(String[] args) throws AddressException, MessagingException {
		
		MonitoringMail mail = new MonitoringMail();
		mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
	
		
	}
	

}
