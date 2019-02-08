package Adapter.duixiang;

public class adapter  implements PS2{

	
	public adapter(USB usb) {
		this.usb=usb;
	}

	USB usb;
	
	@Override
	public void isPs2() {
     usb.isUsb();
	}

}
