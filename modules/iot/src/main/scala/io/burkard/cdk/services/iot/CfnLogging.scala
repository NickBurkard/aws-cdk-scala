package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLogging {

  def apply(
    internalResourceId: String,
    accountId: String,
    defaultLogLevel: String,
    roleArn: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnLogging =
    software.amazon.awscdk.services.iot.CfnLogging.Builder
      .create(stackCtx, internalResourceId)
      .accountId(accountId)
      .defaultLogLevel(defaultLogLevel)
      .roleArn(roleArn)
      .build()
}
