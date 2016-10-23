package modulo07
@Grab(group='org.codehaus.groovy.modules', module='groovyws', version='0.5.2')

/**
 * Created by anselmo on 04/09/16.
 */


def proxy = new SoapClient("http://localhost:6980/MathServiceInterface?wsdl")

def result = proxy.add(1.0, 2.0)
assert (result == 3.0)

result = proxy.square(3.0)
assert (result == 9.0)