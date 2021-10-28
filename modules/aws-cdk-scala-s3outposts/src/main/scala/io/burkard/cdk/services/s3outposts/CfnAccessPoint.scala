package io.burkard.cdk.services.s3outposts

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAccessPoint {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    vpcConfiguration: Option[software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty] = None,
    bucket: Option[String] = None,
    policy: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3outposts.CfnAccessPoint =
    software.amazon.awscdk.services.s3outposts.CfnAccessPoint.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .vpcConfiguration(vpcConfiguration.orNull)
      .bucket(bucket.orNull)
      .policy(policy.orNull)
      .build()
}
