#!/usr/bin/env groovy

def call(String branch) {
    dir('docker_package') {
        git branch: "${branch}", url: 'https://github.com/khoatdd/devops-assignment-02.git'
    }
    dir('helm_package') {
        git branch: "${branch}", url: 'https://github.com/khoatdd/devops-assignment-03.git'
    }
}