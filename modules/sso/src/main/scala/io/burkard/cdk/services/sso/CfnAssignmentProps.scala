package io.burkard.cdk.services.sso

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAssignmentProps {

  def apply(
    principalId: Option[String] = None,
    targetType: Option[String] = None,
    instanceArn: Option[String] = None,
    principalType: Option[String] = None,
    targetId: Option[String] = None,
    permissionSetArn: Option[String] = None
  ): software.amazon.awscdk.services.sso.CfnAssignmentProps =
    (new software.amazon.awscdk.services.sso.CfnAssignmentProps.Builder)
      .principalId(principalId.orNull)
      .targetType(targetType.orNull)
      .instanceArn(instanceArn.orNull)
      .principalType(principalType.orNull)
      .targetId(targetId.orNull)
      .permissionSetArn(permissionSetArn.orNull)
      .build()
}
