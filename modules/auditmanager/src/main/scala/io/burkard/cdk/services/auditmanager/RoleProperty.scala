package io.burkard.cdk.services.auditmanager

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RoleProperty {

  def apply(
    roleArn: Option[String] = None,
    roleType: Option[String] = None
  ): software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty =
    (new software.amazon.awscdk.services.auditmanager.CfnAssessment.RoleProperty.Builder)
      .roleArn(roleArn.orNull)
      .roleType(roleType.orNull)
      .build()
}
