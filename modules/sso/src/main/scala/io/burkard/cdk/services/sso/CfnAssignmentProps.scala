package io.burkard.cdk.services.sso

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAssignmentProps {

  def apply(
    principalId: String,
    targetType: String,
    instanceArn: String,
    principalType: String,
    targetId: String,
    permissionSetArn: String
  ): software.amazon.awscdk.services.sso.CfnAssignmentProps =
    (new software.amazon.awscdk.services.sso.CfnAssignmentProps.Builder)
      .principalId(principalId)
      .targetType(targetType)
      .instanceArn(instanceArn)
      .principalType(principalType)
      .targetId(targetId)
      .permissionSetArn(permissionSetArn)
      .build()
}
