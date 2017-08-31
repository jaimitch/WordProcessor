package com.theironyard.installparty;

public enum Status {

        INITIAL("initial"),
        ASSIGNED("assigned"),
        IN_PROGRESS("inProgress"),
        DONE("done");

        private String dontHaveGoodName;

        Status(String dontHaveGoodName) {this.dontHaveGoodName = dontHaveGoodName;}

        public String getDontHaveGoodName() {return dontHaveGoodName;}

}
