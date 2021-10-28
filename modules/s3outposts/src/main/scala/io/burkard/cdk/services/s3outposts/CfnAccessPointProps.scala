package io.burkard.cdk.services.s3outposts

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAccessPointProps {

  def apply(
    name: Option[String] = None,
    vpcConfiguration: Option[software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty] = None,
    bucket: Option[String] = None,
    policy: Option[AnyRef] = None
  ): software.amazon.awscdk.services.s3outposts.CfnAccessPointProps =
    (new software.amazon.awscdk.services.s3outposts.CfnAccessPointProps.Builder)
      .name(name.orNull)
      .vpcConfiguration(vpcConfiguration.orNull)
      .bucket(bucket.orNull)
      .policy(policy.orNull)
      .build()
}
