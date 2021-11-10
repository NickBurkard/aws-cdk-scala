package io.burkard.cdk.services.iot

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLoggingProps {

  def apply(
    accountId: Option[String] = None,
    defaultLogLevel: Option[String] = None,
    roleArn: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnLoggingProps =
    (new software.amazon.awscdk.services.iot.CfnLoggingProps.Builder)
      .accountId(accountId.orNull)
      .defaultLogLevel(defaultLogLevel.orNull)
      .roleArn(roleArn.orNull)
      .build()
}
