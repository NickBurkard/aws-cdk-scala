package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEmailChannelProps {

  def apply(
    fromAddress: String,
    identity: String,
    applicationId: String,
    configurationSet: Option[String] = None,
    roleArn: Option[String] = None,
    enabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps =
    (new software.amazon.awscdk.services.pinpoint.CfnEmailChannelProps.Builder)
      .fromAddress(fromAddress)
      .identity(identity)
      .applicationId(applicationId)
      .configurationSet(configurationSet.orNull)
      .roleArn(roleArn.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
