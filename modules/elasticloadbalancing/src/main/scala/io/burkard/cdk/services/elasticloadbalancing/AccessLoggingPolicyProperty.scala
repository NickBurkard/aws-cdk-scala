package io.burkard.cdk.services.elasticloadbalancing

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AccessLoggingPolicyProperty {

  def apply(
    enabled: Boolean,
    s3BucketName: String,
    s3BucketPrefix: Option[String] = None,
    emitInterval: Option[Number] = None
  ): software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty =
    (new software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer.AccessLoggingPolicyProperty.Builder)
      .enabled(enabled)
      .s3BucketName(s3BucketName)
      .s3BucketPrefix(s3BucketPrefix.orNull)
      .emitInterval(emitInterval.orNull)
      .build()
}
