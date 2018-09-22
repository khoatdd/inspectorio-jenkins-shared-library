#!/usr/bin/env groovy

def call(Closure body) {
    def dockerTool = tool 'docker-latest'
    withEnv(["DOCKER=${dockerTool}/bin"]) {
        body()
    }
}