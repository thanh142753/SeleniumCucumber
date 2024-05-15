package widget.commonWidget;

public interface IApiWidget extends IBaseWidget{


    void getValueOfKeyFromRequest(String key, String endPoint);

    void verifyTheGetRequestWithTheParameter(String endPoint, String parameter);
}
