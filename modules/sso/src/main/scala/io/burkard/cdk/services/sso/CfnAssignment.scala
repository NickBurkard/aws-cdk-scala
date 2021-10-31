package io.burkard.cdk.services.sso

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAssignment {

  def apply(
    internalResourceId: String,
    principalId: Option[String] = None,
    targetType: Option[String] = None,
    instanceArn: Option[String] = None,
    principalType: Option[String] = None,
    targetId: Option[String] = None,
    permissionSetArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sso.CfnAssignment =
    software.amazon.awscdk.services.sso.CfnAssignment.Builder
      .create(stackCtx, internalResourceId)
      .principalId(principalId.orNull)
      .targetType(targetType.orNull)
      .instanceArn(instanceArn.orNull)
      .principalType(principalType.orNull)
      .targetId(targetId.orNull)
      .permissionSetArn(permissionSetArn.orNull)
      .build()
}
