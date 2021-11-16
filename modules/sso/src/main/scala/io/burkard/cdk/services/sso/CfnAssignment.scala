package io.burkard.cdk.services.sso

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAssignment {

  def apply(
    internalResourceId: String,
    principalId: String,
    targetType: String,
    instanceArn: String,
    principalType: String,
    targetId: String,
    permissionSetArn: String
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sso.CfnAssignment =
    software.amazon.awscdk.services.sso.CfnAssignment.Builder
      .create(stackCtx, internalResourceId)
      .principalId(principalId)
      .targetType(targetType)
      .instanceArn(instanceArn)
      .principalType(principalType)
      .targetId(targetId)
      .permissionSetArn(permissionSetArn)
      .build()
}
