package io.burkard.cdk.services.inspector

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAssessmentTemplateProps {

  def apply(
    durationInSeconds: Number,
    assessmentTargetArn: String,
    rulesPackageArns: List[String],
    assessmentTemplateName: Option[String] = None,
    userAttributesForFindings: Option[List[_]] = None
  ): software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps =
    (new software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps.Builder)
      .durationInSeconds(durationInSeconds)
      .assessmentTargetArn(assessmentTargetArn)
      .rulesPackageArns(rulesPackageArns.asJava)
      .assessmentTemplateName(assessmentTemplateName.orNull)
      .userAttributesForFindings(userAttributesForFindings.map(_.asJava).orNull)
      .build()
}
