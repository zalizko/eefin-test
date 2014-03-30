package ee.zalizko.george.eefin.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import ee.zalizko.george.eefin.model.EmtaFieAndmedParing;
import ee.zalizko.george.eefin.model.EmtaFieAndmedVastus;
import ee.zalizko.george.eefin.service.SomeService;

/**
 * @author Georgii Zalizko
 * 
 */
@Endpoint
public class FieDataEndpoint {

	private static final String NAMESPACE_URI = "http://producers.emta.xtee.riik.ee/producer/emta";

	@Autowired
	SomeService someService;

	@ResponsePayload
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "emtaFieAndmed_paring")
	public JAXBElement<EmtaFieAndmedVastus> handleHolidayRequest(@RequestPayload JAXBElement<EmtaFieAndmedParing> requrest)
			throws Exception {

		EmtaFieAndmedVastus emtaFieAndmedVastus = new EmtaFieAndmedVastus();
		emtaFieAndmedVastus.setKokku("kokku value");
		emtaFieAndmedVastus.setLisainfo(someService.getData());

		JAXBElement<EmtaFieAndmedVastus> response = new JAXBElement<EmtaFieAndmedVastus>(new QName("emtaFieAndmed_paring"),
				EmtaFieAndmedVastus.class, emtaFieAndmedVastus);
		return response;
	}

}
