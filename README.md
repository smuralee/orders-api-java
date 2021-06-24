# Todos API

- Endpoint: `/`
  - Supported operations: **GET**
  - Returns the `remote address` and `hostname`
- Endpoint : `/todos`
  - Supported operations : **GET**, **POST**, **PUT**, **DELETE**

## CodeBuild and CodeDeploy specifications
* [buildspec.yml](buildspec.yml)
* [taskdef.json](taskdef.json)

## ENV variables needed for the CodeBuild
* **DOCKER_HUB_SECRET_ARN** : DockerHub secret arn
* **ACCOUNT_ID** : AWS Account ID
* **TASK_EXECUTION_ARN** : ECS task execution role
* **CODEGURU_ROLE_ARN** : Cross-account role for CodeGuru analysis
  * Example:
    * Workload account: 123456789012
    * Codeguru account: 112233445566
    * Role and trust policies in Codeguru account:
      * `arn:aws:iam::aws:policy/AmazonCodeGuruProfilerAgentAccess`
      * ```json
        {
          "Version": "2012-10-17",
          "Statement": 
          [
            {
            "Effect": "Allow",
            "Principal": {
              "AWS": "arn:aws:iam::123456789012:root"
            },
            "Action": "sts:AssumeRole",
            "Condition": {} 
            }
          ]
        }
        ```
