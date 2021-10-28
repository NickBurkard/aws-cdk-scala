package io.burkard.cdk.services.inspector

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
