package cc.wei.staticproxy;
/*
 * �н�
 */
public class Proxy implements Rent {
	private Host host;
	@Override
	public void rent() {
		fare();
		host.rent();
	}
	public void fare() {
		System.out.println("��ȡ�н��");
	}
	public void setHost(Host host) {
		this.host = host;
	}
}
