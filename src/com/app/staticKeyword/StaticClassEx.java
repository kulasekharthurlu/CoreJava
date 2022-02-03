package com.app.staticKeyword;

import org.apache.log4j.Logger;

public class StaticClassEx {
	public class Test {
		protected int id;
	}

	public static class Emp {
		private int eId = 2344;
		private String eName = "kulasekhar";
		// static class inside varables all are static varables.
		private static Logger log = Logger.getLogger(Emp.class);

		public void showIdName(int id, String name) {
			log.info(eId + " " + eName);
			log.info("Employee id:" + id);
			log.info("Employee id:" + name);

		}
	}

	public static void main(String[] args) {
		StaticClassEx.Emp obj = new StaticClassEx.Emp();
		obj.showIdName(3465, "geyru");
	}

}

class Em {
	private static final Logger log = Logger.getLogger(Em.class);

	public static void main(String[] args) {
		log.info("grehej");
	}
}
