public class Task3 {
        public static void main(String[] args) {
            Employee[] employees = new Employee[5];

            employees[0] = new Employee("Иванов Петров", "Стример", "ivanov@mailbox.com", "892312312", 300000, 30);
            employees[1] = new Employee("Петров Дед", "Контрактник", "petrov@mailbox.com", "891234567", 480000, 45);
            employees[2] = new Employee("QWE Алексей", "Программист", "sidorov@mailbox.com", "890987654", 95000, 35);
            employees[3] = new Employee("jambo Елена", "Таксист", "kozlova@mailbox.com", "895678912", 3500, 50);
            employees[4] = new Employee("MC Дмитрий", "Трубочист", "morozov@mailbox.com", "896543219", 32000, 28);

            System.out.println("Информация о сотрудниках старше 40 лет:");
            for (Employee employee : employees) {
                if (employee.getAge() > 40) {
                    employee.printInfo();
                }
            }
        }
    }

    class Employee {
        public String fullName;
        public String position;
        public String email;
        public String phoneNumber;
        public double salary;
        public int age;

        public Employee(String fullName, String position, String email, String phoneNumber, double salary, int age) {
            this.fullName = fullName;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }

        public void printInfo() {
            System.out.println("ФИО: " + fullName);
            System.out.println("Должность: " + position);
            System.out.println("Email: " + email);
            System.out.println("Телефон: " + phoneNumber);
            System.out.println("Зарплата: " + salary);
            System.out.println("Возраст: " + age);
            System.out.println();
        }

        public int getAge() {
            return age;
        }
    }
