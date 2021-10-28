lazy val awsCdkScala = project
  .in(file("."))
  .aggregate(
    codegen,
    example,
    `aws-cdk-scala-accessanalyzer`,
    `aws-cdk-scala-acmpca`,
    `aws-cdk-scala-alexa`,
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
    `aws-cdk-scala-cloudassembly`,
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
    `aws-cdk-scala-core`,
    `aws-cdk-scala-cur`,
    `aws-cdk-scala-customerprofiles`,
    `aws-cdk-scala-customresources`,
    `aws-cdk-scala-cxapi`,
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
    `aws-cdk-scala-lambdalayer`,
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
    `aws-cdk-scala-pipelines`,
    `aws-cdk-scala-qldb`,
    `aws-cdk-scala-quicksight`,
    `aws-cdk-scala-ram`,
    `aws-cdk-scala-rds`,
    `aws-cdk-scala-redshift`,
    `aws-cdk-scala-regioninfo`,
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

lazy val codegen = project
  .withCdk()
  .withGuava()
  .disablePublishing()

lazy val example = project
  .dependsOn(
    `aws-cdk-scala-core`,
    `aws-cdk-scala-s3`
  )
  .withCdk()
  .disablePublishing()

lazy val `aws-cdk-scala-accessanalyzer` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-acmpca` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-alexa` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-amazonmq` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-amplify` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-apigateway` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-apigatewayv2` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-appconfig` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-appflow` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-appintegrations` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-applicationautoscaling` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-applicationinsights` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-appmesh` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-apprunner` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-appstream` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-appsync` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-aps` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-athena` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-auditmanager` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-autoscaling` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-autoscalingplans` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-backup` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-batch` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-budgets` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cassandra` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ce` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-certificatemanager` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-chatbot` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cloud9` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cloudassembly` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cloudformation` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cloudfront` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cloudtrail` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cloudwatch` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codeartifact` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codebuild` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codecommit` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codedeploy` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codeguruprofiler` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codegurureviewer` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codepipeline` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codestar` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codestarconnections` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codestarnotifications` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cognito` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-config` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-connect` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-core` = project
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cur` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-customerprofiles` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-customresources` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cxapi` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-databrew` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-datapipeline` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-datasync` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-dax` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-detective` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-devopsguru` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-directoryservice` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-dlm` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-dms` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-docdb` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-dynamodb` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ec2` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ecr` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ecs` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-efs` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-eks` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-elasticache` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-elasticbeanstalk` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-elasticloadbalancing` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-elasticloadbalancingv2` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-elasticsearch` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-emr` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-emrcontainers` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-events` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-eventschemas` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-finspace` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-fis` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-fms` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-frauddetector` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-fsx` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-gamelift` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-globalaccelerator` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-glue` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-greengrass` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-greengrassv2` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-groundstation` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-guardduty` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-healthlake` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iam` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-imagebuilder` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-inspector` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iot` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iot1click` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotanalytics` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotcoredeviceadvisor` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotevents` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotfleethub` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotsitewise` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotthingsgraph` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotwireless` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ivs` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-kendra` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-kinesis` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-kinesisanalytics` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-kinesisfirehose` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-kms` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lakeformation` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lambda` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lambdalayer` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-licensemanager` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lightsail` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-location` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-logs` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lookoutequipment` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lookoutmetrics` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lookoutvision` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-macie` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-managedblockchain` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-mediaconnect` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-mediaconvert` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-medialive` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-mediapackage` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-mediastore` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-memorydb` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-msk` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-mwaa` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-neptune` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-networkfirewall` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-networkmanager` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-nimblestudio` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-opensearchservice` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-opsworks` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-opsworkscm` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-pinpoint` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-pinpointemail` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-pipelines` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-qldb` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-quicksight` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ram` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-rds` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-redshift` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-regioninfo` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-resourcegroups` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-robomaker` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-route53` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-route53recoverycontrol` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-route53recoveryreadiness` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-route53resolver` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-s3` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-s3objectlambda` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-s3outposts` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-sagemaker` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-sam` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-sdb` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-secretsmanager` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-securityhub` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-servicecatalog` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-servicecatalogappregistry` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-servicediscovery` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ses` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-signer` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-sns` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-sqs` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ssm` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ssmcontacts` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ssmincidents` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-sso` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-stepfunctions` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-synthetics` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-timestream` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-transfer` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-waf` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-wafv2` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-workspaces` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-xray` = project
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()
