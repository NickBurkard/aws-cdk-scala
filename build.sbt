lazy val awsCdkScala = project
  .in(file("."))
  .aggregate(
    `aws-cdk-scala`,
    codegen,
    `aws-cdk-scala-accessanalyzer`,
    `aws-cdk-scala-acmpca`,
    `aws-cdk-scala-amazonmq`,
    `aws-cdk-scala-amplify`,
    `aws-cdk-scala-apigateway`,
    `aws-cdk-scala-apigatewayv2`,
    `aws-cdk-scala-appconfig`,
    `aws-cdk-scala-appflow`,
    `aws-cdk-scala-appintegrations`,
    `aws-cdk-scala-applicationautoscaling`,
    `aws-cdk-scala-applicationinsights`,
    `aws-cdk-scala-appmesh`,
    `aws-cdk-scala-apprunner`,
    `aws-cdk-scala-appstream`,
    `aws-cdk-scala-appsync`,
    `aws-cdk-scala-aps`,
    `aws-cdk-scala-athena`,
    `aws-cdk-scala-auditmanager`,
    `aws-cdk-scala-autoscaling`,
    `aws-cdk-scala-autoscalingplans`,
    `aws-cdk-scala-backup`,
    `aws-cdk-scala-batch`,
    `aws-cdk-scala-budgets`,
    `aws-cdk-scala-cassandra`,
    `aws-cdk-scala-ce`,
    `aws-cdk-scala-certificatemanager`,
    `aws-cdk-scala-chatbot`,
    `aws-cdk-scala-cloud9`,
    `aws-cdk-scala-cloudformation`,
    `aws-cdk-scala-cloudfront`,
    `aws-cdk-scala-cloudtrail`,
    `aws-cdk-scala-cloudwatch`,
    `aws-cdk-scala-codeartifact`,
    `aws-cdk-scala-codebuild`,
    `aws-cdk-scala-codecommit`,
    `aws-cdk-scala-codedeploy`,
    `aws-cdk-scala-codeguruprofiler`,
    `aws-cdk-scala-codegurureviewer`,
    `aws-cdk-scala-codepipeline`,
    `aws-cdk-scala-codestar`,
    `aws-cdk-scala-codestarconnections`,
    `aws-cdk-scala-codestarnotifications`,
    `aws-cdk-scala-cognito`,
    `aws-cdk-scala-config`,
    `aws-cdk-scala-connect`,
    `aws-cdk-scala-cur`,
    `aws-cdk-scala-customerprofiles`,
    `aws-cdk-scala-databrew`,
    `aws-cdk-scala-datapipeline`,
    `aws-cdk-scala-datasync`,
    `aws-cdk-scala-dax`,
    `aws-cdk-scala-detective`,
    `aws-cdk-scala-devopsguru`,
    `aws-cdk-scala-directoryservice`,
    `aws-cdk-scala-dlm`,
    `aws-cdk-scala-dms`,
    `aws-cdk-scala-docdb`,
    `aws-cdk-scala-dynamodb`,
    `aws-cdk-scala-ec2`,
    `aws-cdk-scala-ecr`,
    `aws-cdk-scala-ecs`,
    `aws-cdk-scala-efs`,
    `aws-cdk-scala-eks`,
    `aws-cdk-scala-elasticache`,
    `aws-cdk-scala-elasticbeanstalk`,
    `aws-cdk-scala-elasticloadbalancing`,
    `aws-cdk-scala-elasticloadbalancingv2`,
    `aws-cdk-scala-elasticsearch`,
    `aws-cdk-scala-emr`,
    `aws-cdk-scala-emrcontainers`,
    `aws-cdk-scala-events`,
    `aws-cdk-scala-eventschemas`,
    `aws-cdk-scala-finspace`,
    `aws-cdk-scala-fis`,
    `aws-cdk-scala-fms`,
    `aws-cdk-scala-frauddetector`,
    `aws-cdk-scala-fsx`,
    `aws-cdk-scala-gamelift`,
    `aws-cdk-scala-globalaccelerator`,
    `aws-cdk-scala-glue`,
    `aws-cdk-scala-greengrass`,
    `aws-cdk-scala-greengrassv2`,
    `aws-cdk-scala-groundstation`,
    `aws-cdk-scala-guardduty`,
    `aws-cdk-scala-healthlake`,
    `aws-cdk-scala-iam`,
    `aws-cdk-scala-imagebuilder`,
    `aws-cdk-scala-inspector`,
    `aws-cdk-scala-iot`,
    `aws-cdk-scala-iot1click`,
    `aws-cdk-scala-iotanalytics`,
    `aws-cdk-scala-iotcoredeviceadvisor`,
    `aws-cdk-scala-iotevents`,
    `aws-cdk-scala-iotfleethub`,
    `aws-cdk-scala-iotsitewise`,
    `aws-cdk-scala-iotthingsgraph`,
    `aws-cdk-scala-iotwireless`,
    `aws-cdk-scala-ivs`,
    `aws-cdk-scala-kendra`,
    `aws-cdk-scala-kinesis`,
    `aws-cdk-scala-kinesisanalytics`,
    `aws-cdk-scala-kinesisfirehose`,
    `aws-cdk-scala-kms`,
    `aws-cdk-scala-lakeformation`,
    `aws-cdk-scala-lambda`,
    `aws-cdk-scala-licensemanager`,
    `aws-cdk-scala-lightsail`,
    `aws-cdk-scala-location`,
    `aws-cdk-scala-logs`,
    `aws-cdk-scala-lookoutequipment`,
    `aws-cdk-scala-lookoutmetrics`,
    `aws-cdk-scala-lookoutvision`,
    `aws-cdk-scala-macie`,
    `aws-cdk-scala-managedblockchain`,
    `aws-cdk-scala-mediaconnect`,
    `aws-cdk-scala-mediaconvert`,
    `aws-cdk-scala-medialive`,
    `aws-cdk-scala-mediapackage`,
    `aws-cdk-scala-mediastore`,
    `aws-cdk-scala-memorydb`,
    `aws-cdk-scala-msk`,
    `aws-cdk-scala-mwaa`,
    `aws-cdk-scala-neptune`,
    `aws-cdk-scala-networkfirewall`,
    `aws-cdk-scala-networkmanager`,
    `aws-cdk-scala-nimblestudio`,
    `aws-cdk-scala-opensearchservice`,
    `aws-cdk-scala-opsworks`,
    `aws-cdk-scala-opsworkscm`,
    `aws-cdk-scala-pinpoint`,
    `aws-cdk-scala-pinpointemail`,
    `aws-cdk-scala-qldb`,
    `aws-cdk-scala-quicksight`,
    `aws-cdk-scala-ram`,
    `aws-cdk-scala-rds`,
    `aws-cdk-scala-redshift`,
    `aws-cdk-scala-resourcegroups`,
    `aws-cdk-scala-robomaker`,
    `aws-cdk-scala-route53`,
    `aws-cdk-scala-route53recoverycontrol`,
    `aws-cdk-scala-route53recoveryreadiness`,
    `aws-cdk-scala-route53resolver`,
    `aws-cdk-scala-s3`,
    `aws-cdk-scala-s3objectlambda`,
    `aws-cdk-scala-s3outposts`,
    `aws-cdk-scala-sagemaker`,
    `aws-cdk-scala-sam`,
    `aws-cdk-scala-sdb`,
    `aws-cdk-scala-secretsmanager`,
    `aws-cdk-scala-securityhub`,
    `aws-cdk-scala-servicecatalog`,
    `aws-cdk-scala-servicecatalogappregistry`,
    `aws-cdk-scala-servicediscovery`,
    `aws-cdk-scala-ses`,
    `aws-cdk-scala-signer`,
    `aws-cdk-scala-sns`,
    `aws-cdk-scala-sqs`,
    `aws-cdk-scala-ssm`,
    `aws-cdk-scala-ssmcontacts`,
    `aws-cdk-scala-ssmincidents`,
    `aws-cdk-scala-sso`,
    `aws-cdk-scala-stepfunctions`,
    `aws-cdk-scala-synthetics`,
    `aws-cdk-scala-timestream`,
    `aws-cdk-scala-transfer`,
    `aws-cdk-scala-waf`,
    `aws-cdk-scala-wafv2`,
    `aws-cdk-scala-workspaces`,
    `aws-cdk-scala-xray`
  )

