package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object UserSettingProperty {

  def apply(
    permission: Option[String] = None,
    action: Option[String] = None
  ): software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty =
    (new software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty.Builder)
      .permission(permission.orNull)
      .action(action.orNull)
      .build()
}
