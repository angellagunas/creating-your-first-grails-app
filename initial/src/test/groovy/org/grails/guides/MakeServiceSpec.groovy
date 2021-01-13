package org.grails.guides

import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class MakeServiceSpec extends Specification implements ServiceUnitTest<MakeService>{

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