lazy val `aws-cdk-scala` = project
  .withCdk()
  .enablePublishing()

lazy val codegen = project
  .withCdk()
  .withGuava()
  .disablePublishing()

lazy val `aws-cdk-scala-accessanalyzer` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-acmpca` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-amazonmq` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-amplify` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-apigateway` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-apigatewayv2` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-appconfig` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-appflow` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-appintegrations` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-applicationautoscaling` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-applicationinsights` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-appmesh` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-apprunner` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-appstream` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-appsync` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-aps` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-athena` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-auditmanager` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-autoscaling` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-autoscalingplans` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-backup` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-batch` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-budgets` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cassandra` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ce` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-certificatemanager` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-chatbot` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cloud9` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cloudformation` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cloudfront` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cloudtrail` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cloudwatch` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codeartifact` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codebuild` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codecommit` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codedeploy` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codeguruprofiler` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codegurureviewer` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codepipeline` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codestar` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codestarconnections` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codestarnotifications` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cognito` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-config` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-connect` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cur` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-customerprofiles` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-databrew` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-datapipeline` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-datasync` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-dax` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-detective` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-devopsguru` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-directoryservice` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-dlm` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-dms` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-docdb` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-dynamodb` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ec2` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ecr` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ecs` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-efs` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-eks` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-elasticache` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-elasticbeanstalk` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-elasticloadbalancing` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-elasticloadbalancingv2` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-elasticsearch` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-emr` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-emrcontainers` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-events` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-eventschemas` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-finspace` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-fis` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-fms` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-frauddetector` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-fsx` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-gamelift` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-globalaccelerator` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-glue` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-greengrass` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-greengrassv2` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-groundstation` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-guardduty` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-healthlake` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iam` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-imagebuilder` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-inspector` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iot` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iot1click` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotanalytics` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotcoredeviceadvisor` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotevents` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotfleethub` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotsitewise` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotthingsgraph` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotwireless` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ivs` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-kendra` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-kinesis` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-kinesisanalytics` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-kinesisfirehose` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-kms` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lakeformation` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lambda` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-licensemanager` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lightsail` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-location` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-logs` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lookoutequipment` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lookoutmetrics` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lookoutvision` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-macie` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-managedblockchain` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-mediaconnect` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-mediaconvert` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-medialive` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-mediapackage` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-mediastore` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-memorydb` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-msk` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-mwaa` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-neptune` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-networkfirewall` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-networkmanager` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-nimblestudio` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-opensearchservice` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-opsworks` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-opsworkscm` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-pinpoint` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-pinpointemail` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-qldb` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-quicksight` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ram` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-rds` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-redshift` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-resourcegroups` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-robomaker` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-route53` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-route53recoverycontrol` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-route53recoveryreadiness` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-route53resolver` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-s3` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-s3objectlambda` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-s3outposts` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-sagemaker` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-sam` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-sdb` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-secretsmanager` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-securityhub` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-servicecatalog` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-servicecatalogappregistry` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-servicediscovery` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ses` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-signer` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-sns` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-sqs` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ssm` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ssmcontacts` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ssmincidents` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-sso` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-stepfunctions` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-synthetics` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-timestream` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-transfer` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-waf` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-wafv2` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-workspaces` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-xray` = project
  .withCdk()
  .enablePublishing()