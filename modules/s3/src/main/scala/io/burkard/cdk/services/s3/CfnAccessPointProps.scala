package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccessPointProps {

  def apply(
    name: Option[String] = None,
    policyStatus: Option[AnyRef] = None,
    vpcConfiguration: Option[software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty] = None,
    bucket: Option[String] = None,
    policy: Option[AnyRef] = None,
    publicAccessBlockConfiguration: Option[software.amazon.awscdk.services.s3.CfnAccessPoint.PublicAccessBlockConfigurationProperty] = None
  ): software.amazon.awscdk.services.s3.CfnAccessPointProps =
    (new software.amazon.awscdk.services.s3.CfnAccessPointProps.Builder)
      .name(name.orNull)
      .policyStatus(policyStatus.orNull)
      .vpcConfiguration(vpcConfiguration.orNull)
      .bucket(bucket.orNull)
      .policy(policy.orNull)
      .publicAccessBlockConfiguration(publicAccessBlockConfiguration.orNull)
      .build()
}
