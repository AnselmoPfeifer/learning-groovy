package com.anselmopfeifer.webservice
@Grab(group='org.codehaus.groovy.modules', module='groovyws', version='0.5.2')

/**
 * Created by anselmo on 04/09/16.
 */

import groovy.net.soap.SoapServer

def server = new SoapServer("localhost", 6980)
println "Starting Web Service"
server.setNode("Calculo")
server.start()
