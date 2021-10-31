package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccessPoint {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    policyStatus: Option[AnyRef] = None,
    vpcConfiguration: Option[software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty] = None,
    bucket: Option[String] = None,
    policy: Option[AnyRef] = None,
    publicAccessBlockConfiguration: Option[software.amazon.awscdk.services.s3.CfnAccessPoint.PublicAccessBlockConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3.CfnAccessPoint =
    software.amazon.awscdk.services.s3.CfnAccessPoint.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .policyStatus(policyStatus.orNull)
      .vpcConfiguration(vpcConfiguration.orNull)
      .bucket(bucket.orNull)
      .policy(policy.orNull)
      .publicAccessBlockConfiguration(publicAccessBlockConfiguration.orNull)
      .build()
}
