#!/usr/bin/env groovy

def call(String name = 'human') {
    echo "This is from develop branch"
    echo "Hello, ${name}"
}