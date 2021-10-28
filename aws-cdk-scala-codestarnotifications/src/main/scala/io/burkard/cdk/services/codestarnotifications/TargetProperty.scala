package io.burkard.cdk.services.codestarnotifications

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TargetProperty {

  def apply(
    targetAddress: Option[String] = None,
    targetType: Option[String] = None
  ): software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.TargetProperty =
    (new software.amazon.awscdk.services.codestarnotifications.CfnNotificationRule.TargetProperty.Builder)
      .targetAddress(targetAddress.orNull)
      .targetType(targetType.orNull)
      .build()
}
