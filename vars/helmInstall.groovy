#!/usr/bin/env groovy

def call(String kuberContext) {
  sh "helm install --wait --debug --verify --kube-context ${kuberContext} helm_package"
}