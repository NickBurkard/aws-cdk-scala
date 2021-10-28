package io.burkard.cdk.services.inspector

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAssessmentTarget {

  def apply(
    internalResourceId: String,
    resourceGroupArn: Option[String] = None,
    assessmentTargetName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.inspector.CfnAssessmentTarget =
    software.amazon.awscdk.services.inspector.CfnAssessmentTarget.Builder
      .create(stackCtx, internalResourceId)
      .resourceGroupArn(resourceGroupArn.orNull)
      .assessmentTargetName(assessmentTargetName.orNull)
      .build()
}
