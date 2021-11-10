package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLogging {

  def apply(
    internalResourceId: String,
    accountId: Option[String] = None,
    defaultLogLevel: Option[String] = None,
    roleArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnLogging =
    software.amazon.awscdk.services.iot.CfnLogging.Builder
      .create(stackCtx, internalResourceId)
      .accountId(accountId.orNull)
      .defaultLogLevel(defaultLogLevel.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
