package io.burkard.cdk.services.s3outposts

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccessPointProps {

  def apply(
    name: String,
    vpcConfiguration: software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty,
    bucket: String,
    policy: Option[AnyRef] = None
  ): software.amazon.awscdk.services.s3outposts.CfnAccessPointProps =
    (new software.amazon.awscdk.services.s3outposts.CfnAccessPointProps.Builder)
      .name(name)
      .vpcConfiguration(vpcConfiguration)
      .bucket(bucket)
      .policy(policy.orNull)
      .build()
}
