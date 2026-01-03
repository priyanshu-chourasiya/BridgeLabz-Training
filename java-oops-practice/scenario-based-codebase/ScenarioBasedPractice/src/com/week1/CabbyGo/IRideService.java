package com.week1.CabbyGo;

public interface IRideService {
	void bookRide(int distance);
	void endRide();
	void CalculateRate(int basefare);
}
