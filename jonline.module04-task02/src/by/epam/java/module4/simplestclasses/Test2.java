package by.epam.java.module4.simplestclasses;

/*Создайте класс Test2 с двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор,
 * инициализирующий члены класса по умолчанию. Добавьте set- и  get- методы для полей экземпляра
 * класса*/
public class Test2 {

	private int firstVar;
	private int secondVar;

	Test2() {
		firstVar = 0;
		secondVar = 0;
	}

	Test2(int firstVar, int secondVar) {
		this.firstVar = firstVar;
		this.secondVar = secondVar;
	}

	public void setFirstVar(int firstVar) {
		this.firstVar = firstVar;

	}

	public int getFirstVar() {
		return firstVar;
	}

	public void setSecondVar(int secondVar) {
		this.secondVar = secondVar;
	}

	public int getSecondVar() {
		return secondVar;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		Test2 test2 = (Test2) obj;
		if (test2.firstVar != firstVar)
			return false;
		if (test2.secondVar != secondVar)
			return false;

		return true;

	}

	@Override

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + firstVar;
		result = prime * result + secondVar;
		return result;

	}

	@Override

	public String toString() {
		return getClass().getSimpleName() + " [ firstVar = " + firstVar + ", secondVar = " + secondVar + " ]";
	}

}
