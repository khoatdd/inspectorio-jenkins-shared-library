#!/usr/bin/env groovy

def call(String kuberConfig, String kuberContext) {
  sh "helm install --wait --debug --verify --kubeconfig ${kuberConfig} --kube-context ${kuberContext} helm_package"
}