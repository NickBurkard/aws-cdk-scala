package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEmailChannelProps {

  def apply(
    configurationSet: Option[String] = None,
    roleArn: Option[String] = None,
    fromAddress: Option[String] = None,
    identity: Option[String] = None,
    applicationId: Option[String] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps =
    (new software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps.Builder)
      .configurationSet(configurationSet.orNull)
      .roleArn(roleArn.orNull)
      .fromAddress(fromAddress.orNull)
      .identity(identity.orNull)
      .applicationId(applicationId.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
