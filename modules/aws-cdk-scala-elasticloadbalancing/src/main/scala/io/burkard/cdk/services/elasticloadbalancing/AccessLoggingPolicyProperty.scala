package io.burkard.cdk.services.elasticloadbalancing

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AccessLoggingPolicyProperty {

  def apply(
    s3BucketPrefix: Option[String] = None,
    emitInterval: Option[Number] = None,
    enabled: Option[Boolean] = None,
    s3BucketName: Option[String] = None
  ): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty =
    (new software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty.Builder)
      .s3BucketPrefix(s3BucketPrefix.orNull)
      .emitInterval(emitInterval.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .s3BucketName(s3BucketName.orNull)
      .build()
}
