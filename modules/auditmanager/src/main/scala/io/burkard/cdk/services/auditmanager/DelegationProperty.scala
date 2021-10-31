package io.burkard.cdk.services.auditmanager

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DelegationProperty {

  def apply(
    assessmentId: Option[String] = None,
    lastUpdated: Option[Number] = None,
    assessmentName: Option[String] = None,
    id: Option[String] = None,
    createdBy: Option[String] = None,
    roleType: Option[String] = None,
    controlSetId: Option[String] = None,
    creationTime: Option[Number] = None,
    roleArn: Option[String] = None,
    status: Option[String] = None,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.auditmanager.CfnAssessment.DelegationProperty =
    (new software.amazon.awscdk.services.auditmanager.CfnAssessment.DelegationProperty.Builder)
      .assessmentId(assessmentId.orNull)
      .lastUpdated(lastUpdated.orNull)
      .assessmentName(assessmentName.orNull)
      .id(id.orNull)
      .createdBy(createdBy.orNull)
      .roleType(roleType.orNull)
      .controlSetId(controlSetId.orNull)
      .creationTime(creationTime.orNull)
      .roleArn(roleArn.orNull)
      .status(status.orNull)
      .comment(comment.orNull)
      .build()
}
