package io.burkard.cdk.services.inspector

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAssessmentTemplate {

  def apply(
    internalResourceId: String,
    durationInSeconds: Number,
    assessmentTargetArn: String,
    rulesPackageArns: List[String],
    assessmentTemplateName: Option[String] = None,
    userAttributesForFindings: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.inspector.CfnAssessmentTemplate =
    software.amazon.awscdk.services.inspector.CfnAssessmentTemplate.Builder
      .create(stackCtx, internalResourceId)
      .durationInSeconds(durationInSeconds)
      .assessmentTargetArn(assessmentTargetArn)
      .rulesPackageArns(rulesPackageArns.asJava)
      .assessmentTemplateName(assessmentTemplateName.orNull)
      .userAttributesForFindings(userAttributesForFindings.map(_.asJava).orNull)
      .build()
}
