package cc.openhome;

public class MessageService {
	private Message[] fakeMessages;
	
	public MessageService() {
		//��Щ�����ݣ���װ��Щ�������������ݿ�
		fakeMessages = new Message[3];
		fakeMessages[0] = new Message("mike","mike's message!");
		fakeMessages[1] = new Message("tom","tom's message!");
		fakeMessages[2] = new Message("jerry","jerry's message!");
	}
	
	public Message[] getMessages() {
		return fakeMessages;
	}
}
