package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLoggingProps {

  def apply(
    accountId: String,
    defaultLogLevel: String,
    roleArn: String
  ): software.amazon.awscdk.services.iot.CfnLoggingProps =
    (new software.amazon.awscdk.services.iot.CfnLoggingProps.Builder)
      .accountId(accountId)
      .defaultLogLevel(defaultLogLevel)
      .roleArn(roleArn)
      .build()
}
