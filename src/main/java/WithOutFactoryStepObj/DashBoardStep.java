package WithOutFactoryStepObj;

import WithOutFactoryPageObj.DashBoardPage;

public class DashBoardStep extends DashBoardPage {

    public DashBoardStep movieClick(){
        dashboardFilm.click();
        return this;
    }

}
