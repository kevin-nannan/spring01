package com.zck.dao;

import java.util.Map;

public class Person {
        private String name;
        private Integer age;
        private Map<String,Car> cars;
        public String getName() {
                return name;
        }
        public void setName(String name) {
                this.name = name;
        }
   
   
        public Map<String, Car> getCars() {
                return cars;
        }
        public void setCars(Map<String, Car> cars) {
                this.cars = cars;
        }
        public Integer getAge() {
                return age;
        }
        public void setAge(Integer age) {
                this.age = age;
        }
        @Override
        public String toString() {
                return "Person [name=" + name + ", age=" + age + ", cars=" + cars + "]";
        }
        
        
       
        
        
}
