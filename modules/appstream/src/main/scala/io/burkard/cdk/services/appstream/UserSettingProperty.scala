package io.burkard.cdk.services.appstream

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object UserSettingProperty {

  def apply(
    permission: String,
    action: String
  ): software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty =
    (new software.amazon.awscdk.services.appstream.CfnStack.UserSettingProperty.Builder)
      .permission(permission)
      .action(action)
      .build()
}
