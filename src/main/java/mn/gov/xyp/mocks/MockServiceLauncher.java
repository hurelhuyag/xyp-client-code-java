package mn.gov.xyp.mocks;

import jakarta.xml.ws.Endpoint;

public class MockServiceLauncher {

    public static void main(String[] args) {
        var metaEndpoint = Endpoint.publish("http://0.0.0.0:8001/meta", new MetaServiceMock());
        var citizenEndpoint = Endpoint.publish("http://0.0.0.0:8002/citizen", new CitizenServiceMock());
        var transportEndpoint = Endpoint.publish("http://0.0.0.0:8003/transport", new TransportServiceMock());
        var insuranceEndpoint = Endpoint.publish("http://0.0.0.0:8004/insurance", new InsuranceServiceMock());

        System.out.println("Mock services running");

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Mock services is being stopped");
            metaEndpoint.stop();
            citizenEndpoint.stop();
            transportEndpoint.stop();
            insuranceEndpoint.stop();
            System.out.println("Mock services stopped");
        }));
    }
}
