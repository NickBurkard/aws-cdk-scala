package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FlowLogDestinationConfig {

  def apply(
    logDestinationType: software.amazon.awscdk.services.ec2.FlowLogDestinationType,
    logGroup: Option[software.amazon.awscdk.services.logs.ILogGroup] = None,
    s3Bucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    iamRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    keyPrefix: Option[String] = None
  ): software.amazon.awscdk.services.ec2.FlowLogDestinationConfig =
    (new software.amazon.awscdk.services.ec2.FlowLogDestinationConfig.Builder)
      .logDestinationType(logDestinationType)
      .logGroup(logGroup.orNull)
      .s3Bucket(s3Bucket.orNull)
      .iamRole(iamRole.orNull)
      .keyPrefix(keyPrefix.orNull)
      .build()
}
