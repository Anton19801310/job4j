package ru.job4j.condition;

/**
* Package for condition task.
* Полупериметр треугольника по длинам сторон.
* @author Anton Lyalin 
* @version $Id$
* @since 0.1
*/

public class Triangle{
	private Point a;
	private Point b;
	private Point c;

	public Triangle (Point a, Point b, Point c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * Метод вычисления полупериметра треугольника.
	 * @param ab расстояние между точками ab.
	 * @param ac расстояние между точками ac.
	 * @param bc расстояние между точками bc.
	 * @return Полупериметр.
	 */
	public double period(double ab, double ac, double bc){
		return (a.distanceTo(b)+ a.distanceTo(c) + b.distanceTo(c)) / 2;
	}

	/**
	 * Метод должен вычислить площадь треугольника.
	 *
	 * @return вернуть площадь, если треугольник существует, или -1, если треугольника нет.
	 */
	public double area(){
		double rsl = -1;
		double ab = this.a.distanceTo(this.b);
		double ac = this.a.distanceTo(this.c);
		double bc = this.b.distanceTo(this.c);
		double p = this.period(ab, ac, bc);
		if(this.exist(ab, ac, bc)){
			Math.sqrt(p*(p - ab)*(p - ac)*(p - bc));
			rsl = Math.sqrt(p*(p - ab)*(p - ac)*(p - bc));;
		}
		return rsl;
	}

	/**
	 * Метод проверяет, можно ли построить треугольник с такими длинами сторон.
	 *
	 * @param ab длина от точки a b.
	 * @param ac длина от точки a c.
	 * @param bc длина от точки b c.
	 * @return
	 */
	private boolean exist(double ab, double ac, double bc){
		boolean result = true;
	    if((ab + ac) < bc && (ab + bc) < ac && (ac + bc) < ab) {
	    	result = false;
        }
		return result;

	}
}
