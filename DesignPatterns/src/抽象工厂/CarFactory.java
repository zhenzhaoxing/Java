package 抽象工厂;

public interface CarFactory {
	//接口的实现
	Engine createEngine();
	Seat createSeat();
	Tyre createTyre();
}

