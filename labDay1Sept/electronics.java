package com.labDay1Sept;

public class electronics {
	//declaring variabes
		int eid,ePrice;
		String  eModel,eName,eCompany;
		/**making constructors
		 * @param eid
		 * @param ePrice
		 * @param eModel
		 * @param eName
		 * @param eCompany
		 */
		public electronics(int eid, String eName, String eCompany, String eModel,int ePrice) {
			super();
			this.eid = eid;
			this.ePrice = ePrice;
			this.eModel = eModel;
			this.eName = eName;
			this.eCompany = eCompany;
		}
		/**
		 * @return the ePrice
		 */
		public int getePrice() {
			return ePrice;
		}
		/**
		 * @param ePrice the ePrice to set
		 */
		public void setePrice(int ePrice) {
			this.ePrice = ePrice;
		}

}
