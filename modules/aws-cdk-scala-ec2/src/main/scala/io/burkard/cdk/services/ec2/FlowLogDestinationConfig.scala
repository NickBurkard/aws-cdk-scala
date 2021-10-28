package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FlowLogDestinationConfig {

  def apply(
    logGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    s3Bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    iamRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    logDestinationType: Option[software.amazon.awscdk.services.ec2.FlowLogDestinationType] = None,
    keyPrefix: Option[String] = None
  ): software.amazon.awscdk.services.ec2.FlowLogDestinationConfig =
    (new software.amazon.awscdk.services.ec2.FlowLogDestinationConfig.Builder)
      .logGroup(logGroup.orNull)
      .s3Bucket(s3Bucket.orNull)
      .iamRole(iamRole.orNull)
      .logDestinationType(logDestinationType.orNull)
      .keyPrefix(keyPrefix.orNull)
      .build()
}
