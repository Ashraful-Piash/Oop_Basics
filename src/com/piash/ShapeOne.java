package com.piash;

 public abstract class ShapeOne {
     double dim1, dim2;

     ShapeOne(double dim1, double dim2){
         this.dim1 = dim1;
         this.dim2 = dim2;
     }

     abstract void area();

}
