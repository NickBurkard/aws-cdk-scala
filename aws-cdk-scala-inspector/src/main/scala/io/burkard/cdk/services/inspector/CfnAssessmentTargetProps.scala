package io.burkard.cdk.services.inspector

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAssessmentTargetProps {

  def apply(
    resourceGroupArn: Option[String] = None,
    assessmentTargetName: Option[String] = None
  ): software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps =
    (new software.amazon.awscdk.services.inspector.CfnAssessmentTargetProps.Builder)
      .resourceGroupArn(resourceGroupArn.orNull)
      .assessmentTargetName(assessmentTargetName.orNull)
      .build()
}
