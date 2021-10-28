package io.burkard.cdk.services.inspector

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAssessmentTemplateProps {

  def apply(
    assessmentTemplateName: Option[String] = None,
    durationInSeconds: Option[Number] = None,
    assessmentTargetArn: Option[String] = None,
    rulesPackageArns: Option[List[String]] = None,
    userAttributesForFindings: Option[List[_]] = None
  ): software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps =
    (new software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps.Builder)
      .assessmentTemplateName(assessmentTemplateName.orNull)
      .durationInSeconds(durationInSeconds.orNull)
      .assessmentTargetArn(assessmentTargetArn.orNull)
      .rulesPackageArns(rulesPackageArns.map(_.asJava).orNull)
      .userAttributesForFindings(userAttributesForFindings.map(_.asJava).orNull)
      .build()
}
