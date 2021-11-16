package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnEmailChannel {

  def apply(
    internalResourceId: String,
    fromAddress: String,
    identity: String,
    applicationId: String,
    configurationSet: Option[String] = None,
    roleArn: Option[String] = None,
    enabled: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpoint.CfnEmailChannel =
    software.amazon.awscdk.services.pinpoint.CfnEmailChannel.Builder
      .create(stackCtx, internalResourceId)
      .fromAddress(fromAddress)
      .identity(identity)
      .applicationId(applicationId)
      .configurationSet(configurationSet.orNull)
      .roleArn(roleArn.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
