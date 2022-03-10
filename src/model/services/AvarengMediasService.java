package model.services;

public interface AvarengMediasService {
	
	double calcMedia( double noteOne, double noteTwo, double noteThree);
	
	double largerNote( double noteOne, double noteTwo, double noteThree);
	
	double smallNote( double noteOne, double noteTwo, double noteThree);

}
