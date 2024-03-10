package Chap3;

public class GenericClassTester {
    static class GenericClass<T>{
        private T xyz;

        public GenericClass(T xyz) {
            this.xyz = xyz;
        }

        public T getXyz() {
            return xyz;
        }
    }
}
