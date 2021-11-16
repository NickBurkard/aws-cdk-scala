package io.burkard.cdk.services.s3

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccessPointProps {

  def apply(
    bucket: String,
    name: Option[String] = None,
    policyStatus: Option[AnyRef] = None,
    vpcConfiguration: Option[software.amazon.awscdk.services.s3.CfnAccessPoint.VpcConfigurationProperty] = None,
    policy: Option[AnyRef] = None,
    publicAccessBlockConfiguration: Option[software.amazon.awscdk.services.s3.CfnAccessPoint.PublicAccessBlockConfigurationProperty] = None
  ): software.amazon.awscdk.services.s3.CfnAccessPointProps =
    (new software.amazon.awscdk.services.s3.CfnAccessPointProps.Builder)
      .bucket(bucket)
      .name(name.orNull)
      .policyStatus(policyStatus.orNull)
      .vpcConfiguration(vpcConfiguration.orNull)
      .policy(policy.orNull)
      .publicAccessBlockConfiguration(publicAccessBlockConfiguration.orNull)
      .build()
}
