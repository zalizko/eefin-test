package ee.zalizko.george.eefin.service;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Service;

/**
 * @author Georgii Zalizko
 * 
 */
@Service
@Slf4j
public class SomeServiceImpl implements SomeService {

	public String getData() {
		log.debug("service impl getData");
		return "some data";
	}

}
