package io.burkard.cdk.services.s3outposts

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAccessPoint {

  def apply(
    internalResourceId: String,
    name: String,
    vpcConfiguration: software.amazon.awscdk.services.s3outposts.CfnAccessPoint.VpcConfigurationProperty,
    bucket: String,
    policy: Option[AnyRef] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3outposts.CfnAccessPoint =
    software.amazon.awscdk.services.s3outposts.CfnAccessPoint.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .vpcConfiguration(vpcConfiguration)
      .bucket(bucket)
      .policy(policy.orNull)
      .build()
}
