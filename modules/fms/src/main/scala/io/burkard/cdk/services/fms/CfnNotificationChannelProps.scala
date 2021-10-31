package io.burkard.cdk.services.fms

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNotificationChannelProps {

  def apply(
    snsRoleName: Option[String] = None,
    snsTopicArn: Option[String] = None
  ): software.amazon.awscdk.services.fms.CfnNotificationChannelProps =
    (new software.amazon.awscdk.services.fms.CfnNotificationChannelProps.Builder)
      .snsRoleName(snsRoleName.orNull)
      .snsTopicArn(snsTopicArn.orNull)
      .build()
}
