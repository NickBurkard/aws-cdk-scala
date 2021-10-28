package io.burkard.cdk.services.pinpoint

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnEmailChannel {

  def apply(
    internalResourceId: String,
    configurationSet: Option[String] = None,
    roleArn: Option[String] = None,
    fromAddress: Option[String] = None,
    identity: Option[String] = None,
    applicationId: Option[String] = None,
    enabled: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.pinpoint.CfnEmailChannel =
    software.amazon.awscdk.services.pinpoint.CfnEmailChannel.Builder
      .create(stackCtx, internalResourceId)
      .configurationSet(configurationSet.orNull)
      .roleArn(roleArn.orNull)
      .fromAddress(fromAddress.orNull)
      .identity(identity.orNull)
      .applicationId(applicationId.orNull)
      .enabled(enabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
