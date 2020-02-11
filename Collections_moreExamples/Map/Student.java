package com.Map;

public class Student {
        private int id;
        private String name;
        private String branch;
        private double fee;

        public Student(int id, String name, String branch, double fee) {
            this.id = id;
            this.name = name;
            this.branch = branch;
            this.fee = fee;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", branch='" + branch + '\'' +
                    ", fee=" + fee +
                    '}';
        }
    }