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
  .in(file("modules/aws-cdk-scala-accessanalyzer"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-acmpca` = project
  .in(file("modules/aws-cdk-scala-acmpca"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-alexa` = project
  .in(file("modules/aws-cdk-scala-alexa"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-amazonmq` = project
  .in(file("modules/aws-cdk-scala-amazonmq"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-amplify` = project
  .in(file("modules/aws-cdk-scala-amplify"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-apigateway` = project
  .in(file("modules/aws-cdk-scala-apigateway"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-apigatewayv2` = project
  .in(file("modules/aws-cdk-scala-apigatewayv2"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-appconfig` = project
  .in(file("modules/aws-cdk-scala-appconfig"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-appflow` = project
  .in(file("modules/aws-cdk-scala-appflow"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-appintegrations` = project
  .in(file("modules/aws-cdk-scala-appintegrations"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-applicationautoscaling` = project
  .in(file("modules/aws-cdk-scala-applicationautoscaling"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-applicationinsights` = project
  .in(file("modules/aws-cdk-scala-applicationinsights"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-appmesh` = project
  .in(file("modules/aws-cdk-scala-appmesh"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-apprunner` = project
  .in(file("modules/aws-cdk-scala-apprunner"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-appstream` = project
  .in(file("modules/aws-cdk-scala-appstream"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-appsync` = project
  .in(file("modules/aws-cdk-scala-appsync"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-aps` = project
  .in(file("modules/aws-cdk-scala-aps"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-athena` = project
  .in(file("modules/aws-cdk-scala-athena"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-auditmanager` = project
  .in(file("modules/aws-cdk-scala-auditmanager"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-autoscaling` = project
  .in(file("modules/aws-cdk-scala-autoscaling"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-autoscalingplans` = project
  .in(file("modules/aws-cdk-scala-autoscalingplans"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-backup` = project
  .in(file("modules/aws-cdk-scala-backup"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-batch` = project
  .in(file("modules/aws-cdk-scala-batch"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-budgets` = project
  .in(file("modules/aws-cdk-scala-budgets"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cassandra` = project
  .in(file("modules/aws-cdk-scala-cassandra"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ce` = project
  .in(file("modules/aws-cdk-scala-ce"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-certificatemanager` = project
  .in(file("modules/aws-cdk-scala-certificatemanager"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-chatbot` = project
  .in(file("modules/aws-cdk-scala-chatbot"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cloud9` = project
  .in(file("modules/aws-cdk-scala-cloud9"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cloudassembly` = project
  .in(file("modules/aws-cdk-scala-cloudassembly"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cloudformation` = project
  .in(file("modules/aws-cdk-scala-cloudformation"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cloudfront` = project
  .in(file("modules/aws-cdk-scala-cloudfront"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cloudtrail` = project
  .in(file("modules/aws-cdk-scala-cloudtrail"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cloudwatch` = project
  .in(file("modules/aws-cdk-scala-cloudwatch"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codeartifact` = project
  .in(file("modules/aws-cdk-scala-codeartifact"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codebuild` = project
  .in(file("modules/aws-cdk-scala-codebuild"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codecommit` = project
  .in(file("modules/aws-cdk-scala-codecommit"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codedeploy` = project
  .in(file("modules/aws-cdk-scala-codedeploy"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codeguruprofiler` = project
  .in(file("modules/aws-cdk-scala-codeguruprofiler"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codegurureviewer` = project
  .in(file("modules/aws-cdk-scala-codegurureviewer"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codepipeline` = project
  .in(file("modules/aws-cdk-scala-codepipeline"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codestar` = project
  .in(file("modules/aws-cdk-scala-codestar"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codestarconnections` = project
  .in(file("modules/aws-cdk-scala-codestarconnections"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-codestarnotifications` = project
  .in(file("modules/aws-cdk-scala-codestarnotifications"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cognito` = project
  .in(file("modules/aws-cdk-scala-cognito"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-config` = project
  .in(file("modules/aws-cdk-scala-config"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-connect` = project
  .in(file("modules/aws-cdk-scala-connect"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-core` = project
  .in(file("modules/aws-cdk-scala-core"))
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cur` = project
  .in(file("modules/aws-cdk-scala-cur"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-customerprofiles` = project
  .in(file("modules/aws-cdk-scala-customerprofiles"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-customresources` = project
  .in(file("modules/aws-cdk-scala-customresources"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-cxapi` = project
  .in(file("modules/aws-cdk-scala-cxapi"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-databrew` = project
  .in(file("modules/aws-cdk-scala-databrew"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-datapipeline` = project
  .in(file("modules/aws-cdk-scala-datapipeline"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-datasync` = project
  .in(file("modules/aws-cdk-scala-datasync"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-dax` = project
  .in(file("modules/aws-cdk-scala-dax"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-detective` = project
  .in(file("modules/aws-cdk-scala-detective"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-devopsguru` = project
  .in(file("modules/aws-cdk-scala-devopsguru"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-directoryservice` = project
  .in(file("modules/aws-cdk-scala-directoryservice"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-dlm` = project
  .in(file("modules/aws-cdk-scala-dlm"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-dms` = project
  .in(file("modules/aws-cdk-scala-dms"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-docdb` = project
  .in(file("modules/aws-cdk-scala-docdb"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-dynamodb` = project
  .in(file("modules/aws-cdk-scala-dynamodb"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ec2` = project
  .in(file("modules/aws-cdk-scala-ec2"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ecr` = project
  .in(file("modules/aws-cdk-scala-ecr"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ecs` = project
  .in(file("modules/aws-cdk-scala-ecs"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-efs` = project
  .in(file("modules/aws-cdk-scala-efs"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-eks` = project
  .in(file("modules/aws-cdk-scala-eks"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-elasticache` = project
  .in(file("modules/aws-cdk-scala-elasticache"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-elasticbeanstalk` = project
  .in(file("modules/aws-cdk-scala-elasticbeanstalk"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-elasticloadbalancing` = project
  .in(file("modules/aws-cdk-scala-elasticloadbalancing"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-elasticloadbalancingv2` = project
  .in(file("modules/aws-cdk-scala-elasticloadbalancingv2"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-elasticsearch` = project
  .in(file("modules/aws-cdk-scala-elasticsearch"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-emr` = project
  .in(file("modules/aws-cdk-scala-emr"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-emrcontainers` = project
  .in(file("modules/aws-cdk-scala-emrcontainers"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-events` = project
  .in(file("modules/aws-cdk-scala-events"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-eventschemas` = project
  .in(file("modules/aws-cdk-scala-eventschemas"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-finspace` = project
  .in(file("modules/aws-cdk-scala-finspace"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-fis` = project
  .in(file("modules/aws-cdk-scala-fis"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-fms` = project
  .in(file("modules/aws-cdk-scala-fms"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-frauddetector` = project
  .in(file("modules/aws-cdk-scala-frauddetector"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-fsx` = project
  .in(file("modules/aws-cdk-scala-fsx"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-gamelift` = project
  .in(file("modules/aws-cdk-scala-gamelift"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-globalaccelerator` = project
  .in(file("modules/aws-cdk-scala-globalaccelerator"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-glue` = project
  .in(file("modules/aws-cdk-scala-glue"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-greengrass` = project
  .in(file("modules/aws-cdk-scala-greengrass"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-greengrassv2` = project
  .in(file("modules/aws-cdk-scala-greengrassv2"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-groundstation` = project
  .in(file("modules/aws-cdk-scala-groundstation"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-guardduty` = project
  .in(file("modules/aws-cdk-scala-guardduty"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-healthlake` = project
  .in(file("modules/aws-cdk-scala-healthlake"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iam` = project
  .in(file("modules/aws-cdk-scala-iam"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-imagebuilder` = project
  .in(file("modules/aws-cdk-scala-imagebuilder"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-inspector` = project
  .in(file("modules/aws-cdk-scala-inspector"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iot` = project
  .in(file("modules/aws-cdk-scala-iot"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iot1click` = project
  .in(file("modules/aws-cdk-scala-iot1click"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotanalytics` = project
  .in(file("modules/aws-cdk-scala-iotanalytics"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotcoredeviceadvisor` = project
  .in(file("modules/aws-cdk-scala-iotcoredeviceadvisor"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotevents` = project
  .in(file("modules/aws-cdk-scala-iotevents"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotfleethub` = project
  .in(file("modules/aws-cdk-scala-iotfleethub"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotsitewise` = project
  .in(file("modules/aws-cdk-scala-iotsitewise"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotthingsgraph` = project
  .in(file("modules/aws-cdk-scala-iotthingsgraph"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-iotwireless` = project
  .in(file("modules/aws-cdk-scala-iotwireless"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ivs` = project
  .in(file("modules/aws-cdk-scala-ivs"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-kendra` = project
  .in(file("modules/aws-cdk-scala-kendra"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-kinesis` = project
  .in(file("modules/aws-cdk-scala-kinesis"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-kinesisanalytics` = project
  .in(file("modules/aws-cdk-scala-kinesisanalytics"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-kinesisfirehose` = project
  .in(file("modules/aws-cdk-scala-kinesisfirehose"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-kms` = project
  .in(file("modules/aws-cdk-scala-kms"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lakeformation` = project
  .in(file("modules/aws-cdk-scala-lakeformation"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lambda` = project
  .in(file("modules/aws-cdk-scala-lambda"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lambdalayer` = project
  .in(file("modules/aws-cdk-scala-lambdalayer"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-licensemanager` = project
  .in(file("modules/aws-cdk-scala-licensemanager"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lightsail` = project
  .in(file("modules/aws-cdk-scala-lightsail"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-location` = project
  .in(file("modules/aws-cdk-scala-location"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-logs` = project
  .in(file("modules/aws-cdk-scala-logs"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lookoutequipment` = project
  .in(file("modules/aws-cdk-scala-lookoutequipment"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lookoutmetrics` = project
  .in(file("modules/aws-cdk-scala-lookoutmetrics"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-lookoutvision` = project
  .in(file("modules/aws-cdk-scala-lookoutvision"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-macie` = project
  .in(file("modules/aws-cdk-scala-macie"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-managedblockchain` = project
  .in(file("modules/aws-cdk-scala-managedblockchain"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-mediaconnect` = project
  .in(file("modules/aws-cdk-scala-mediaconnect"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-mediaconvert` = project
  .in(file("modules/aws-cdk-scala-mediaconvert"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-medialive` = project
  .in(file("modules/aws-cdk-scala-medialive"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-mediapackage` = project
  .in(file("modules/aws-cdk-scala-mediapackage"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-mediastore` = project
  .in(file("modules/aws-cdk-scala-mediastore"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-memorydb` = project
  .in(file("modules/aws-cdk-scala-memorydb"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-msk` = project
  .in(file("modules/aws-cdk-scala-msk"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-mwaa` = project
  .in(file("modules/aws-cdk-scala-mwaa"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-neptune` = project
  .in(file("modules/aws-cdk-scala-neptune"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-networkfirewall` = project
  .in(file("modules/aws-cdk-scala-networkfirewall"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-networkmanager` = project
  .in(file("modules/aws-cdk-scala-networkmanager"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-nimblestudio` = project
  .in(file("modules/aws-cdk-scala-nimblestudio"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-opensearchservice` = project
  .in(file("modules/aws-cdk-scala-opensearchservice"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-opsworks` = project
  .in(file("modules/aws-cdk-scala-opsworks"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-opsworkscm` = project
  .in(file("modules/aws-cdk-scala-opsworkscm"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-pinpoint` = project
  .in(file("modules/aws-cdk-scala-pinpoint"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-pinpointemail` = project
  .in(file("modules/aws-cdk-scala-pinpointemail"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-pipelines` = project
  .in(file("modules/aws-cdk-scala-pipelines"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-qldb` = project
  .in(file("modules/aws-cdk-scala-qldb"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-quicksight` = project
  .in(file("modules/aws-cdk-scala-quicksight"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ram` = project
  .in(file("modules/aws-cdk-scala-ram"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-rds` = project
  .in(file("modules/aws-cdk-scala-rds"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-redshift` = project
  .in(file("modules/aws-cdk-scala-redshift"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-regioninfo` = project
  .in(file("modules/aws-cdk-scala-regioninfo"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-resourcegroups` = project
  .in(file("modules/aws-cdk-scala-resourcegroups"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-robomaker` = project
  .in(file("modules/aws-cdk-scala-robomaker"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-route53` = project
  .in(file("modules/aws-cdk-scala-route53"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-route53recoverycontrol` = project
  .in(file("modules/aws-cdk-scala-route53recoverycontrol"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-route53recoveryreadiness` = project
  .in(file("modules/aws-cdk-scala-route53recoveryreadiness"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-route53resolver` = project
  .in(file("modules/aws-cdk-scala-route53resolver"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-s3` = project
  .in(file("modules/aws-cdk-scala-s3"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-s3objectlambda` = project
  .in(file("modules/aws-cdk-scala-s3objectlambda"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-s3outposts` = project
  .in(file("modules/aws-cdk-scala-s3outposts"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-sagemaker` = project
  .in(file("modules/aws-cdk-scala-sagemaker"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-sam` = project
  .in(file("modules/aws-cdk-scala-sam"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-sdb` = project
  .in(file("modules/aws-cdk-scala-sdb"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-secretsmanager` = project
  .in(file("modules/aws-cdk-scala-secretsmanager"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-securityhub` = project
  .in(file("modules/aws-cdk-scala-securityhub"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-servicecatalog` = project
  .in(file("modules/aws-cdk-scala-servicecatalog"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-servicecatalogappregistry` = project
  .in(file("modules/aws-cdk-scala-servicecatalogappregistry"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-servicediscovery` = project
  .in(file("modules/aws-cdk-scala-servicediscovery"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ses` = project
  .in(file("modules/aws-cdk-scala-ses"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-signer` = project
  .in(file("modules/aws-cdk-scala-signer"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-sns` = project
  .in(file("modules/aws-cdk-scala-sns"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-sqs` = project
  .in(file("modules/aws-cdk-scala-sqs"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ssm` = project
  .in(file("modules/aws-cdk-scala-ssm"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ssmcontacts` = project
  .in(file("modules/aws-cdk-scala-ssmcontacts"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-ssmincidents` = project
  .in(file("modules/aws-cdk-scala-ssmincidents"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-sso` = project
  .in(file("modules/aws-cdk-scala-sso"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-stepfunctions` = project
  .in(file("modules/aws-cdk-scala-stepfunctions"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-synthetics` = project
  .in(file("modules/aws-cdk-scala-synthetics"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-timestream` = project
  .in(file("modules/aws-cdk-scala-timestream"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-transfer` = project
  .in(file("modules/aws-cdk-scala-transfer"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-waf` = project
  .in(file("modules/aws-cdk-scala-waf"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-wafv2` = project
  .in(file("modules/aws-cdk-scala-wafv2"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-workspaces` = project
  .in(file("modules/aws-cdk-scala-workspaces"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()

lazy val `aws-cdk-scala-xray` = project
  .in(file("modules/aws-cdk-scala-xray"))
  .dependsOn(`aws-cdk-scala-core`)
  .withCdk()
  .enablePublishing()
