/**
 * Created by anselmo on 28/03/17.
 */

def allConfiguracoes() {
    [
            apache: [
                    domain: 'meudominio.com.br',
                    certificate : 'meudominio.com.br'
            ],

            java: [
                    version: '8',

            ],

            postgresql: [
                    database: 'meubanco',
                    user: 'postgres',
                    password: 'postgres'
            ]
    ]
}

Map mapConfigs = [:]

mapConfigs.put('Java Version', allConfiguracoes().java.version )
mapConfigs.put('Domain Apache', allConfiguracoes().apache.domain )
println mapConfigs