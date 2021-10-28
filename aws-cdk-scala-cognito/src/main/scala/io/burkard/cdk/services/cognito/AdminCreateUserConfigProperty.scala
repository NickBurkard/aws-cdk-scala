package io.burkard.cdk.services.cognito

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AdminCreateUserConfigProperty {

  def apply(
    unusedAccountValidityDays: Option[Number] = None,
    allowAdminCreateUserOnly: Option[Boolean] = None,
    inviteMessageTemplate: Option[software.amazon.awscdk.services.cognito.CfnUserPool.InviteMessageTemplateProperty] = None
  ): software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty =
    (new software.amazon.awscdk.services.cognito.CfnUserPool.AdminCreateUserConfigProperty.Builder)
      .unusedAccountValidityDays(unusedAccountValidityDays.orNull)
      .allowAdminCreateUserOnly(allowAdminCreateUserOnly.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .inviteMessageTemplate(inviteMessageTemplate.orNull)
      .build()
}
