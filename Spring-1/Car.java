package com.zck.dao;

public class Car {

        
        public String getCompany() {
                return company;
        }
        public void setCompany(String company) {
                this.company = company;
        }
        public String getBrand() {
                return brand;
        }
        public void setBrand(String brand) {
                this.brand = brand;
        }
        public int getMaxSpeed() {
                return maxSpeed;
        }
        public void setMaxSpeed(int maxSpeed) {
                this.maxSpeed = maxSpeed;
        }
        public float getPrice() {
                return price;
        }
        public void setPrice(float price) {
                this.price = price;
        }
        private String company;
        private String brand;
        private int maxSpeed;
        private float price;
       
        @Override
        public String toString() {
                return "Car [company=" + company + ", brand=" + brand + ", maxSpeed=" + maxSpeed + ", price=" + price
                                + "]";
        }
      
       
}
