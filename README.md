# Jenkins_shared_linrary

![alt text](https://github.com/abhishekbhogal/Jenkins_shared_linrary/blob/jenkins-pipeline-prod/356a6f69-681d-4174-8013-18ca95c5eae1.avif?raw=true)

# Terraform Provisioned AWS Infrastructure with Jenkins, SonarQube, and AKS Integration

This project automates the provisioning of infrastructure on AWS using Terraform, sets up a Jenkins cluster for CI/CD pipelines, integrates SonarQube for code analysis, builds code using npm, installs dependencies, and deploys the built code and Docker images to an AKS Kubernetes cluster. Additionally, it includes Slack integration for receiving build status notifications.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Overview

This project aims to streamline the development and deployment process by automating infrastructure provisioning, code analysis, and deployment tasks. With Terraform, AWS resources are provisioned efficiently, Jenkins manages continuous integration and continuous deployment pipelines, SonarQube ensures code quality, and AKS Kubernetes facilitates scalable and reliable deployment of applications.

## Features

- Infrastructure provisioning on AWS with Terraform.
- Jenkins cluster setup for CI/CD pipelines.
- Integration of SonarQube for code analysis.
- Building code using npm and installing necessary dependencies.
- Deployment of built code and Docker images to an AKS Kubernetes cluster.
- Slack integration for receiving build status notifications.

## Prerequisites

Before setting up and using this project, ensure you have the following prerequisites:

- AWS account with appropriate permissions for Terraform.
- Docker installed on your local machine for building images.
- Access to an AKS Kubernetes cluster.
- Slack workspace and permissions to integrate notifications.

## Setup

1. **Clone the Repository**: 
   ```bash
   git clone https://github.com/abhishekbhogal/Jenkins_shared_linrary.git

2. **Configure Terraform**: 
- Navigate to the terraform/ directory.
- Update terraform.tfvars with your AWS credentials and configuration.
3. **Configure SonarQube**: 
- Configure SonarQube to integrate with Jenkins for code analysis.
4. **Integrate Slack**: 
- Follow the instructions to integrate Slack with Jenkins for build notifications.
5. **Deploy to AKS**: 
- Update Kubernetes deployment files in kubernetes/ directory as per your application requirements.
- Deploy the application to AKS.


Usage

1. **Code Development**
- Develop your application code and push changes to the repository.

2. **Continuous Integration**
- Jenkins will automatically trigger builds upon code changes
  
3. **Code Analysis**
- SonarQube will analyze the code for quality and security issues**

4. **Deployment**
- Upon successful code analysis, Jenkins will deploy the application to the AKS Kubernetes cluster

5. **Notifications**
- Slack will provide notifications regarding build status and deployment updates.

