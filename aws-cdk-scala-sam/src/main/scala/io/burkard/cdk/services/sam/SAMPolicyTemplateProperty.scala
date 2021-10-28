package io.burkard.cdk.services.sam

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object SAMPolicyTemplateProperty {

  def apply(
    cloudFormationDescribeStacksPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty] = None,
    ec2DescribePolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty] = None,
    amiDescribePolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty] = None,
    snsPublishMessagePolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty] = None,
    cloudWatchPutMetricPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty] = None,
    rekognitionDetectOnlyPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty] = None,
    rekognitionNoDataAccessPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty] = None,
    elasticsearchHttpPostPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.DomainSAMPTProperty] = None,
    kinesisStreamReadPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty] = None,
    s3ReadPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty] = None,
    sesSendBouncePolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.IdentitySAMPTProperty] = None,
    s3CrudPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.BucketSAMPTProperty] = None,
    dynamoDbStreamReadPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.TableStreamSAMPTProperty] = None,
    rekognitionReadPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty] = None,
    sesEmailTemplateCrudPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty] = None,
    filterLogEventsPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.LogGroupSAMPTProperty] = None,
    kmsDecryptPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.KeySAMPTProperty] = None,
    dynamoDbReadPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.TableSAMPTProperty] = None,
    stepFunctionsExecutionPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.StateMachineSAMPTProperty] = None,
    lambdaInvokePolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.FunctionSAMPTProperty] = None,
    sesBulkTemplatedCrudPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.IdentitySAMPTProperty] = None,
    snsCrudPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.TopicSAMPTProperty] = None,
    dynamoDbCrudPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.TableSAMPTProperty] = None,
    kinesisCrudPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.StreamSAMPTProperty] = None,
    sqsSendMessagePolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty] = None,
    vpcAccessPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty] = None,
    rekognitionWriteOnlyAccessPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.CollectionSAMPTProperty] = None,
    sesCrudPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.IdentitySAMPTProperty] = None,
    rekognitionLabelsPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.EmptySAMPTProperty] = None,
    sqsPollerPolicy: Option[software.amazon.awscdk.services.sam.CfnFunction.QueueSAMPTProperty] = None
  ): software.amazon.awscdk.services.sam.CfnFunction.SAMPolicyTemplateProperty =
    (new software.amazon.awscdk.services.sam.CfnFunction.SAMPolicyTemplateProperty.Builder)
      .cloudFormationDescribeStacksPolicy(cloudFormationDescribeStacksPolicy.orNull)
      .ec2DescribePolicy(ec2DescribePolicy.orNull)
      .amiDescribePolicy(amiDescribePolicy.orNull)
      .snsPublishMessagePolicy(snsPublishMessagePolicy.orNull)
      .cloudWatchPutMetricPolicy(cloudWatchPutMetricPolicy.orNull)
      .rekognitionDetectOnlyPolicy(rekognitionDetectOnlyPolicy.orNull)
      .rekognitionNoDataAccessPolicy(rekognitionNoDataAccessPolicy.orNull)
      .elasticsearchHttpPostPolicy(elasticsearchHttpPostPolicy.orNull)
      .kinesisStreamReadPolicy(kinesisStreamReadPolicy.orNull)
      .s3ReadPolicy(s3ReadPolicy.orNull)
      .sesSendBouncePolicy(sesSendBouncePolicy.orNull)
      .s3CrudPolicy(s3CrudPolicy.orNull)
      .dynamoDbStreamReadPolicy(dynamoDbStreamReadPolicy.orNull)
      .rekognitionReadPolicy(rekognitionReadPolicy.orNull)
      .sesEmailTemplateCrudPolicy(sesEmailTemplateCrudPolicy.orNull)
      .filterLogEventsPolicy(filterLogEventsPolicy.orNull)
      .kmsDecryptPolicy(kmsDecryptPolicy.orNull)
      .dynamoDbReadPolicy(dynamoDbReadPolicy.orNull)
      .stepFunctionsExecutionPolicy(stepFunctionsExecutionPolicy.orNull)
      .lambdaInvokePolicy(lambdaInvokePolicy.orNull)
      .sesBulkTemplatedCrudPolicy(sesBulkTemplatedCrudPolicy.orNull)
      .snsCrudPolicy(snsCrudPolicy.orNull)
      .dynamoDbCrudPolicy(dynamoDbCrudPolicy.orNull)
      .kinesisCrudPolicy(kinesisCrudPolicy.orNull)
      .sqsSendMessagePolicy(sqsSendMessagePolicy.orNull)
      .vpcAccessPolicy(vpcAccessPolicy.orNull)
      .rekognitionWriteOnlyAccessPolicy(rekognitionWriteOnlyAccessPolicy.orNull)
      .sesCrudPolicy(sesCrudPolicy.orNull)
      .rekognitionLabelsPolicy(rekognitionLabelsPolicy.orNull)
      .sqsPollerPolicy(sqsPollerPolicy.orNull)
      .build()
}
