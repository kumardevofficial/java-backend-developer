package com.java.onlinesopping;

public class Product {

	String productName ;
	double productPrice;
	String productCategory;
	
   Product(String _productName, double _productPrice, String _productCategory){
	   this.productName = _productName;
	   this.productPrice = _productPrice;
	   this.productCategory = _productCategory;
   }
   
   void showProductInfo()
   {
	   System.out.println(
			   " \n Product Name :" + this.productName +
			   " \n Product Price : " + this.productPrice +
			   " \n Product category : " + this.productCategory
			   );
   }
}

