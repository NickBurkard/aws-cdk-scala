package io.burkard.cdk.services.inspector

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAssessmentTemplate {

  def apply(
    internalResourceId: String,
    assessmentTemplateName: Option[String] = None,
    durationInSeconds: Option[Number] = None,
    assessmentTargetArn: Option[String] = None,
    rulesPackageArns: Option[List[String]] = None,
    userAttributesForFindings: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.inspector.CfnAssessmentTemplate =
    software.amazon.awscdk.services.inspector.CfnAssessmentTemplate.Builder
      .create(stackCtx, internalResourceId)
      .assessmentTemplateName(assessmentTemplateName.orNull)
      .durationInSeconds(durationInSeconds.orNull)
      .assessmentTargetArn(assessmentTargetArn.orNull)
      .rulesPackageArns(rulesPackageArns.map(_.asJava).orNull)
      .userAttributesForFindings(userAttributesForFindings.map(_.asJava).orNull)
      .build()
}
