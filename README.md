# volunt-be
Basic service that validates that the combination of user+pwd exists in a database table. The usage of this project is primarly to be used in [mlopezsoto/aws-cdk-volunt-ecs](https://github.com/mlopezsoto/aws-cdk-volunt-ecs)

## Enpoints
### List all users and passwords
/user/listAll

### validates that user and password combination is valid 
/user/validateCredentials?username=<username>&password=<password>
