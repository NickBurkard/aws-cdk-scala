package io.burkard.cdk.services.logs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LogSubscriptionDestinationConfig {

  def apply(
    arn: Option[String] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None
  ): software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig =
    (new software.amazon.awscdk.services.logs.LogSubscriptionDestinationConfig.Builder)
      .arn(arn.orNull)
      .role(role.orNull)
      .build()
}
